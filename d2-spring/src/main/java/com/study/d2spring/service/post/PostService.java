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

    public Long addPost(Post post){
        //임의의 게시물 데이터를 삽입
        return null;
//        return post.getId();
    }

    public Post findPostId(Long id){
        return postRepository.findOne(id);
    }

    public List<Post> findAll(){
        return postRepository.findAll();
    }
}
