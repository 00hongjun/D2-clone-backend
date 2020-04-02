package com.study.d2spring.repository.member;

import com.mysema.query.jpa.impl.JPAQuery;
import com.study.d2spring.domain.member.Member;
import com.study.d2spring.domain.member.Posting;
import com.study.d2spring.domain.member.QMember;
import com.study.d2spring.domain.member.QPosting;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class MemberRepository {


    @Autowired
    private final EntityManager em;
    private final EntityManagerFactory emf;

    public List<Member> findAllbyPostId(Long postId){
        EntityManager em = emf.createEntityManager();
        JPAQuery query = new JPAQuery(em);

        QPosting qPosting = QPosting.posting;
        QMember qMember = QMember.member;

        List<Member> members = query.from(qMember, qPosting)
                .innerJoin(qMember.posting, qPosting)
                .where(qPosting.post.id.eq(postId))
                .list(qMember);

//        System.out.println(members.get(0).toString());

        return members;

    }
}
