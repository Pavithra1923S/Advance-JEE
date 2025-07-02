package com.xworkz.app.service;

import com.xworkz.app.dto.UserDto;

public interface UserRegisterService  {
    boolean validAndSaveUser(UserDto dto);
}
