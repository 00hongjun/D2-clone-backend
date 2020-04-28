package com.study.d2spring.controller.list;

import com.study.d2spring.domain.post.Post;
import com.study.d2spring.domain.tag.Tag;
import com.study.d2spring.service.post.PostService;
import com.study.d2spring.service.tag.TagService;
import com.study.d2spring.view.error.ErrorView;
import com.study.d2spring.view.post.KeywordList;
import com.study.d2spring.view.post.PostList;
import com.study.d2spring.view.post.TopList;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
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
    public Object top5() {
        try {
            List<Post> all = postService.findTop5();
            List<TopList> top = new ArrayList<>();

            for (int i = 0; i < all.size(); i++) {
                top.add(new TopList(i, all.get(i)));
            }
            return top;

        } catch (Exception e){
            return new ErrorView("ERST", e.getMessage());
        }
    }

    /**
     * https://d2.naver.com/api/v1/keyword
     */
    @ApiOperation(value = "Top Keyword List API")
    @GetMapping("/keyword")
    public Object topKeyword() {
        try {
            List<Tag> tags = tagService.findTagTop5();

            List<KeywordList> keywordLists = new ArrayList<>();

            for (int i = 0; i < tags.size(); i++) {
                keywordLists.add(new KeywordList(tags.get(i)));
            }
            return keywordLists;
        } catch (Exception e){
            return new ErrorView("ERST", e.getMessage());
        }
    }

    /**
     * https://d2.naver.com/search?keyword=AAA
     */
    @ApiOperation(value = "Search List API")
    @GetMapping("/search")
    public Object search(String keyword) {
        try {
            if ((keyword == "") || (keyword == null)) {
                return new ErrorView("ER03", "Search KeyWord Format Error");
            }

            List<Post> all = postService.search(keyword);

            return new PostList(all);
        } catch (Exception e){
            return new ErrorView("ERST", e.getMessage());
        }
    }

    /**
     * https://d2.naver.com/home
     */
    @ApiOperation(value = "All (Home) Post List API")
    @GetMapping("/home")
    public Object home() {
        try {
            List<Post> homePost = postService.findPostAll();

            return new PostList(homePost);
        } catch (Exception e){
            return new ErrorView("ERST", e.getMessage());
        }
    }

    /**
     * https://d2.naver.com/helloworld
     */
    @ApiOperation(value = "Category 2 (Helloworld) Post List API")
    @GetMapping("/helloworld")
    public Object helloworld() {
        try {
            List<Post> helloworldPost = postService.findPostAllByCategory(new Long(2));

            return new PostList(helloworldPost);
        } catch (Exception e){
            return new ErrorView("ERST", e.getMessage());
        }
    }

    /**
     * https://d2.naver.com/news
     */
    @ApiOperation(value = "Category 3 (news) Post List API")
    @GetMapping("/news")
    public Object news() {
        try {
            List<Post> newsPost = postService.findPostAllByCategory(new Long(3));

            return new PostList(newsPost);
        } catch (Exception e){
            return new ErrorView("ERST", e.getMessage());
        }
    }
}
