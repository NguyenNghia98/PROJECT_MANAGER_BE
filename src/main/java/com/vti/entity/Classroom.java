package com.vti.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name="classroom")
public class Classroom {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "total_members", nullable = false)
    private Integer totalMembers;
    @Column(name = "teacher", length = 50, nullable = false)
    private String teacher;
    @Column(name = "moreInfomation", length = 50, nullable = false)
    private String moreInfomation;
    @Column(name = "description", length = 50)
    private String description;

    @Column(name = "created_at", nullable = false, updatable = false)
    @CreationTimestamp
    private LocalDateTime createdAt;
    @Column(name = "updated_at", nullable = false, updatable = false)
    @UpdateTimestamp
    private LocalDateTime updatedAt;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "classroom_id",referencedColumnName = "id")
    private Level level;
//    @OneToMany(mappedBy = "classroom",cascade = CascadeType.ALL)
//    private List<Student> students;


}