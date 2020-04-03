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
    private final EntityManagerFactory emf;
    private final EntityManager em;

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

    public Post findOneByCategory(Long _postId, Long _categoryId){
        EntityManager em = emf.createEntityManager();
        JPAQuery query = new JPAQuery(em);

        QPost qPost = QPost.post;
        QCategory qCategory = QCategory.category;

        Post post = query.from(qPost, qCategory)
                .innerJoin(qPost.category, qCategory)
                .innerJoin(qPost.category, qCategory)
                .where(qPost.id.eq(_postId).and(qCategory.id.eq(_categoryId)))
                .uniqueResult(qPost);

        return post;
    }

}
