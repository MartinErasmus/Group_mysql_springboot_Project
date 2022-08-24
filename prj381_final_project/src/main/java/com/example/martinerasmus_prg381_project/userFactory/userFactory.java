package com.example.martinerasmus_prg381_project.userFactory;

import com.example.martinerasmus_prg381_project.admin.Admin;
import com.example.martinerasmus_prg381_project.student.Student;
import com.example.martinerasmus_prg381_project.student.register.Register;
import com.example.martinerasmus_prg381_project.user;

public class userFactory {

    public user createUser(String userType){
        if (userType=="Student"){
            return new Student();
        } else if (userType=="Register") {
            return new Register();
        } else if (userType=="Admin") {
            return new Admin();
        }else {
            return null;
        }
    }
}
