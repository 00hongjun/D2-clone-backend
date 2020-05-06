
INSERT INTO `d2_db`.`d2_schedule`
(`id`,
`image`,
`schedule`,
`title`,
`comment`,
`url`)
VALUES
(1,
"",
"20년 3월 18일 ~ 4월 2일 접수 \n 20년 5월 21일 ~ 5월 22일 핵데이",
"NAVER CAMPUS HACKDAY",
"NAVER 개발자와 함께하는 24시간의 해커톤",
"https://recruit.navercorp.com/naver/job/detail/developer?annoId=20003868&classId=&jobId=&entTypeCd=004&searchTxt=&searchSysComCd=");

INSERT INTO `d2_db`.`d2_schedule`
(`id`,
`image`,
`schedule`,
`title`,
`comment`,
`url`)
VALUES
(2,
"",
"20년 7월 예정",
"NAVER TECH CONCERT",
"Mobile 개발을 주제로 기술 컨퍼런스 진행",
"https://techcon.naver.com/");

INSERT INTO `d2_db`.`d2_schedule`
(`id`,
`image`,
`schedule`,
`title`,
`comment`,
`url`)
VALUES
(3,
"",
"20년 9월 예정",
"DEVIEW",
"네이버 개발자 컨퍼런스",
"https://deview.kr/2019");


INSERT INTO `d2_db`.`d2_history`
(`id`,
`comment`,
`title`,
`date`,
`url`)
VALUES
(1,
"빅데이터 엔지니어링 컨퍼런스 \n
국내외 IT기업 엔지니어들이 연사로 참여",
"SDEC 2011",
"2011.6.27~28",
"");

INSERT INTO `d2_db`.`d2_history`
(`id`,
`comment`,
`title`,
`date`,
`url`)
VALUES
(2,
"SHARING, EXCELLENCE, GROWTH \n
순수 기술행사 지향 \n
외부 개발자 연사 처음으로 초청",
"DEVIEW 2011",
"2011.10.18",
"https://deview.kr/2011/");

INSERT INTO `d2_db`.`d2_history`
(`id`,
`comment`,
`title`,
`date`,
`url`)
VALUES
(3,
"NAVER 개발자들의 실전 노하우와 \n
지식을 담은 블로그",
"HELLO WORLD",
"2011.12.29 오픈",
"");

INSERT INTO `d2_db`.`d2_history`
(`id`,
`comment`,
`title`,
`date`,
`url`)
VALUES
(4,
"빅데이터 엔지니어링 컨퍼런스 \n
국내외 IT기업 엔지니어들이 연사로 참여",
"D2 OPEN SEMINAR",
"2012.5 시작",
"https://developers.naver.com/seminar/introduction.nhn");

INSERT INTO `d2_db`.`d2_history`
(`id`,
`comment`,
`title`,
`date`,
`url`)
VALUES
(5,
"국내외 IT 회사 대거 참여, 컨텐츠 수준 크게 향상 \n
세션 수도 42개로 더 풍성해짐 \n
우수 논문 리뷰를 통해 학계 연사 초대 \n
BOF(자유토론) 세션 진행",
"DEVIEW 2012",
"2012",
"");

INSERT INTO `d2_db`.`d2_history`
(`id`,
`comment`,
`title`,
`date`,
`url`)
VALUES
(6,
"소모임 장소, 서버 제공, 컨퍼런스 후원 등 \n
열정있는 개발자들의 커뮤니티 활동 응원",
"D2 COMMUNITY",
"2013.5 시작",
"https://developers.naver.com/wiki/pages/Community");

INSERT INTO `d2_db`.`d2_category`
(`category_id`,
`name`)
VALUES
(1,
"home");

INSERT INTO `d2_db`.`d2_category`
(`category_id`,
`name`)
VALUES
(2,
"hello world");

INSERT INTO `d2_db`.`d2_category`
(`category_id`,
`name`)
VALUES
(3,
"news");

INSERT INTO `d2_db`.`d2_post`
(`post_id`,
`body`,
`image`,
`publication_date`,
`social_url`,
`title`,
`view_count`,
`category_id`)
VALUES
(668,
"<p> 아키텍처는 오랫동안 많은 개발자들이 좋아하며 사용한 아키텍처입니다. </p>",
"/content/images/2020/02/spring-mvc-and-webflux-venn-1.png",
now(),
"http://d2.naver.com/helloworld/6080222",
"이것은 제목이다",
5825,
2);

INSERT INTO `d2_db`.`d2_post`
(`post_id`,
`body`,
`image`,
`publication_date`,
`social_url`,
`title`,
`view_count`,
`category_id`)
VALUES
(669,
"<p> NAVER에서는 다양한 기술에 대한 테크톡을 주기적으로 진행하고 있는데요. 2019년 12월에 진행한 사내 안드로이드 개발 밋업 중 발표자의 공개 동의를 얻은 발표 영상을 공유합니다. </p>",
"/content/images/2020/02/spring-mvc-and-webflux-venn-1.png",
now(),
"https://d2.naver.com/news/8738186",
"NAVER Tech Talk: UIT 개발 밋업(2019년 12월)",
2502,
3);

