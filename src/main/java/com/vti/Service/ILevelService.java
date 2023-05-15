package com.vti.Service;

import com.vti.entity.Level;
import form.LevelCreateForm;

import java.util.List;

public interface ILevelService {
    public List<Level> getAllLevel();
    void create(LevelCreateForm form);
}
