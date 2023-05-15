package com.vti.Service;

import com.vti.Repository.IGenderRepository;
import com.vti.entity.Gender;
import form.GenderCreateForm;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GenderService implements IGenderServirce{
    @Autowired
    private IGenderRepository genderRepository;
//    @Autowired
//   private ModelMapper mapper;
    @Override
    public List<Gender> getAllGender() {
        return genderRepository.findAll();
    }

    @Override
    public void create(GenderCreateForm form) {
//        Gender gender =mapper.map(form,Gender.class);
        Gender gender = new Gender();
        gender.setGender(form.getGender());
        genderRepository.save(gender);
    }


}
