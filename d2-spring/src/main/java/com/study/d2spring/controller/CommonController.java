package com.study.d2spring.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@Api(value = "CommonController", description = "common api controller")
public class CommonController {

    //API 정의
    //전체 게시물 (기술 게시물 + 뉴스 게시물)리
    @ApiOperation(value = "All Post List API")
    @GetMapping(value = "/")
    public String home(){
        return "home";
    }

    //카테고리 1 (기술 게시물)
    @ApiOperation(value = "Category 1 (Helloworld) Post List API")
    @GetMapping(value = "/helloworld")
    public String helloworld(){
        return "HelloWorld";
    }

    //카테고리 2 (뉴스 게시물)
    @ApiOperation(value = "Category 2 (news) Post List API")
    @GetMapping(value = "/news")
    public String news(){
        return "news";
    }

    //참여 프로그램
    @ApiOperation(value = "Program URL List API")
    @GetMapping(value = "/program")
    public String program(){
        return "program";
    }

    //일정 및 히스토리
    @ApiOperation(value = "Schedule And History List API")
    @GetMapping(value = "/about")
    public String about(){
        return "about";
    }
}
