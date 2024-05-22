package com.jdbclearning.controllers;

import com.jdbclearning.daos.StudentDaoImpl;
import com.jdbclearning.entities.Student;
import com.jdbclearning.util.SQLConnector;

public class MainController {
    public static void main(String[] args) {
        SQLConnector sqlObj = new SQLConnector();
        SQLConnector.createConnection();

        StudentDaoImpl studentImplobj = new StudentDaoImpl();
//        Student s1 = new Student("Jim", 3.5, "Manasas", "C");
//        studentImplobj.insertStudent(s1);
//        System.out.println("Successfully Added");

//        Student updatedStudent = new Student("Kim", 3.5, "Manasas", "C");
        int deleteStatus = studentImplobj.deleteStudent(111112);

        if (deleteStatus > 0 ){
            System.out.println("Student deleted successfully");
        }
        System.out.println(studentImplobj.getAllStudents());


    }
    }

