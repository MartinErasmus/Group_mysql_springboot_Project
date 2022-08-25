package com.example.martinerasmus_prg381_project;

import com.example.martinerasmus_prg381_project.student.Student;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<Student, Long>  {


}
