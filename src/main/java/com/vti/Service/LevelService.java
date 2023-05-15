package com.vti.Service;

import com.vti.Repository.ILevelRepository;
import com.vti.entity.Level;
import form.LevelCreateForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LevelService implements ILevelService {
    @Autowired
    private ILevelRepository repository;

    @Override
    public List<Level> getAllLevel() {
        return repository.findAll();
    }

    @Override
    public void create(LevelCreateForm form) {
        Level level = new Level();
        level.setLevel(form.getLevel());
        repository.save(level);
    }
}
