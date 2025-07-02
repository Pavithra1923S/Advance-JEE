package com.xworkz.system.service;


import com.xworkz.system.dto.UserDto;

public interface UserRegisterService {
    boolean validAndSaveUser(UserDto dto);

}
