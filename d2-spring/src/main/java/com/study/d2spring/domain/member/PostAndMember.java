package com.study.d2spring.domain.member;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "d2_post_member")
@Entity
public class PostAndMember {

    @GeneratedValue
    @Id
    @Column(name = "post_member_id")
    private String id;
    @Column(name = "post_member_post_id")
    private String postId;
    @Column(name = "post_member_member_id")
    private String memberId;
}
