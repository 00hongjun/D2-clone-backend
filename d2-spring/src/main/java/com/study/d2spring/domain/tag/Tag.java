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

    //JoinTable 필요함 (객체는 커넥션관계를 양쪽에서 갖질수 있지만
    //관계형 디비는 커넥션관계를 양쪽으로 가질 수 없어서 다대일, 일대다로 중간 테이블을 통해
    //양쪽으로 연결해줘야 양방향이 가능하다.
    //단, 딱 연결 상태로만 사용이 가능하고 필드 추가가 불가능하기에 실무에선 사용을 권장하지 않음.
    //JoinColums은 JoinTable에 존재하는 카테코리 테이블 연결 컬럼을 의미함.
    //InverseJoinColums은 tag 테이블과 연결할 JoinTable에 존재하는 컬럼을 의미함.
    @ManyToMany
    @JoinTable(name = "tag_post",
            joinColumns = @JoinColumn(name = "tag_id"),
            inverseJoinColumns = @JoinColumn(name = "post_id"))
    private List<Post> posts = new ArrayList<>();
}
