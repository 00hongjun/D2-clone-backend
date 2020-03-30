package com.study.d2spring.domain.post;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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

    @OneToMany
    private List<Post> posts = new ArrayList<>();

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name +
                '}';
    }
}
