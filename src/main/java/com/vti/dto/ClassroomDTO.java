package com.vti.dto;

import com.vti.entity.Classroom;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class ClassroomDTO {
    private Integer id;

    private Integer totalMembers;
    private String teacher;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String moreInfomation;
    private String description;
    private String levelLevel;

//    private List<StudentDTO> students;

//    @Getter
//    @Setter
//    public static class StudentDTO {
//        private Integer id;
//        private String username;
//    }
}
