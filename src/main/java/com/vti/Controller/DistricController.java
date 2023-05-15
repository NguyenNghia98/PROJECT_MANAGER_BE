package com.vti.Controller;

import com.vti.Service.IDistricsService;
import com.vti.entity.Districts;
import form.DistricsCreateForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/districs")
@CrossOrigin("*")
public class DistricController {
    @Autowired
    private IDistricsService service;
    @GetMapping
    public List<Districts> findAll(){
        return service.getAllDistrics();
    }
    @PostMapping
    public void create(@RequestBody DistricsCreateForm form){
        service.create(form);
    }

}
