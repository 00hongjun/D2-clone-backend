package com.study.d2spring.service.about;


import com.study.d2spring.domain.about.History;
import com.study.d2spring.domain.about.Schedule;
import com.study.d2spring.repository.about.AboutRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AboutService {

    private final AboutRepository aboutRepository;

    public List<History> findHistoryAll() {
        return aboutRepository.findHistoryAll();
    }

    public List<Schedule> findScheduleAll() {
        return aboutRepository.findScheduleAll();
    }
}
