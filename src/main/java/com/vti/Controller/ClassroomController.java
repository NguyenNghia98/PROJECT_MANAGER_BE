package com.vti.Controller;

import com.vti.Service.IClassroomService;
import com.vti.dto.ClassroomDTO;
import com.vti.dto.StudentDTO;
import com.vti.entity.Classroom;
import com.vti.entity.Student;
import form.ClassroomCreateForm;
import form.ClassroomUpdateForm;
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
@RequestMapping("/api/v1/classrooms")
@CrossOrigin("*")

public class ClassroomController {
    @Autowired
    private IClassroomService service;
    @Autowired
    private ModelMapper mapper;

    @GetMapping
    public Page<ClassroomDTO> findAll(Pageable pageable) {
        Page<Classroom> page = service.findAll(pageable);
        List<Classroom> classrooms = page.getContent();
        List<ClassroomDTO> dtos = mapper.map(classrooms,new TypeToken<List<ClassroomDTO>>() {}.getType());
        return new PageImpl<>(dtos, pageable,page.getTotalElements());
    }

    @GetMapping("/{id}")
    public ClassroomDTO findById(@PathVariable("id") int id) {
        Classroom classroom = service.findById(id);
        ClassroomDTO dtos = mapper.map(classroom, ClassroomDTO.class);
        return dtos;
    }

    @PostMapping
    public void create(@RequestBody ClassroomCreateForm form) {
        service.create(form);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") int id, @RequestBody ClassroomUpdateForm form) {
        form.setId(id);
        service.update(form);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id")int id) {
        service.deleteById(id);
    }

}
