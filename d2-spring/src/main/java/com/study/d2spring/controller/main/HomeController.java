package com.study.d2spring.controller.main;

import com.study.d2spring.view.home.HomeView;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HomeController {

    /**
     * https://d2.naver.com/home
     */
    @ApiOperation(value = "All Post List API") //전체 게시물 (기술 게시물 + 뉴스 게시물)리
    @GetMapping(value = {"/", "/home"})
    public HomeView home() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        return new HomeView(request.getRequestURI());
    }
}
