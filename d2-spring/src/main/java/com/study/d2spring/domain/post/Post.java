package com.study.d2spring.domain.post;


import com.study.d2spring.domain.image.Image;
import com.study.d2spring.domain.member.Posting;
import com.study.d2spring.domain.reply.Reply;
import com.study.d2spring.domain.tag.Tag;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
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

    private String title;

    private String body;

    private LocalDateTime publicationDate;

    private int viewCount;

    private String socialUrl;

    @OneToMany(mappedBy = "post")
    private List<Posting> posting = new ArrayList<>();

    @OneToMany(mappedBy = "post")
    private List<Image> image;


    @ManyToOne(fetch = FetchType.LAZY)//xtoOne 에 대한 지연로딩 설정
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToMany(mappedBy = "posts")
    private List<Tag> tags = new ArrayList<>();

    @OneToMany(mappedBy = "post")
    private List<Reply> replies = new ArrayList<>();
}
