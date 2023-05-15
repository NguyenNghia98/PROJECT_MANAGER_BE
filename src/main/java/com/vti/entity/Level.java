package com.vti.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "level")
public class Level {
    @Id
    @Column(name = "id",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "level",length = 50)
    private String level;
    @OneToMany(mappedBy = "level",cascade = CascadeType.ALL)
    private List<Classroom> classrooms;
}
