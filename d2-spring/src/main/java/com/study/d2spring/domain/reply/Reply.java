package com.study.d2spring.domain.reply;

import com.study.d2spring.domain.post.Post;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Table(name = "d2_post_reply")
public class Reply {

    @Id
    @GeneratedValue
    @Column(name = "reply_id")
    private Long id;

    private String text;
    private String replyer;
    private LocalDateTime replyAt;
    private int goodCount;
    private int badCount;
    private String comments;

    @ManyToOne(fetch = FetchType.LAZY)
    private List<Post> posts = new ArrayList<>();
}
