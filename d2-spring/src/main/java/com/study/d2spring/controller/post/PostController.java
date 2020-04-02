package com.study.d2spring.controller.post;

import com.study.d2spring.domain.member.Member;
import com.study.d2spring.service.member.MemberService;
import com.study.d2spring.view.home.HomeView;
import com.study.d2spring.domain.post.Post;
import com.study.d2spring.service.post.PostService;
import com.study.d2spring.view.post.PostView;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.swing.plaf.metal.MetalMenuBarUI;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Api(value = "PostController", description = "post api controller")
public class PostController {
    private final PostService postService;
    private final MemberService memberService;

    //카테고리 1 (기술 게시물)
    @ApiOperation(value = "Category 1 (Helloworld)  Post List API")
    @GetMapping("/helloworld/{id}")
    public PostView helloWorld(@PathVariable long id) {

        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();

        Post post = postService.findPostId(id);

        System.out.println(post.toString());

        List<Member> members = memberService.findAllByPostId(id);
//
        for (int i = 0; i < members.size() ; i++) {
            System.out.println(members.get(i).toString());
        }
//
        request.setAttribute("post", post);
        request.setAttribute("members", members);

        return new PostView(request);
    }

    @ApiOperation(value = "Category 2 (news) Post List API")
    @GetMapping("/news/{id}")
    public HomeView news(@PathVariable long id) {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        return new HomeView(request.getRequestURI());
    }
}
