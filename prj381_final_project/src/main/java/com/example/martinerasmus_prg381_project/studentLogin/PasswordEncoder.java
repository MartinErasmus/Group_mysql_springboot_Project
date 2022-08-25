package com.example.martinerasmus_prg381_project.studentLogin;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoder {

    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String password="test123";
        String encodedPassword= encoder.encode(password);

        System.out.println(encodedPassword);

    }
}
