package com.example.prj381_final_project;

import com.example.prj381_final_project.student.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class AppController {

    @Autowired
    private StudentRepository studentRepo;

    @RequestMapping("/")
    @GetMapping("")
    public String  viewHomePage() {
        return "<!DOCTYPE html>\n" +
                "<html xmlns:th=\"http://www.thymeleaf.org\">\n" +
                "<head>\n" +
                "    <meta charset=\"ISO-8859-1\">\n" +
                "    <title>Welcome to CodeJava Home</title>\n" +
                "    <link rel=\"stylesheet\" type=\"text/css\" href=\"/webjars/bootstrap/css/bootstrap.min.css\" />\n" +
                "    <script type=\"text/javascript\" src=\"/webjars/jquery/jquery.min.js\"></script>\n" +
                "    <script type=\"text/javascript\" src=\"/webjars/bootstrap/js/bootstrap.min.js\"></script>\n" +
                "</head>\n" +
                "<body>\n" +
                "<div class=\"container text-center\">\n" +
                "    <h1>Welcome to CodeJava.net</h1>\n" +
                "    <h3><a th:href=\"/@{/users}\">List of Users</a></h3>\n" +
                "    <h3><a th:href=\"/@{/register}\">Register</a></h3>\n" +
                "    <h3><a th:href=\"/@{/login}\">Login</a></h3>\n" +
                "</div>\n" +
                "\n" +
                "</body>\n" +
                "</html>";
    }
}
