package org.example;

import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws SQLException {
        // import jdbc
        // start
        // load driver and create connection
        // create a query
        // execute
        // analyse result
        // close the connection
        String url = "jdbc:mysql://localhost:3306/company";
        String username = "root";
        String password = "1234";
        Connection newcon = DriverManager.getConnection(url,username,password);
        System.out.println("Connection Eastablished");
        Statement st = newcon.createStatement();



        // Create
//        String query = """
//                Create table if not exists student
//                (
//                    sid Integer,
//                    name varchar(50),
//                    mobile char(10),
//                    marks Integer
//                )
//
//                """;
//
//        boolean res = st.execute(query);
//        System.out.println(res);



        // Insert
//


        // UpdateString insertData = """
        ////                insert into student (sid, name, mobile, marks)
        ////                    values
        ////                            (1, 'Rahul', '9876543210', 85),
        ////                            (2, 'Amit', '9123456789', 78),
        ////                            (3, 'Neha', '9988776655', 92),
        ////                            (4, 'Pooja', '9012345678', 88),
        ////                            (5, 'Ravi', '9090909090', 74);
        ////                """;
        ////        st.executeUpdate(insertData);
        ////        System.out.println("Data added to table");
//        String updateData = """
//                update student
//                    set name = "nayan"
//                    where name = "Neha"
//                """;
//        st.executeUpdate(updateData);
//        System.out.println("Data updated");

        // Delete
        String deleteData = """
                delete from student
                where sid = 4 
                """;
        st.executeUpdate(deleteData);
        System.out.println("Data deleted");
        // Read
        String read = "Select * from company.student";
        ResultSet resRead = st.executeQuery(read);

        while(resRead.next()){
            System.out.println(resRead.getNString("name"));
        }

        newcon.close();
    }
}
