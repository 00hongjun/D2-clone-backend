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

    public Post findPostIdByCategory(Long _postId, Long _categoryId) {
        return postRepository.findOneByCategory(_postId, _categoryId);
    }

    public List<Post> findAll() {
        return postRepository.findAll();
    }

    public List<Post> findPostAll() {
        return postRepository.findPostAll();
    }

    public List<Post> findTop5() {
        return postRepository.findTop5();
    }

    public List<Post> search(String keyword) {
        return postRepository.search(keyword);
    }
}
