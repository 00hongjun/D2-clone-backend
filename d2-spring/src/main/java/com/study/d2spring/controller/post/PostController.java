package com.study.d2spring.controller.post;

import com.study.d2spring.view.home.HomeView;
import com.study.d2spring.domain.post.Post;
import com.study.d2spring.service.post.PostService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Api(value = "PostController", description = "post api controller")
public class PostController {
    private final PostService postService;

    //카테고리 1 (기술 게시물)
    @ApiOperation(value = "Category 1 (Helloworld)  Post List API")
    @GetMapping("/helloworld/{id}")
    public HomeView helloWorld(@PathVariable long id) {

        List<Post> posts = postService.findAll();

        for (int i = 0; i < posts.size(); i++){
            System.out.println(posts.get(i).toString());
        }

        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        return new HomeView(request.getRequestURI());
    }

    @ApiOperation(value = "Category 2 (news) Post List API")
    @GetMapping("/news/{id}")
    public HomeView news(@PathVariable long id) {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        return new HomeView(request.getRequestURI());
    }
}
