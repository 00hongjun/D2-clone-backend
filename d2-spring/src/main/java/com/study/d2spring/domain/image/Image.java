package com.study.d2spring.domain.image;

import com.study.d2spring.domain.post.Post;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "d2_image")
@Entity
public class Image {

    @Id
    @GeneratedValue
    @Column(name = "image_id")
    private long id;

    @Column(name = "image_path")
    private String path;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "image_post_id")
    private Post post;
}
