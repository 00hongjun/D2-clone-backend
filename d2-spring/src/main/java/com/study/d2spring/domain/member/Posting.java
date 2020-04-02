package com.study.d2spring.domain.member;

import com.study.d2spring.domain.post.Post;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "d2_posting")
@Entity
public class Posting {

    @Id
    @GeneratedValue
    @Column(name = "posting_id")
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "posting_post_id")
    private Post post;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "posting_member_id")
    private Member member;

    public void setPost(Post post) {
        this.post = post;
    }

    public void setMember(Member member) {
        this.member = member;
    }


    @Override
    public String toString() {
        return "Posting{" +
                "id=" + id +
                ", post=" + post.toString() +
//                ", member=" + member.toString() +
                '}';
    }
}
