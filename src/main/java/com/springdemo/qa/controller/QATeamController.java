package com.springdemo.qa.controller;


import com.springdemo.qa.model.Resources;
import com.springdemo.qa.repository.QATeamRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
//@CrossOrigin(origins = "https://arthee-spring-react-demo.uc.r.appspot.com/")
    @RestController
    @RequestMapping("/api")
    public class QATeamController {

    @Autowired
    QATeamRepo qaTeamRepo;

    @GetMapping("/resources")
    public List<Resources> getAllResources() {

                return qaTeamRepo.getMyResources();

    }
}
