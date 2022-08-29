package com.example.prg381_final_project;

import com.example.prg381_final_project.student.Student;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<Student, Long>  {


}
