package com.study.dbtest.model;

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

    @Column(nullable = false)
    private int score;

    @OneToMany(mappedBy = "course")
    @JoinColumn
    private List<Enrollment> enrollments;
}
