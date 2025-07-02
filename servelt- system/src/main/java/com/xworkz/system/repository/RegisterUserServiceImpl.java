package com.xworkz.system.repository;

import com.xworkz.system.dto.UserDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class RegisterUserServiceImpl implements UserRegisterServiceRepo{
    @Override

    public boolean saveUser(UserDto dto) {
        System.out.println(dto);
        //jdbc
        boolean userRegistered = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.
                    getConnection("jdbc:mysql://localhost:3306/servlet_system", "root", "Biryani@01");
            Statement statement = conn.createStatement();
            int noOfRowsAffected =
                    statement.executeUpdate("insert into user_table values(" + dto.getUserId() + "," +
                            "'" + dto.getFirstName() + "'," +
                            "'" + dto.getLastname() + "'," +
                            "'" + dto.getGender() + "'," +
                            "'" + dto.getEmailId() + "'," +
                            "'" + dto.getPassword() + "')");
            statement.close();
            conn.close();

            if (noOfRowsAffected > 0) {
                userRegistered = true;
            }
        }catch(ClassNotFoundException | SQLException e)
        {
            e.printStackTrace();
        }

        System.out.println(dto);

        return userRegistered;
    }
}
