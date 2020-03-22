package com.study.d2spring.domain.post;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Getter
@Table(name = "d2_post")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Post {


    @Id
    @GeneratedValue
    @Column(name = "post_id")
    private long id;
    private String postTitle;
    private String postBody;
    private LocalDateTime postPublicationDate;
    private int postViewCount;
    private long postcategory;
    private String postSocialUrl;

}
