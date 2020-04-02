package com.study.d2spring.repository.post;

import com.mysema.query.jpa.impl.JPAQuery;
import com.mysema.query.jpa.impl.JPAQueryFactory;
import com.study.d2spring.domain.member.Member;
import com.study.d2spring.domain.member.QMember;
import com.study.d2spring.domain.member.QPosting;
import com.study.d2spring.domain.post.Post;
import com.study.d2spring.domain.post.QCategory;
import com.study.d2spring.domain.post.QPost;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class PostRepository {
//
    @Autowired
    private final EntityManager em;
    private final EntityManagerFactory emf;
//
//    public void save(Post post) { em.persist(post); }

    public List<Post> findAll(){
        EntityManager em = emf.createEntityManager();
        JPAQuery query = new JPAQuery(em);

        QPost qPost = QPost.post;
        QPosting qPosting = QPosting.posting;
        QCategory qCategory = QCategory.category;

        List<Post> posts = query.from(qPost)
                .innerJoin(qPost.category, qCategory)
                .innerJoin(qPost.posting, qPosting)
                .list(qPost);

        return posts;
    }

    public Post findOne(Long id){
        return em.find(Post.class, id);
    }
}
