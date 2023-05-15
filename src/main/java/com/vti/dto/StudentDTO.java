package com.vti.dto;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;


@Getter
@Setter
public class StudentDTO {
    private Integer id;
    private String gmail;
    private String username;
    private String phonenumber;
    private String fullname;
    private String genderGender;
    private String districsDistricsname;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;




}
