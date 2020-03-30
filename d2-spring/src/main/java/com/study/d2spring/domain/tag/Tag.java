package com.study.d2spring.domain.tag;

import com.study.d2spring.domain.post.Post;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@Getter
@Table(name = "d2_tag")
public class Tag {

    @Id @GeneratedValue
    @Column(name = "tag_id")
    private Long id;

    private String name;
    private String url;

    @OneToMany
    private List<Post> posts = new ArrayList<>();
}
