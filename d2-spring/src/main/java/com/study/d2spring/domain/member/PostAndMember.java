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

    @Id
    @GeneratedValue
    @Column(name = "post_member_id")
    private long id;
    @Column(name = "post_member_post_id")
    private long postId;
    @Column(name = "post_member_member_id")
    private long memberId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;
}
