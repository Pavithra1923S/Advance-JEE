package com.xworkz.system.repository;

import com.xworkz.system.dto.UserDto;
import com.xworkz.system.repository.GetAllUserRepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
public class GetAllUserRepositoryImpl implements GetAllUserRepository {

    UserDto userDtos[];
    int index;

    @Override
    public UserDto[] fetchAllUsers() {
        int count = 1;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet_system", "root", "Biryani@01");
            PreparedStatement pstmt = connection.
                    prepareStatement("select * from user_table");
            ResultSet rs = pstmt.executeQuery();
            index = 1;
            while(rs.next()){
                count++;
            }
            userDtos = new UserDto[count];
            System.out.println("Just Init size for UserDtos array");
            rs = pstmt.executeQuery();
            while(rs.next()){
                System.out.println("Started collecting the Data");
                UserDto  userDto = new UserDto();
                userDto.setUserId(rs.getInt(1));
                userDto.setFirstName(rs.getString(2));
                userDto.setLastname(rs.getString(3));
                userDto.setGender(rs.getString(4));
                userDto.setEmailId(rs.getString(5));
                userDto.setPassword(rs.getString(6));

                System.out.println("done");
                userDtos[index] = userDto;
                index++;
            }
            rs.close();
            pstmt.close();
            connection.close();
        } catch ( ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return userDtos;
    }
}






