package com.vti.Controller;

import com.vti.Service.IClassroomService;
import com.vti.Service.IStudentService;
import com.vti.dto.StudentDTO;
import com.vti.entity.Classroom;
import com.vti.entity.Student;
import form.ClassroomCreateForm;
import form.ClassroomUpdateForm;
import form.StudentCreateForm;
import form.StudentUpdateForm;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@CrossOrigin("*")
public class StudentController {
    @Autowired
    private IStudentService service;
    @Autowired
    private ModelMapper mapper;

    @GetMapping
    public Page<StudentDTO> findAll(Pageable pageable) {
        Page<Student> page = service.findAll(pageable);
        List<Student> students = page.getContent();
        List<StudentDTO> dtos = mapper.map(students,new TypeToken<List<StudentDTO>>() {}.getType());
        return new PageImpl<>(dtos, pageable,page.getTotalElements());
    }

    @GetMapping("/{id}")
    public StudentDTO findById(@PathVariable("id") int id) {
        Student student = service.findById(id);
        StudentDTO dtos = mapper.map(student, StudentDTO.class);
        return dtos;
    }

    @PostMapping
    public void create(@RequestBody StudentCreateForm form) {
        service.create(form);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") int id, @RequestBody StudentUpdateForm form) {
        form.setId(id);
        service.update(form);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") int id) {
        service.deleteById(id);
    }
}
