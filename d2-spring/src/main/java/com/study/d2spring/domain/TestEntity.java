package com.study.d2spring.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "test_table")
//@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class TestEntity {

    @Id
    @GeneratedValue
    @Column(name = "test_id")
    private Long id;

    private String name;

}
