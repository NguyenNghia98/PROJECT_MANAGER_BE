package com.vti.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "students")
public class Student {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "gmail", length = 50, nullable = false )
    private String gmail;

    @Column(name = "username", length = 50, nullable = false)
    private String username;
    @Column(name = "fullname", length = 50, nullable = false)
    private String fullname;
    @Column(name = "phone_number", length = 50, nullable = false)
    private String phonenumber;
    @Column(name = "created_at", nullable = false, updatable = false)
    @CreationTimestamp
    private LocalDateTime createdAt;
    @Column(name = "updated_at", nullable = false, updatable = false)
    @UpdateTimestamp
    private LocalDateTime updatedAt;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "gender_id",referencedColumnName = "id")
    private Gender gender;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "districs_id",referencedColumnName = "id")
    private Districts districs;

//    @JsonIgnore
//    @ManyToOne
//    @JoinColumn(name = "classroom_id",referencedColumnName = "id")
//    private Classroom classroom;






}
