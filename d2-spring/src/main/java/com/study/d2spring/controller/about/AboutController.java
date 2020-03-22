package com.study.d2spring.controller.about;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Api(value = "AboutController", description = "about api controller")
public class AboutController {
    //일정 및 히스토리
    @ApiOperation(value = "Schedule And History List API")
    @GetMapping(value = "/about")
    public String about(){
        return "about";
    }
}
