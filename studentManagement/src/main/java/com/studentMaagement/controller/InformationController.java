package com.studentMaagement.controller;

import com.studentMaagement.entity.Information;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/Information")
public class InformationController {
    List<Information> informations = new ArrayList<>();
     private int currentId=1;

    @PostMapping("/informations")
    public Information createBook(@RequestBody Information information){
            information.setId(currentId++);
        informations.add(information)  ;
        return information;
    }
    @GetMapping("/all")
    public List<Information> getAllBooks(){
        return informations;
    }
    
}
