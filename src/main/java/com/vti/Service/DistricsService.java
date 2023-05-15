package com.vti.Service;

import com.vti.Repository.IDistricsRepository;
import com.vti.entity.Districts;
import form.DistricsCreateForm;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistricsService implements IDistricsService {
    @Autowired
    private IDistricsRepository repository;
//    @Autowired
//    private ModelMapper mapper;

    @Override
    public List<Districts> getAllDistrics() {
        return repository.findAll();
    }

    @Override
    public void create(DistricsCreateForm form) {
//        Districts districts = mapper.map(form,Districts.class);
        Districts districts = new Districts();
        districts.setDistricsname(form.getDistricsname());
        repository.save(districts);
    }
}
