package com.study.d2spring.controller.about;

import com.study.d2spring.domain.about.History;
import com.study.d2spring.domain.about.Schedule;
import com.study.d2spring.service.about.AboutService;
import com.study.d2spring.view.about.AboutView;
import com.study.d2spring.view.error.ErrorView;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Api(value = "AboutController", description = "about api controller")
public class AboutController {
    private final AboutService aboutService;

    /**
     * https://d2.naver.com/about
     */
    @ApiOperation(value = "History And Schedule List API")
    @GetMapping("/about")
    public Object about() {
        try {
            List<History> histories = aboutService.findHistoryAll();

            List<Schedule> schedules = aboutService.findScheduleAll();

            return new AboutView(histories, schedules);
        } catch (Exception e){
            return new ErrorView("ERST", e.getMessage());
        }
    }
}
