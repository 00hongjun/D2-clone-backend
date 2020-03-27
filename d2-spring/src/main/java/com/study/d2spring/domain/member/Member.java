package com.study.d2spring.domain.member;

import com.study.d2spring.domain.image.Image;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "d2_member")
@Entity
public class Member {

    @Id
    @Column(name = "member_id")
    private String id;
    @Column(name = "member_name")
    private String name;
    @Column(name = "member_email")
    private String email;
    @Column(name = "member_department")
    @Enumerated(EnumType.STRING)
    private department department;
    @Column(name = "member_position")
    private String position;
    @Column(name = "member_profile")
    private String profile;
    @Column(name = "member_image")
    private String image;
    @OneToMany(mappedBy = "member")
    private List<PostAndMember> postAndMember;
    @OneToOne
    private Image imageEntity;
}
