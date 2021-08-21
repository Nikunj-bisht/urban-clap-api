package com.urban.urbanclapapi.dao;

import com.urban.urbanclapapi.encryption.PasswordCheck;
import com.urban.urbanclapapi.requestdata.Signupuser;
import com.urban.urbanclapapi.tables.Urbanuser;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

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

    @Override
    public boolean finduser(String email,String password) {

        Session session = entityManager.unwrap(Session.class);

        String query = "from Urbanuser where email = :em";

        Query query1 = session.createQuery(query);
        query1.setParameter("em",email);

        List<Urbanuser> list = query1.list();

        return PasswordCheck.checkpassword(password , list.get(0).getPassword());
    }
}
