package com.study.dbtest.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Course {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String courseName;

    @Column(nullable = false)
    private String instructor;

    @Column
    private int score;

    @OneToMany
    @JoinColumn
    private List<Enrollment> enrollments;
}
