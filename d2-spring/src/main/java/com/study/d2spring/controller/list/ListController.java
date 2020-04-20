package com.study.d2spring.controller.list;

import com.study.d2spring.domain.post.Post;
import com.study.d2spring.domain.tag.Tag;
import com.study.d2spring.service.post.PostService;
import com.study.d2spring.service.tag.TagService;
import com.study.d2spring.view.home.HomeView;
import com.study.d2spring.view.post.KeywordList;
import com.study.d2spring.view.post.PostList;
import com.study.d2spring.view.post.TopList;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * api입장에서 메뉴(helloword, d2 news, d2 program, about d2)에 대한
 * get 요청은 사실상 글 목록 조회임 -> ListController
 */
@RequiredArgsConstructor
@Api(value = "ListController", description = "list api controller")
@RestController
public class ListController {

    private final PostService postService;
    private final TagService tagService;

    /**
     * https://d2.naver.com/api/v1/top5
     */
    @ApiOperation(value = "View Count Top5 List API")
    @GetMapping("/top5")
    public List<TopList> top5() {
        List<Post> all = postService.findTop5();
        List<TopList> top = new ArrayList<>();

        for (int i = 0; i < all.size(); i++) {
            top.add(new TopList(i, all.get(i)));
        }
        return top;
    }

    /**
     * https://d2.naver.com/api/v1/keyword
     */
    @ApiOperation(value = "Top Keyword List API")
    @GetMapping("/keyworld")
    public List<KeywordList> topKeyword() {
        List<Tag> tags = tagService.findTagTop5();

        List<KeywordList> keywordLists = new ArrayList<>();

        for (int i = 0; i < tags.size(); i++) {
            keywordLists.add(new KeywordList(tags.get(i)));
        }
        return keywordLists;
    }

    /**
     * https://d2.naver.com/search?keyword=AAA
     */
    @ApiOperation(value = "Search List API")
    @GetMapping("/search")
    public PostList search(String keyword) {
        List<Post> all = postService.search(keyword);

        return new PostList(all);
    }

    /**
     * https://d2.naver.com/home
     */
    @ApiOperation(value = "All (Home) Post List API")
    @GetMapping("/home")
    public PostList home() {
        List<Post> homePost = postService.findPostAll();

        return new PostList(homePost);
    }

    /**
     * https://d2.naver.com/helloworld
     */
    @ApiOperation(value = "Category 2 (Helloworld) Post List API")
    @GetMapping("/helloworld")
    public PostList helloworld() {
        List<Post> helloworldPost = postService.findPostAllByCategory(new Long(2));

        return new PostList(helloworldPost);
    }

    /**
     * https://d2.naver.com/news
     */
    @ApiOperation(value = "Category 3 (news) Post List API")
    @GetMapping("/news")
    public PostList news() {
        List<Post> newsPost = postService.findPostAllByCategory(new Long(3));

        return new PostList(newsPost);
    }
}
