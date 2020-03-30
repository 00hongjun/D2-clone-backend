package com.study.d2spring.domain.member;

import com.study.d2spring.domain.image.Image;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "d2_member")
@Entity
public class Member {

    @Id
    @Column(name = "member_id")
    private String id;

    private String name;

    private String email;

    @Enumerated(EnumType.STRING)
    private department department;

    private String profile;

    @OneToMany(mappedBy = "member")
    private List<Posting> posting = new ArrayList<>();

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_image_id")
    private Image Image;
}
