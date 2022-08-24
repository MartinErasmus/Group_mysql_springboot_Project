//package com.example.martinerasmus_prg381_project;
//
//import com.example.martinerasmus_prg381_project.student.StudentRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
////@Controller
//@RestController
//public class AppController {
//
//    @Autowired
//    private StudentRepository studentRepo;
//
//    @RequestMapping("/")
//    @GetMapping("")
//    public String  viewHomePage() {
//        return "<!DOCTYPE html>\n" +
//                "<html xmlns:th=\"http://www.thymeleaf.org\">\n" +
//                "<head>\n" +
//                "    <meta charset=\"ISO-8859-1\">\n" +
//                "    <title>Welcome to CodeJava Home</title>\n" +
//                "    <link rel=\"stylesheet\" type=\"text/css\" href=\"/webjars/bootstrap/css/bootstrap.min.css\" />\n" +
//                "    <script type=\"text/javascript\" src=\"/webjars/jquery/jquery.min.js\"></script>\n" +
//                "    <script type=\"text/javascript\" src=\"/webjars/bootstrap/js/bootstrap.min.js\"></script>\n" +
//                "</head>\n" +
//                "<body>\n" +
//                "<div class=\"container text-center\">\n" +
//
//                "</div>\n" +
//                "\n" +
//                "</body>\n" +
//                "</html>";
//    }
//
//    @RequestMapping("/Register")
//    @GetMapping("")
//    public String  viewRegisterPage() {
//        return "<!DOCTYPE html>\n" +
//                "<html xmlns:th=\"http://www.thymeleaf.org\">\n" +
//                "<head>\n" +
//                "    <meta charset=\"ISO-8859-1\">\n" +
//                "    <title>Sign Up - CodeJava</title>\n" +
//                "    <link rel=\"stylesheet\" type=\"text/css\" href=\"/webjars/bootstrap/css/bootstrap.min.css\" />\n" +
//                "    <script type=\"text/javascript\" src=\"/webjars/jquery/jquery.min.js\"></script>\n" +
//                "    <script type=\"text/javascript\" src=\"/webjars/bootstrap/js/bootstrap.min.js\"></script>\n" +
//                "</head>\n" +
//                "<body>\n" +
//                "    <div class=\"container text-center\">\n" +
//                "        <div>\n" +
//                "            <h1>User Registration - Sign Up</h1>\n" +
//                "        </div>\n" +
//                "        <form th:action=\"@{/process_register}\" th:object=\"${user}\"\n" +
//                "            method=\"post\" style=\"max-width: 600px; margin: 0 auto;\">\n" +
//                "        <div class=\"m-3\">\n" +
//                "            <div class=\"form-group row\">\n" +
//                "                <label class=\"col-4 col-form-label\">E-mail: </label>\n" +
//                "                <div class=\"col-8\">\n" +
//                "                    <input type=\"email\" th:field=\"*{email}\" class=\"form-control\" required />\n" +
//                "                </div>\n" +
//                "            </div>\n" +
//                "             \n" +
//                "            <div class=\"form-group row\">\n" +
//                "                <label class=\"col-4 col-form-label\">Password: </label>\n" +
//                "                <div class=\"col-8\">\n" +
//                "                    <input type=\"password\" th:field=\"*{password}\" class=\"form-control\"\n" +
//                "                            required minlength=\"6\" maxlength=\"10\"/>\n" +
//                "                </div>\n" +
//                "            </div>\n" +
//                "             \n" +
//                "            <div class=\"form-group row\">\n" +
//                "                <label class=\"col-4 col-form-label\">First Name: </label>\n" +
//                "                <div class=\"col-8\">\n" +
//                "                    <input type=\"text\" th:field=\"*{firstName}\" class=\"form-control\"\n" +
//                "                            required minlength=\"2\" maxlength=\"20\"/>\n" +
//                "                </div>\n" +
//                "            </div>\n" +
//                "             \n" +
//                "            <div class=\"form-group row\">\n" +
//                "                <label class=\"col-4 col-form-label\">Last Name: </label>\n" +
//                "                <div class=\"col-8\">\n" +
//                "                    <input type=\"text\" th:field=\"*{lastName}\" class=\"form-control\"\n" +
//                "                            required minlength=\"2\" maxlength=\"20\" />\n" +
//                "                </div>\n" +
//                "            </div>\n" +
//                "             \n" +
//                "            <div>\n" +
//                "                <button type=\"submit\" class=\"btn btn-primary\">Sign Up</button>\n" +
//                "            </div>\n" +
//                "        </div>\n" +
//                "        </form>\n" +
//                "    </div>\n" +
//                "</body>\n" +
//                "</html>";
//    }
//}
