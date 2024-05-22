package com.jdbclearning.entities;

public class Student {
//    id,name,gpa,address,grade
    private int id;
    private String name;
    private double gpa;
    private String address;
    private String grade;
//  constructor with everything
    public Student(int id, String name, double gpa, String address, String grade) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.address = address;
        this.grade = grade;
    }
//  constructor without id
    public Student(String name, double gpa, String address, String grade) {
        this.name = name;
        this.gpa = gpa;
        this.address = address;
        this.grade = grade;
    }
//  empty constructor
    public Student (){

    }
//  getters / setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

//  creating tostring method..

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                ", address='" + address + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }


}
