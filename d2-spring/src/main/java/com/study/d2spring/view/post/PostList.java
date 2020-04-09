package com.study.d2spring.view.post;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.study.d2spring.domain.post.Post;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class PostList {

    private List<Content> content;

    public PostList(List<Post> all) {
        int size = all.size();
        List<Content> contents = new ArrayList<>();

        for (Post post : all) {
            Content content = new Content();
            content.setPostTitle(post.getTitle());
            content.setPostImage(post.getImage());
            content.setPostHtml(post.getBody());
            content.setPostPublishedAt(post.getPublicationDate().toString());
            content.setUrl(post.getSocialUrl());
            content.setViewCount(post.getViewCount());
            content.setAuthor("");
            content.setLinks(new ArrayList<>());
            contents.add(content);
        }
        this.content = contents;
    }

    @Getter
    @Setter
    @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    class Content {
        private String postTitle;
        private String postImage;
        private String postHtml;
        private String postPublishedAt;
        private String url;
        private int viewCount;
        private String author;
        private List<String> links;
    }
}
