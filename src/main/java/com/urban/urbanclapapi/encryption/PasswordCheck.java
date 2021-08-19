package com.urban.urbanclapapi.encryption;


import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordCheck {

    private static BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
    public static boolean checkpassword(String reqpass , String actual) {

        return bCryptPasswordEncoder.matches(reqpass, actual);


    }

    public static String getencryptedpassword(String user_pass){


        return  bCryptPasswordEncoder.encode(user_pass);

    }

}
