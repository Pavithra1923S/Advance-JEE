package com.passport.passportapp.repository;

import com.passport.dto.UserDto;

public interface UserRegisterServiceRepo {
    boolean saveUser(UserDto dto);
}
