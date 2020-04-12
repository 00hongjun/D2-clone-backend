package com.study.d2spring.domain.about;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "d2_history")
public class history {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String year;
    private String comment;

    @Override
    public String toString() {
        return "history{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", year='" + year + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}
