package com.vti.Service;

import com.vti.entity.Gender;
import form.GenderCreateForm;

import java.util.List;

public interface IGenderServirce {
    public List<Gender> getAllGender();
    void create(GenderCreateForm form);
}
