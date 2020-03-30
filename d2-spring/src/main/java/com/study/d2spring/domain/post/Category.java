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

    private String name;

    private String url;
}
