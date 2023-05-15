package com.vti.Service;

import com.vti.entity.Classroom;
import form.ClassroomCreateForm;
import form.ClassroomUpdateForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IClassroomService {
    Page<Classroom> findAll(Pageable pageable);

    Classroom findById(int id);

    void create(ClassroomCreateForm form);

    void update(ClassroomUpdateForm form);

    void deleteById(int id);
}
