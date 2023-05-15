package com.vti.Service;

import com.vti.entity.Districts;

import form.DistricsCreateForm;

import java.util.List;

public interface IDistricsService {
    public List<Districts> getAllDistrics();
    void create (DistricsCreateForm form);
}
