package com.study.d2spring.service;

import com.study.d2spring.domain.TestEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class TestServiceTest {
    @Autowired
    TestService testService;

    @Autowired
    EntityManager em;

    @Test
//    @Rollback(false)
    public void save() throws Exception{
        //given
        TestEntity test = new TestEntity();
        test.setName("TEST_TEST");

        //when
        Long saveId = testService.save(test);

        //then
        em.flush();
        assertEquals(test.getId(), saveId);
    }
}