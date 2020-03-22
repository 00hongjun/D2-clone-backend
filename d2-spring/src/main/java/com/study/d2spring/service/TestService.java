package com.study.d2spring.service;

import com.study.d2spring.domain.TestEntity;
import com.study.d2spring.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class TestService {

    private final TestRepository testRepository;

    @Transactional
    public Long save(TestEntity test){

        return testRepository.save(test);
    }
}
