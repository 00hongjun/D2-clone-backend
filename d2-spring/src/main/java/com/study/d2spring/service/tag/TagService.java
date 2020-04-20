package com.study.d2spring.service.tag;

import com.study.d2spring.domain.tag.Tag;
import com.study.d2spring.repository.tag.TagRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TagService {
    private final TagRepository tagRepository;

    public List<Tag> fingByPostId(Long _postId){
        return tagRepository.fingByPostId(_postId);
    }

    public List<Tag> findTagTop5(){
        return tagRepository.findTagTop5();
    }
}
