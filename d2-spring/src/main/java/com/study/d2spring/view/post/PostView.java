package com.study.d2spring.view.post;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.study.d2spring.domain.member.Member;
import com.study.d2spring.domain.post.Category;
import com.study.d2spring.domain.post.Post;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class PostView {

    private String postTitle;
    private String postImage;
    private String postHtml;
    private LocalDateTime postPublishedAt;
    private String url;
    private int viewCount;
    private Long categoryId;
    private String categoryName;
    private String socialUrl;
    private List<PostTags> postTags;
    private List<Author> authors = new ArrayList<>();

//    public PostView(HttpServletRequest request) {
//
//        setPostData((Post) request.getAttribute("post"));
//
//        setAuthors((List<Member>) request.getAttribute("members"));
//
//    }

    public PostView(Post post, List<Member> member) {
        setPostData(post);
        setAuthors(member);
    }

    class PostTags {
        private String name;
        private String url;
    }

    @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    class Author {
        private String id;
        private String name;
        private String email;
        private String department;
        private String position;
        private String profile;
        private String avatarUrl;

    }


    private void setCategory(Category _category) {
        this.categoryId = _category.getId();
        this.categoryName = _category.getName();

    }

    private void setAuthors(List<Member> _members) {
//        _members.get(0).toString();
        for (int i = 0; i < _members.size(); i++) {
            Author author = new Author();
            author.id = _members.get(i).getId();
            author.name = _members.get(i).getName();
            author.email = _members.get(i).getEmail();
            author.department = _members.get(i).getDepartment();
            author.position = _members.get(i).getPosition();
            author.profile = _members.get(i).getProfile();
            author.avatarUrl = _members.get(i).getAvatarUrl();

            authors.add(author);
        }
    }

    private void setPostData(Post _post) {
        this.postTitle = _post.getTitle();
//        this.postImage = _post.getImage();
        this.postHtml = _post.getBody();
        this.postPublishedAt = _post.getPublication_date();
        this.url = _post.getSocial_url();
        this.viewCount = _post.getView_count();

        setCategory(_post.getCategory());
    }

    /**
     *  요 형태로 진행
     */

//    {
//        "postTitle": "이것은 제목이다",
//            "postImage": "/content/images/2020/02/spring-mvc-and-webflux-venn-1.png",
//            "postHtml": "<p> 아키텍처는 오랫동안 많은 개발자들이 좋아하며 사용한 아키텍처입니다. </p>",
//            "postPublishedAt": 1582104345000,
//            "url": "/helloworld/6080222",
//            "viewCount": 5825,
//            "author": "[258]",
//            "id": 668,
//            "categoryId": 2,
//            "categoryName": "hello world",
//            "socialUrl": "http://d2.naver.com/helloworld/6080222",
//            "postTags": [
//        {
//            "name": "rpc",
//                "url": "/search?keyword=rpc"
//        },
//        {
//            "name": "Spring",
//                "url": "/search?keyword=Spring"
//        },
//        {
//            "name": "Spring WebFlux",
//                "url": "/search?keyword=Spring WebFlux"
//        },
//        {
//            "name": "Armeria",
//                "url": "/search?keyword=Armeria"
//        },
//        {
//            "name": "Microservice",
//                "url": "/search?keyword=Microservice"
//        },
//        {
//            "name": "Reactive",
//                "url": "/search?keyword=Reactive"
//        }
//    ],
//        "authors": [
//        {
//            "id": 258,
//                "name": "이준행",
//                "email": "",
//                "department": "네이버 Clova",
//                "position": "",
//                "profile": "2016년 네이버 입사 후 메인 플랫폼을 거쳐 현재 Clova에서 NAVER AiCall의 백엔드 개발을 담당하고 있습니다.",
//                "avatarUrl": "/image/20200219/680454544304.jpg"
//        }
//    ]
//    }
}
