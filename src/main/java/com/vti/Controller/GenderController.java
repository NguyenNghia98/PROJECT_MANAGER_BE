package com.vti.Controller;


import com.vti.Service.IGenderServirce;
import com.vti.entity.Gender;
import form.GenderCreateForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/gender")
@CrossOrigin("*")
public class GenderController {
    @Autowired
    private IGenderServirce servirce;

    @GetMapping
    public List<Gender> findAll() {
        return servirce.getAllGender();
    }
    @PostMapping
    public void create ( @RequestBody GenderCreateForm form) {
        servirce.create(form);
    }

}
