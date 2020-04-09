package com.study.d2spring.domain.post;


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

    private String image;

    private LocalDateTime publicationDate;

    private int viewCount;

    private String socialUrl;

    @OneToMany(mappedBy = "post", fetch = FetchType.LAZY)
    private List<Posting> posting = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)//xtoOne 에 대한 지연로딩 설정
    @JoinColumn(name = "category_id")//외래키 (조인키가 category_id 가 됨)
    private Category category;

    @ManyToMany(mappedBy = "posts")
    private List<Tag> tags = new ArrayList<>();

    @OneToMany(mappedBy = "post")
    private List<Reply> replies = new ArrayList<>();


    //연관관계 메소드
    public void setCategory(Category category) {
        this.category = category;
        category.getPosts().add(this);
    }

    public void addPosting(Posting posting) {
        this.posting.add(posting);
        posting.setPost(this);
    }


    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", image=" + image +
                ", publication_date=" + publicationDate +
                ", view_count=" + viewCount +
                ", social_url='" + socialUrl + '\'' +
                ", category=" + category +
                ", tags=" + tags +
                ", replies=" + replies +
                '}';
    }
}
