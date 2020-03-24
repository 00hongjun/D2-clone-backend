package com.study.d2spring.controller.post;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Api(value = "PostController", description = "post api controller")
public class PostController {

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
}
