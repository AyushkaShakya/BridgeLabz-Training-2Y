package com.project.student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseManager {

    private static final String URL = "jdbc:mysql://localhost:3306/studentdb";
    private static final String USER = "root";
    private static final String PASS = "root";

    public static Connection getConnection() throws Exception {
        return DriverManager.getConnection(URL, USER, PASS);
    }

    // INSERT STUDENT
    public static void insertStudent(student s) throws Exception {
        String query = "INSERT INTO students VALUES (?, ?, ?, ?)";
        Connection con = getConnection();
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, s.getId());
        ps.setString(2, s.getName());
        ps.setString(3, s.getCourse());
        ps.setInt(4, s.getMarks());
        ps.executeUpdate();
        con.close();
    }

    // UPDATE
    public static void updateStudent(student s) throws Exception {
        String q = "UPDATE students SET name=?, course=?, marks=? WHERE id=?";
        Connection con = getConnection();
        PreparedStatement ps = con.prepareStatement(q);
        ps.setString(1, s.getName());
        ps.setString(2, s.getCourse());
        ps.setInt(3, s.getMarks());
        ps.setInt(4, s.getId());
        ps.executeUpdate();
        con.close();
    }

    // DELETE
    public static void deleteStudent(int id) throws Exception {
        String q = "DELETE FROM students WHERE id=?";
        Connection con = getConnection();
        PreparedStatement ps = con.prepareStatement(q);
        ps.setInt(1, id);
        ps.executeUpdate();
        con.close();
    }

    // READ ALL
    public static List<student> getAllStudents() throws Exception {
        List<student> list = new ArrayList<>();
        Connection con = getConnection();
        String q = "SELECT * FROM students";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(q);

        while (rs.next()) {
            list.add(new student(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getInt(4)
            ));
        }
        con.close();
        return list;
    }
}
