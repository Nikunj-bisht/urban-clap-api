package com.urban.urbanclapapi.dao;

import com.urban.urbanclapapi.tables.Urbanuser;

public interface Urbanuserdao {

public void save(Urbanuser urbanuser);
public boolean finduser(String email,String password);

}
