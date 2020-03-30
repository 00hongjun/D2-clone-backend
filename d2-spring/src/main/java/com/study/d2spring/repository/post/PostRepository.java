package com.study.d2spring.repository.post;

import com.study.d2spring.domain.post.Post;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class PostRepository {
//
    @Autowired
    private final EntityManager em;
//
//    public void save(Post post) { em.persist(post); }

    public List<Post> findAll(){
        //전부 조회는 JPQL을 사용 => from의 대상이 테이블이 아닌 엔티티 객체를 대상으로 쿼리를 수행함.
        return em.createQuery("select p from Post p", Post.class)
                .getResultList();
    }
}
