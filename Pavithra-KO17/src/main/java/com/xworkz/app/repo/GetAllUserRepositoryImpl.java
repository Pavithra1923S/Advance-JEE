package com.xworkz.app.repo;

import com.xworkz.app.dto.UserDto;
import com.xworkz.app.service.GetAllUserService;

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
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/passport", "root", "Biryani@01");
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
                    userDto.setEmailId(rs.getString(4));
                    userDto.setPassword(rs.getString(5));
                    userDto.setGender(rs.getString(6));
                    System.out.println("done");
                    userDtos[index] = userDto;
                    index++;
                }
                rs.close();
                pstmt.close();
                connection.close();
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
            return userDtos;
        }

    }






