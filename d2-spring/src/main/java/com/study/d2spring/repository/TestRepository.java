package com.study.d2spring.repository;

import com.study.d2spring.domain.TestEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@RequiredArgsConstructor
public class TestRepository {

    @Autowired
    private final EntityManager em;

    public Long save(TestEntity test){
        em.persist(test);

        return test.getId();
    }
}
