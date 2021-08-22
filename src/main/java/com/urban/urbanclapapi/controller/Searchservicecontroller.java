package com.urban.urbanclapapi.controller;

import com.urban.urbanclapapi.requestdata.Coordinate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;

@RestController
@RequestMapping(value = "/find")
public class Searchservicecontroller {

    private EntityManager entityManager;

    @Autowired
    public Searchservicecontroller(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @PostMapping("/service")
    public @ResponseBody
    ResponseEntity<?> getservices(@RequestParam(name = "service") String service , @RequestBody Coordinate coordinate){

return null;


    }

}
