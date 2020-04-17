package com.study.d2spring.view.about;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.study.d2spring.domain.about.History;
import com.study.d2spring.domain.about.Schedule;
import com.study.d2spring.domain.post.Post;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class AboutView {

    private List<D2History> historyList = new ArrayList<>();

    private List<D2Schedule> scheduleList = new ArrayList<>();

    @Getter
    @Setter
    @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    class D2Schedule {
        private Long id;
        private String title;
        private String comment;
        private String schedule;
        private String url;
        private String image;
    }


    @Getter
    @Setter
    @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    class D2History {
        private Long id;
        private String title;
        private String date;
        private String comment;
        private String url;
    }

    public AboutView(List<History> histories, List<Schedule> schedules) {

        setHisory(histories);
        setSchedule(schedules);

    }

    private void setSchedule (List<Schedule> schedules){
        for (Schedule s: schedules
        ) {
            D2Schedule schedule = new D2Schedule();

            schedule.id = s.getId();
            schedule.title = s.getTitle();
            schedule.comment = s.getComment();
            schedule.schedule = s.getSchedule();
            schedule.url = s.getUrl();
            schedule.image = s.getImage();

            this.scheduleList.add(schedule);
        }
    }

    private void setHisory (List<History> histories){
        for (History h: histories
             ) {
            D2History history = new D2History();

            history.id = h.getId();
            history.comment = h.getComment();
            history.date = h.getDate();
            history.title = h.getTitle();
            history.url = h.getUrl();

            this.historyList.add(history);
        }
    }
}
