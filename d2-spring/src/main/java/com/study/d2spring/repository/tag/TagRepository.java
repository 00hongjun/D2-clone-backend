package com.study.d2spring.repository.tag;

import com.mysema.query.jpa.impl.JPAQuery;
import com.study.d2spring.domain.post.QPost;
import com.study.d2spring.domain.tag.QTag;
import com.study.d2spring.domain.tag.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class TagRepository {

    @Autowired
    private final EntityManagerFactory emf;
    private EntityManager em;

    public List<Tag> fingByPostId(Long _postId){
        em = emf.createEntityManager();

        JPAQuery query = new JPAQuery(em);

        QTag qTag = QTag.tag;
        QPost qPost = QPost.post;

        List<Tag> tags = query.from(qTag, qPost)
                .innerJoin(qTag.posts, qPost)
                .where(qPost.post.id.eq(_postId))
                .list(qTag);

        em.close();
        return tags;
    }

    public List<Tag> findTagTop5(){
        em = emf.createEntityManager();
        JPAQuery query = new JPAQuery(em);

        QTag qTag = QTag.tag;
        QPost qPost = QPost.post;

        List<Tag> tags = query.from(qTag)
                .innerJoin(qTag.posts, qPost)
                .orderBy(qPost.viewCount.desc(), qTag.name.asc())
                .limit(5)
                .list(qTag);

        em.close();
        return tags;

    }

}
