package com.urban.urbanclapapi.dao;

import com.urban.urbanclapapi.tables.Urbanuser;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class Urbanuserdaoclass implements Urbanuserdao{

    private EntityManager entityManager;

    @Autowired
    public Urbanuserdaoclass(EntityManager entityManager){
        this.entityManager = entityManager;
    }


    @Override
    public void save(Urbanuser urbanuser) {

        Session session = entityManager.unwrap(Session.class);
        session.save(urbanuser);

    }
}
