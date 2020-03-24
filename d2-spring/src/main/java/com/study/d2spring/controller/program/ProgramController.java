package com.study.d2spring.controller.program;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Api(value = "ProgramController", description = "program api controller")
public class ProgramController {

    //참여 프로그램
    @ApiOperation(value = "Program URL List API")
    @GetMapping(value = "/program")
    public String program(){
        return "program";
    }

}
