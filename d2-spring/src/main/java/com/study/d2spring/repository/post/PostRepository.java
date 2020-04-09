package com.study.d2spring.repository.post;

import com.mysema.query.jpa.impl.JPAQuery;
import com.study.d2spring.domain.member.QPosting;
import com.study.d2spring.domain.post.Post;
import com.study.d2spring.domain.post.QCategory;
import com.study.d2spring.domain.post.QPost;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class PostRepository {

    @Autowired
    private final EntityManagerFactory emf;
    private final EntityManager em;

    public List<Post> findAll() {
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

    public Post findOneByCategory(Long _postId, Long _categoryId) {
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

    public List<Post> findPostAll() {
        EntityManager em = emf.createEntityManager();
        JPAQuery query = new JPAQuery(em);

        QPost qPost = QPost.post;

        List<Post> posts = query.from(qPost)
                .list(qPost);

        return posts;
    }
}
