package com.vti.Service;

import com.vti.Repository.IClassroomRepository;
import com.vti.Repository.IDistricsRepository;
import com.vti.Repository.IGenderRepository;
import com.vti.Repository.IStudentRepository;

import com.vti.entity.Classroom;
import com.vti.entity.Districts;
import com.vti.entity.Gender;
import com.vti.entity.Student;
import form.StudentCreateForm;
import form.StudentUpdateForm;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService {
    @Autowired
    private IStudentRepository repository;
    @Autowired
    private IGenderRepository genderRepository;
    @Autowired
    private IDistricsRepository districsRepository;
    @Autowired
    private IClassroomRepository classroomRepository;
    @Autowired
    private ModelMapper mapper;


    @Override
    public Page<Student> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public Student findById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void create(StudentCreateForm form) {

        Student student = new Student();
        Gender gender = genderRepository.getById(form.getGenderId());
        Districts districts = districsRepository.getById(form.getGenderId());
//        Classroom classroom = classroomRepository.getById((form.getClassroomId()));
        student.setGmail(form.getGmail());
        student.setUsername(form.getUsername());
        student.setFullname(form.getFullname());
        student.setPhonenumber(form.getPhonenumber());
        student.setGender(gender);
        student.setDistrics(districts);
//        student.setClassroom(classroom);
        repository.save(student);
    }

    @Override
    public void update(StudentUpdateForm form) {

        Student student = new Student();
        Gender gender = genderRepository.getById(form.getGenderId());
        Districts districts = districsRepository.getById(form.getGenderId());
        student.setId(form.getId());
        student.setGmail(form.getGmail());
        student.setUsername(form.getUsername());
        student.setFullname(form.getFullname());
        student.setPhonenumber(form.getPhonenumber());
        student.setGender(gender);
        student.setDistrics(districts);


        repository.save(student);
    }

    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }
}
