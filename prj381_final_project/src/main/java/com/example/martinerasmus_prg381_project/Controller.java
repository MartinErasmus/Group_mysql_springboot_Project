package com.example.martinerasmus_prg381_project;

import com.example.martinerasmus_prg381_project.student.Student;
import com.example.martinerasmus_prg381_project.student.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    private StudentRepository userRepo;

    @RequestMapping("/home")
    public ModelAndView index () {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping("/register11")
    public ModelAndView showRegistrationForm(Model model) {
        model.addAttribute("user", new Student());
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("Register");
        return modelAndView;
    }

    @PostMapping("/register_user")
    public String processRegister(Student user) {
        userRepo.save(user);
        return "register_success";
    }
}
