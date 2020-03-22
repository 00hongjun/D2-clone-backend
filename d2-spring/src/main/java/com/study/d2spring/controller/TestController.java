package com.study.d2spring.controller;

import com.study.d2spring.domain.TestEntity;
import com.study.d2spring.service.TestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Api(value = "TestController", description = "test api controller")
public class TestController {
    private final TestService testService;

    @GetMapping("/hello")
    public String home() {
        return "hello!";
    }

    @ApiOperation(value = "Test API")
    @GetMapping("/test")
    public String test() {
        TestEntity test = new TestEntity();
        test.setName("TEST");

        Long saveTestId = testService.save(test);

        return "insert test_id : "+saveTestId;
    }
}
