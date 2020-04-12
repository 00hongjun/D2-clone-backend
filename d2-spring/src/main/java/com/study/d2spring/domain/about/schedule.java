package com.study.d2spring.domain.about;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "d2_schedule")
public class schedule {

    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String schedule;
    private String url;

    @Override
    public String toString() {
        return "schedule{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", schedule='" + schedule + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
