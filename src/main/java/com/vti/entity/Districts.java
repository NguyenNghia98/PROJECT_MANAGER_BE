package com.vti.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "districs")
public class Districts {
    @Id
    @Column(name = "id",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name",length = 50)
    private String districsname;
    @OneToMany(mappedBy = "districs",cascade = CascadeType.ALL)
    private List<Student> students;
}
