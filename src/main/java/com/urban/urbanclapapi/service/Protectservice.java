package com.urban.urbanclapapi.service;

import com.urban.urbanclapapi.dao.Urbanuserdao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Protectservice {

    @Autowired
    Urbanuserdao urbanuserdao;

    public boolean isvalid(){


return true;
    }


}
