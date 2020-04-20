package com.study.d2spring.view.post;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.study.d2spring.domain.tag.Tag;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class KeywordList {
    private String keyword;
    private String url;

    public KeywordList(Tag tag) {
        this.keyword = tag.getName();
        this.url = tag.getUrl();
    }
}
