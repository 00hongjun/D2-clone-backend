package com.study.d2spring.service.post;

import com.study.d2spring.domain.post.Post;
import com.study.d2spring.repository.post.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    public Post findPostId(Long _postId){
        return postRepository.findOne(_postId);
    }

    public List<Post> findAll(){
        return postRepository.findAll();
    }
}
