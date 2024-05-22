package com.jdbclearning.daos;

import com.jdbclearning.entities.Student;

import java.util.List;

public interface StudentDao {
//    create,display,update,delete

    public int insertStudent(Student student);
    public List<Student> getAllStudents();
    public int updateStudent(int id, Student updateStudent);
    public int deleteStudent(int id);
}
