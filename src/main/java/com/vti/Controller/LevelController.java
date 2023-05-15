package com.vti.Controller;

import com.vti.Service.ILevelService;
import com.vti.entity.Level;
import form.LevelCreateForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/level")
@CrossOrigin("*")
public class LevelController {
    @Autowired
    private ILevelService service;

    @GetMapping
    public List<Level> findAll() {
        return service.getAllLevel();

    }
    @PostMapping
    public  void create (@RequestBody LevelCreateForm form){
        service.create(form);
    }
}
