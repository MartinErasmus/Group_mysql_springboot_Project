package com.example.prg381_final_project.student;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface StudentUpdateRepo extends CrudRepository<Student,Long> {
    @Query("DELETE Student u WHERE u.student_name = :id")
    public void removeStudent(@Param("id") String id);

}
