package com.study.d2spring.domain.post;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "d2_category")
@Entity
public class Category {

    @Id
    @GeneratedValue
    @Column(name = "category_id")
    private long id;
    @Column(name = "category_name")
    private String name;
    @Column(name = "category_url")
    private String url;
}
