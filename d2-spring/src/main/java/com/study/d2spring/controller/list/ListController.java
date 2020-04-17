package com.study.d2spring.controller.list;

import com.study.d2spring.domain.post.Post;
import com.study.d2spring.service.post.PostService;
import com.study.d2spring.view.home.HomeView;
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

    /**
     * https://d2.naver.com/api/v1/top5
     */
    @ApiOperation(value = "Program URL List API")
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
     * https://d2.naver.com/search?keyword=AAA
     */
    @ApiOperation(value = "Program URL List API")
    @GetMapping("/search")
    public PostList search(String keyword) {
        List<Post> all = postService.search(keyword);

        return new PostList(all);
    }

    /**
     * https://d2.naver.com/api/v1/keywords
     * <p>
     * 미개발
     */
    @ApiOperation(value = "Program URL List API")
    @GetMapping("/keywords")
    public List<TopList> keywords() {
        List<Post> all = postService.findTop5();
        List<TopList> top = new ArrayList<>();

        for (int i = 0; i < all.size(); i++) {
            top.add(new TopList(i, all.get(i)));
        }
        return top;
    }

    /**
     * https://d2.naver.com/helloworld
     */
    @ApiOperation(value = "Category 1 (Helloworld) Post List API")
    @GetMapping("/helloworld")
    public PostList helloSorld() {
        List<Post> all = postService.findPostAll();

        return new PostList(all);
    }

    /**
     * https://d2.naver.com/news
     */
    @ApiOperation(value = "Category 2 (news) Post List API")
    @GetMapping("/news")
    public HomeView news() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        return new HomeView(request.getRequestURI());
    }

    /**
     * https://d2.naver.com/program
     */
    @ApiOperation(value = "Program URL List API")
    @GetMapping("/program")
    public HomeView program() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        return new HomeView(request.getRequestURI());
    }
}
