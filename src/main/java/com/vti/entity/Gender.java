package com.vti.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "gender")
public class Gender {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "gender",length = 50,nullable = false)
    private String gender;
@OneToMany(mappedBy = "gender",cascade = CascadeType.ALL)
private List<Student> students;
}
