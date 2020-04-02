package com.study.d2spring.service.member;

import com.study.d2spring.domain.member.Member;
import com.study.d2spring.repository.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public List<Member> findAllByPostId(Long postId){
        return memberRepository.findAllbyPostId(postId);
    }
}
