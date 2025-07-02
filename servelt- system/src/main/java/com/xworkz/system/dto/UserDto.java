package com.xworkz.system.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor

    public class UserDto {
        private int userId;
        private String firstName;
        private String lastname;
        private String gender;
        private String emailId;
        private String password;

    }





