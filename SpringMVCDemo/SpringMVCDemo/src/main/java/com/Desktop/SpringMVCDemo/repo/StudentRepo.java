package com.Desktop.SpringMVCDemo.repo;
import com.Desktop.SpringMVCDemo.Student;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;


@Component
public class StudentRepo {
    Connection con;
    private final String url ="jdbc:mysql://localhost:3306/person";
    private final String username = "root";
    private final String password = "1234";

    public StudentRepo() {
        try {
            con = DriverManager.getConnection(url, username, password);
            System.out.println("✅ DB connected");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public boolean save(List<Student> studentList) {
        try {
            System.out.println("🔥 save() method called");

            String query = """
            CREATE TABLE IF NOT EXISTS student (
                id INT PRIMARY KEY,
                age INT,
                name VARCHAR(100),
                branch VARCHAR(100),
                cgpa DECIMAL(4,2),
                isplaced BOOLEAN
            )
        """;

            PreparedStatement st = con.prepareStatement(query);
            st.executeUpdate();

            System.out.println("✅ Table created");
            return  true;

        } catch (SQLException e) {
            e.printStackTrace();
            return  false;
        }
    }


}