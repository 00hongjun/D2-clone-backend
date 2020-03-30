package com.study.d2spring.view.post;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class PostView {

    private String postTitle;
    private String postImage;
    private String postHtml;
    private String postPublishedAt;
    private String url;
    private String viewCount;
    private String author;
    private String id;
    private String categoryId;
    private String categoryName;
    private String socialUrl;
    private List<PostTags> postTags;
    private List<Authors> authors;

    class PostTags {
        private String name;
        private String url;
    }

    class Authors {
        private String id;
        private String name;
        private String email;
        private String department;
        private String position;
        private String profile;
        private String avatarUrl;

    }

    public PostView() {

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
