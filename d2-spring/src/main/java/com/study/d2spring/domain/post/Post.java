package com.study.d2spring.domain.post;


import com.study.d2spring.domain.image.Image;
import com.study.d2spring.domain.member.Member;
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

    @Column(columnDefinition = "LONGTEXT")
    private String body;

    private LocalDateTime publication_date;

    private int view_count;

    private String social_url;

    @OneToMany(mappedBy = "post")
    private List<Posting> posting = new ArrayList<>();

    @OneToMany(mappedBy = "post")
    private List<Image> image;


    @ManyToOne(fetch = FetchType.LAZY)//xtoOne 에 대한 지연로딩 설정
    @JoinColumn(name = "category_id")//외래키 (조인키가 member_id 가 됨)
    private Category category;

    @ManyToMany(mappedBy = "posts")
    private List<Tag> tags = new ArrayList<>();

    @OneToMany(mappedBy = "post")
    private List<Reply> replies = new ArrayList<>();

    //연관관계 메소드
    public void setCategory(Category category){
        this.category = category;
        category.getPosts().add(this);
    }

    public void addPosting(Posting posting){
        this.posting.add(posting);
        posting.setPost(this);
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", publication_date=" + publication_date +
                ", view_count=" + view_count +
                ", social_url='" + social_url + '\'' +
                "},"+
                this.category.toString();

    }
}
