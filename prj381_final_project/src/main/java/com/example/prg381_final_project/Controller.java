package com.example.prg381_final_project;

import com.example.prg381_final_project.student.Student;
import com.example.prg381_final_project.student.StudentRepository;
import com.example.prg381_final_project.student.StudentUpdateRepo;
import com.example.prg381_final_project.student.register.Register;
import com.example.prg381_final_project.student.register.RegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    private StudentRepository userRepo;
    @Autowired
    private StudentUpdateRepo userUpdateRepo;
    @Autowired
    private RegisterRepository courseRepo;
    Student current_student_Id= new Student();



    @RequestMapping("/home")
    public ModelAndView index () {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("adminPage");
        return modelAndView;
    }

    @GetMapping("/adminPage")
    public String listStudent(Model model) {
        List<Student> listStudent = userRepo.findAll();
        List<Register> listRegister = courseRepo.findAll();



        model.addAttribute("listStudent", listStudent);
        model.addAttribute("listRegister", listRegister);
        model.addAttribute("current_student_Id",current_student_Id);

        return "adminPage";
    }
//    @RequestMapping("/adminPage")
//    public ModelAndView adminPage () {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("adminPage");
//        return modelAndView;
//    }

    @RequestMapping("/register")
    public ModelAndView showRegistrationForm(Model model) {
        model.addAttribute("user", new Student());
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("Register");
        return modelAndView;
    }

    @RequestMapping("/edit")
    public ModelAndView showEditForm(Model model) {
        model.addAttribute("user", new Student());
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("UpdateStudent");
        return modelAndView;
    }

    @RequestMapping("/registercourse")
    public ModelAndView showRegisterCourse(Model model) {
        model.addAttribute("course", new Register());
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("RegisterCourse");
        return modelAndView;
    }


    @PostMapping("/register_user")
    public String processRegister(Student user) {
        userRepo.save(user);
        return "register_success";
    }

    @PostMapping("/update_user")
    public String processUpdate(Student user) {
        userRepo.save(user);
        return "crud_success";
    }

    @PostMapping("/register_course")
    public String processCourseRegister(Register course) {
        courseRepo.save(course);
        return "register_success";
    }

//    @PostMapping("/update_user")
//    public String UpdateStudent(Register course) {
//        userUpdateRepo.upDateStudent("1");
//        return "register_success";
//    }



    @RequestMapping("/remove")
    public String RemoveUser(Student user) {
        userRepo.deleteById(Long.valueOf(user.getStudent_id()));
        return "crud_success";
    }


//    @PostMapping("/edit")
//    public String editUser(Student user) {
//        return "UpdateStudent";
//    }

//    @RequestMapping("/updatingUsers")
//    public String UpdateStudent(Model model) {
//        model.addAttribute("update_User",update_User);
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("UpdateStudent");
//        return "UpdateStudent";
//    }
}