INSERT INTO `d2_db`.`d2_post`
(`post_id`,
`body`,
`image`,
`publication_date`,
`social_url`,
`title`,
`view_count`,
`category_id`)
VALUES
(670,
"<h4>네이버 개발자와 함께하는 대학생 해커톤!<br/></h4>\n\n<p>올해도 2020 NAVER CAMPUS HACKDAY가 찾아왔어요♬\n </p>",
"/content/images/2020/02/spring-mvc-and-webflux-venn-1.png",
now(),
"https://d2.naver.com/news/6826105",
"2020 NAVER CAMPUS HACKDAY 안내",
7564,
3);

INSERT INTO `d2_db`.`d2_post`
(`post_id`,
`body`,
`image`,
`publication_date`,
`social_url`,
`title`,
`view_count`,
`category_id`)
VALUES
(671,
"<p>NAVER에서는 다양한 기술에 대한 테크톡을 주기적으로 진행하고 있는데요. 2019년 11월에 진행한 사내 UIT 개발 밋업 중 발표자의 공개 동의를 얻은 발표 영상을 공유합니다.</p>",
"/content/images/2020/02/spring-mvc-and-webflux-venn-1.png",
now(),
"https://d2.naver.com/news/6826105",
"NAVER Tech Talk: UIT 개발 밋업(2019년 11월)",
7564,
3);

INSERT INTO `d2_db`.`d2_post`
(`post_id`,
`body`,
`image`,
`publication_date`,
`social_url`,
`title`,
`view_count`,
`category_id`)
VALUES
(672,
"<p>NAVER에서는 매주 사내외 전문가를 초빙하여 테크톡을 진행하고 있는데요. 발표자 분의 공개 동의를 얻어 <a href=\"https://www.facebook.com/naverengineering/\">NAVER Engineering 페이스북</a>에 공개한 AI 주제의 발표 영상(2019년 1월, 5월~10월), 일곱 번째 목록을 정리하였습니다.</p>",
"/content/images/2020/02/spring-mvc-and-webflux-venn-1.png",
now(),
"https://d2.naver.com/news/7618832",
"NAVER Tech Talk: AI 7차 (2019년 1월, 5월~10월)",
3892,
3);

INSERT INTO `d2_db`.`d2_post`
(`post_id`,
`body`,
`image`,
`publication_date`,
`social_url`,
`title`,
`view_count`,
`category_id`)
VALUES
(673,
"<p>NAVER에서는 다양한 기술에 대한 테크톡을 주기적으로 진행하고 있는데요. 2018년 11월과 2019년 11월에 진행한 사내 Android 밋업 중 발표자의 공개 동의를 얻은 발표 영상을 공유합니다.</p>",
"/content/images/2020/02/spring-mvc-and-webflux-venn-1.png",
now(),
"https://d2.naver.com/news/4699566",
"NAVER Tech Talk: Android 밋업(2018년 11월, 2019년 10월)",
2437,
3);

INSERT INTO `d2_db`.`d2_post`
(`post_id`,
`body`,
`image`,
`publication_date`,
`social_url`,
`title`,
`view_count`,
`category_id`)
VALUES
(674,
"<h4>네이버 개발자와 함께하는 대학생 해커톤!<br/></h4>\n\n<p>2019 NAVER CAMPUS HACKDAY WINTER 열립니다. <br /></p>",
"/content/images/2020/02/spring-mvc-and-webflux-venn-1.png",
now(),
"https://d2.naver.com/news/4972264",
"2019 NAVER CAMPUS HACKDAY WINTER",
5690,
3);

INSERT INTO `d2_db`.`d2_post`
(`post_id`,
`body`,
`image`,
`publication_date`,
`social_url`,
`title`,
`view_count`,
`category_id`)
VALUES
(675,
"<p>NAVER에서는 다양한 FE 기술에 대한 테크톡을 주기적으로 진행하고 있는데요. 이번 FE devtalk 15회 주제는 \"UX Engineering\"으로 다음과 같은 발표들을 살펴보겠습니다. 해당 FE devtalk 중 발표자의 공개 동의를 얻은 영상을 공유합니다.</p>",
"/content/images/2020/02/spring-mvc-and-webflux-venn-1.png",
now(),
"https://d2.naver.com/news/3691882",
"NAVER Tech Talk: FE devtalk 15회 (2019년 9월)",
2900,
3);

INSERT INTO `d2_db`.`d2_post`
(`post_id`,
`body`,
`image`,
`publication_date`,
`social_url`,
`title`,
`view_count`,
`category_id`)
VALUES
(676,
"<h4>네이버 개발자와 함께하는 대학생 해커톤!<br/></h4>\n\n<p>2019 NAVER CAMPUS HACKDAY SUMMER가 열립니다. <br /></p>",
"/content/images/2020/02/spring-mvc-and-webflux-venn-1.png",
now(),
"https://d2.naver.com/news/5009947",
"2019 NAVER CAMPUS HACKDAY SUMMER 안내",
6717,
3);

