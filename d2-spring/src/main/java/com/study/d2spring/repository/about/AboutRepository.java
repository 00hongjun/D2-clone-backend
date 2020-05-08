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
        List<History> result = em.createQuery(
                "select h from History h order by h.id desc",
                History.class).getResultList();
        em.close();
        return result;
    }

    public List<Schedule> findScheduleAll() {
        List<Schedule> result = em.createQuery("select s from Schedule s", Schedule.class).getResultList();
        em.close();
        return result;
    }
}
