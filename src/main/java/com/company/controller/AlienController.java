package com.company.controller;

import com.company.model.Alien;
import com.company.repository.AlienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AlienController {
    @Autowired
    AlienRepository alienRepository;

    @RequestMapping("/aliens")
    List<Alien> getAlients() {
        List<Alien> aliens = (List<Alien>) alienRepository.findAll();

        return aliens;
    }
}
