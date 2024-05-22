package com.jdbclearning.daos;

import com.jdbclearning.entities.Student;
import com.jdbclearning.util.SQLConnector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao{

    @Override
    public int insertStudent(Student student) {
        int status = 0;
        try (Connection con = SQLConnector.createConnection()){
        String sql = "insert into students (name, gpa, address , grade)values(?,?,?,?)";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1,student.getName());
            stm.setDouble(2,student.getGpa());
            stm.setString(3, student.getAddress());
            stm.setString(4,student.getGrade().toString());

            stm.executeUpdate();

        }catch (SQLException e){
            e.printStackTrace();
        }
        return status;
    }

    @Override
    public List<Student> getAllStudents() {
        List <Student> students = new ArrayList<Student>();
        try (Connection con = SQLConnector.createConnection()){
            String sql = "select * from students";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet resultData = stmt.executeQuery();
            while (resultData.next()){
                Student s = new Student();
                s.setId(resultData.getInt(1));
                s.setName(resultData.getString(2));
                s.setGpa(resultData.getDouble(3));
                s.setAddress(resultData.getString(4));
                s.setGrade(resultData.getString(5));
                students.add(s);
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return students;
    }

    @Override
    public int updateStudent(int id, Student updateStudent) {
        int status = 0;
        try (Connection con = SQLConnector.createConnection()){
            String sql = "update students set name =? , gpa =? , address=? , grade=? where id =?";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1,updateStudent.getName());
            stm.setDouble(2,updateStudent.getGpa());
            stm.setString(3, updateStudent.getAddress());
            stm.setString(4, updateStudent.getGrade());
            stm.setInt(5,id);

            status = stm.executeUpdate();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
            return status;
    }

    @Override
    public int deleteStudent(int id) {
        int status = 0;
        try (Connection con = SQLConnector.createConnection()){
            String sql = "delete from students where id =?";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setInt(1,id);
            status = stm.executeUpdate();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return status;
    }
}
