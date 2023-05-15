package com.vti.Service;

import com.vti.Repository.IClassroomRepository;
import com.vti.Repository.ILevelRepository;
import com.vti.entity.*;
import form.ClassroomCreateForm;
import form.ClassroomUpdateForm;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassroomService implements IClassroomService {
    @Autowired
    private ModelMapper mapper;
    @Autowired
    private IClassroomRepository repository;
    @Autowired
    private ILevelRepository levelRepository;

    @Override
    public Page<Classroom> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public Classroom findById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void create(ClassroomCreateForm form) {
        Classroom classroom = mapper.map(form, Classroom.class);
        repository.save(classroom);
    }

    @Override
    public void update(ClassroomUpdateForm form) {
        Classroom classroom = new Classroom();
        Level level = levelRepository.getById(form.getLevelId());
        classroom.setId(form.getId());

        classroom.setTotalMembers(form.getTotalMembers());
        classroom.setTeacher(form.getTeacher());
        classroom.setMoreInfomation(form.getMoreInfomation());
        classroom.setDescription(form.getDescription());

        classroom.setLevel(level);

        repository.save(classroom);
    }

    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }
}
