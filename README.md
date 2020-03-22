# D2-clone-backend
d2 clone 프로젝트 스터디

# Read Me First
* [Naver D2](d2.naver.com)를 똑같이 만드는 clone 프로젝트
* 스터디 프로젝트의 Back-end 관련 repo입니다. (FE는 아래 링크 참조)
* Front-end Git Hub : [Naver_D2_Clone_Project](https://github.com/programmer-sjk/Naver_D2_Clone_Project.git)

## 기술 stack
* spring-boot : 2.2.4
* JPA
* MySQL
* Redis
* OAuth web token
* Nginx
* Swagger 2.0

# Getting Started

## 전체 실행
1. cd ~/D2-clone-backend
1. docker-compose up -d
1. localhost:8080 으로 접속
## mysql 실행
1. cd ~/D2-clone-backend
1. docker-compose up -d mysql_db
1. localhost:3306으로 mysql 접근 ([MySQL Workbench](https://www.mysql.com/products/workbench/) )
## rebuild
* mysql
    1. cd ~/D2-clone-backend 
    1. docker-compose build mysql_db
* spring
    1. cd ~/D2-clone-backend 
    1. docker-compose build spring
    
# RestAPI Docs
Swagger 2.0 

## 문서 확인
http://localhost:8080/swagger-ui.html 로 
