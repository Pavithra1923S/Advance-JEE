package com.xworkz.app.repo;

import com.xworkz.app.dto.UserDto;

public interface UserRegisterServiceRepo {
    boolean saveUser(UserDto dto) ;
}
