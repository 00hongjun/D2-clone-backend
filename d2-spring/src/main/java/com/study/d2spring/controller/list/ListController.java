package com.study.d2spring.controller.list;

import com.study.d2spring.view.home.HomeView;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * api입장에서 메뉴(helloword, d2 news, d2 program, about d2)에 대한
 * get 요청은 사실상 글 목록 조회임 -> ListController
 */
@RequiredArgsConstructor
@Api(value = "ListController", description = "list api controller")
@RestController
public class ListController {

    /**
     * https://d2.naver.com/helloworld
     */
    @ApiOperation(value = "Category 1 (Helloworld) Post List API")
    @GetMapping("/helloworld")
    public HomeView helloSorld() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        return new HomeView(request.getRequestURI());
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

    /**
     * https://d2.naver.com/about
     */
    @ApiOperation(value = "Schedule And History List API")
    @GetMapping("/about")
    public HomeView about() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        return new HomeView(request.getRequestURI());
    }
}
