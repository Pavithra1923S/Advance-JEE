package com.passport.passportapp.registerservice;

import com.passport.dto.UserDto;

public interface UserRegisterService {
    boolean validAndSaveUser(UserDto dto);

}
