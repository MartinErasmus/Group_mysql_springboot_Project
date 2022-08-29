package com.example.prg381_final_project.userFactory;

import com.example.prg381_final_project.admin.Admin;
import com.example.prg381_final_project.student.Student;
import com.example.prg381_final_project.student.register.Register;
import com.example.prg381_final_project.user;

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
