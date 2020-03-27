package com.study.d2spring.domain.post;


import com.study.d2spring.domain.image.Image;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "d2_post")
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

    //    @OneToOne(mappedBy = "postId")
//    private PostAndMember postAndMember;
    @OneToMany(mappedBy = "post")
    private List<Image> image;
    @OneToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
