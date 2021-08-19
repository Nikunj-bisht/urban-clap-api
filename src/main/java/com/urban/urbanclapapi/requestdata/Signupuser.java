package com.urban.urbanclapapi.requestdata;

public class Signupuser {

    private String user_name;
    private String password;
    private String email;
    private String phn_num;

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhn_num(String phn_num){this.phn_num = phn_num;}

    public String getPhn_num() {
        return phn_num;
    }
}