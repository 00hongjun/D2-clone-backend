package com.study.d2spring.repository.about;

import com.study.d2spring.domain.about.History;
import com.study.d2spring.domain.about.Schedule;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class AboutRepository {

    @Autowired
    private final EntityManager em;

    public List<History> findHistoryAll() {
        return em.createQuery("select h from History h", History.class).getResultList();
    }

    public List<Schedule> findScheduleAll() {
        return em.createQuery("select s from Schedule s", Schedule.class).getResultList();
    }
}
