package com.study.d2spring.controller;

import com.study.d2spring.domain.TestEntity;
import com.study.d2spring.service.TestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequiredArgsConstructor
@Api(value = "TestController", description = "test api controller")
public class TestController {
    private final TestService testService;

    @ApiOperation(value = "Hateoas API")
    @GetMapping("/hateoas")
    public EntityModel<TestEntity> hateoas() {
        TestEntity test = new TestEntity();
        test.setName("TEST");

        testService.save(test);

        EntityModel<TestEntity> sampleEntityModel = new EntityModel<>(test);
        sampleEntityModel.add(linkTo(methodOn(TestController.class).hateoas()).withSelfRel());

        return sampleEntityModel;
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
