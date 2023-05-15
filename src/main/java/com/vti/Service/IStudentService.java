package com.vti.Service;

import com.vti.entity.Classroom;
import com.vti.entity.Student;
import form.ClassroomCreateForm;
import form.ClassroomUpdateForm;
import form.StudentCreateForm;
import form.StudentUpdateForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IStudentService {
    Page<Student> findAll(Pageable pageable);
    Student findById(int id);
    void create (StudentCreateForm form);
    void update (StudentUpdateForm form);
    void deleteById(int id);
}