INSERT INTO `d2_db`.`d2_post`
(`post_id`,
`body`,
`image`,
`publication_date`,
`social_url`,
`title`,
`view_count`,
`category_id`)
VALUES
(677,
"<p>오픈소스는 그 '사용'에 대해서도 그리고 '참가'적인 측면에서 아주 많은 관심을 얻고 있습니다. 그러나 오픈소스 프로젝트를 운영하는 데 있어서 그 뒷모습은 잘 알려져 있지는 않은데요. 다음의 질문들에 대한 궁금증을 NAVER의 박재성 님과 함께 풀어 보고자 합니다. </p>",
"/content/images/2020/02/spring-mvc-and-webflux-venn-1.png",
now(),
"https://d2.naver.com/news/6617235",
"NAVER Tech Talk: 오픈소스 프로젝트 운영 경험 공유",
2531,
3);

INSERT INTO `d2_db`.`d2_post`
(`post_id`,
`body`,
`image`,
`publication_date`,
`social_url`,
`title`,
`view_count`,
`category_id`)
VALUES
(678,
"<p>NAVER에서는 다양한 기술에 대한 테크톡과 밋업을 주기적으로 진행하고 있는데요. 2018년 8월, 2019년 1월에 진행한 사내 Golang 밋업의 발표 영상을 공유합니다.</p>",
"/content/images/2020/02/spring-mvc-and-webflux-venn-1.png",
now(),
"https://d2.naver.com/news/3383672",
"NAVER Tech Talk: Golang 밋업(2018년 8월, 2019년 1월)",
3018,
3);



INSERT INTO `d2_db`.`d2_member`
(`member_id`,
`department`,
`position`,
`email`,
`name`,
`profile`,
`avatar_url`)
VALUES
("258",
"네이버 Clova",
"",
"",
"이준행",
"2016년 네이버 입사 후 메인 플랫폼을 거쳐 현재 Clova에서 NAVER AiCall의 백엔드 개발을 담당하고 있습니다.",
"/image/20200219/680454544304.jpg");

INSERT INTO `d2_db`.`d2_posting`
(`posting_id`,
`posting_member_id`,
`posting_post_id`)
VALUES
(1,
258,
668);
INSERT INTO `d2_db`.`d2_tag`
(
`name`,
`url`)
VALUES
(
"rpc",
"/search?keyword=rpc");

INSERT INTO `d2_db`.`d2_tag`
(
`name`,
`url`)
VALUES
(
"Spring",
"/search?keyword=Spring");

INSERT INTO `d2_db`.`d2_tag`
(
`name`,
`url`)
VALUES
(
"Spring WebFlux",
"/search?keyword=Spring WebFlux");

INSERT INTO `d2_db`.`d2_tag`
(
`name`,
`url`)
VALUES
(
"Armeria",
"/search?keyword=Armeria");

INSERT INTO `d2_db`.`d2_tag`
(
`name`,
`url`)
VALUES
(
"Microservice",
"/search?keyword=Microservice");


INSERT INTO `d2_db`.`d2_tag`
(
`name`,
`url`)
VALUES
(
"Reactive",
"/search?keyword=Reactive");

INSERT INTO `d2_db`.`d2_tag_post`
(`tag_id`,
`post_id`)
VALUES
(1,
668);

INSERT INTO `d2_db`.`d2_tag_post`
(`tag_id`,
`post_id`)
VALUES
(2,
668);

INSERT INTO `d2_db`.`d2_tag_post`
(`tag_id`,
`post_id`)
VALUES
(3,
668);

INSERT INTO `d2_db`.`d2_tag_post`
(`tag_id`,
`post_id`)
VALUES
(4,
668);

INSERT INTO `d2_db`.`d2_tag_post`
(`tag_id`,
`post_id`)
VALUES
(5,
668);

INSERT INTO `d2_db`.`d2_tag_post`
(`tag_id`,
`post_id`)
VALUES
(6,
668);

INSERT INTO `d2_db`.`d2_post_reply`
(`reply_id`,
`bad_count`,
`comments`,
`good_count`,
`reply_at`,
`replyer`,
`text`,
`post_id`)
VALUES
(1,
0,
'',
0,
20200324131300,
'황금비',
'WebFlux에 관심이 많이가던데 좋은 정리 감사합니다. DB와 연결된 서버는 도입이 안되더라도 Gateway서버에서는 효율이 좋을거 같은 느낌인데요 맞나요..?!',
668);

INSERT INTO `d2_db`.`d2_post_reply`
(`reply_id`,
`bad_count`,
`comments`,
`good_count`,
`reply_at`,
`replyer`,
`text`,
`post_id`)
VALUES
(2,
1,
'',
2,
20200221121000,
'브로걸리',
'nodejs는 새로운 언어가 아니라 javascript 런타임환경을 제공하는 플랫폼입니다.많은 쥬니어 개발자들이 참조하는 사이트인만큼 잘못된 정보가 전파되지 않도록 수정이 필요해보이네요.',
668);
