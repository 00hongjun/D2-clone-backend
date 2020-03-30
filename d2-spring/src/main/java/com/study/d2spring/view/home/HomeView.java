package com.study.d2spring.view.home;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class HomeView {

    private String url;
    private String test1;
    private String test2;

    public HomeView() {
        this.test1 = "hello";
    }

    public HomeView(String url) {
        this.url = url;
        this.test1 = "hello";
    }
}
