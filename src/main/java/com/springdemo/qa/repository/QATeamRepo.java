package com.springdemo.qa.repository;

import com.springdemo.qa.model.Resources;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class QATeamRepo {

    @Autowired
    JdbcTemplate jdbcTemplate;


    public List<Resources> getMyResources(){

        //List<Resources> resources = jdbcTemplate.query("SELECT * FROM qa_team",new BeanPropertyRowMapper<>(Resources.class));
        ArrayList<Resources> resources = new ArrayList<Resources>();

        resources.add(new Resources("001", "Arthee","Raghunathan", "Tanah Merah","Singapore"));
        resources.add(new Resources("001", "Vishal","Kumar", "Tampines","Singapore"));
        resources.add(new Resources("001", "Neha","Rai", "Siglap","Singapore"));
        resources.add(new Resources("001", "Sahitya","Tummalapalli", "Farrer Park","Singapore"));
        resources.add(new Resources("001", "Iman","A", "Orchard","Singapore"));
        resources.add(new Resources("001", "Priyanka","Lasinkar", "Toa Payoh","Singapore"));


        System.out.println("resources "+resources);
        return resources;
    }
}
