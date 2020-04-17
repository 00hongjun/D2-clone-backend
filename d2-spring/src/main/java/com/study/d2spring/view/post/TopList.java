package com.study.d2spring.view.post;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.study.d2spring.domain.post.Post;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class TopList {

    private int rank;
    private String postTitle;
    private String url;
    private String keyword;

    public TopList(int rank, Post post) {
        this.rank = rank;
        this.postTitle = post.getTitle();
        this.url =
                String.format("/%s/%d", post.getCategory().getName(), post.getId());
    }
}
