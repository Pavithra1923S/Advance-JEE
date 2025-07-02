package com.xworkz.app.repo;

import com.xworkz.app.dto.UserDto;

public interface GetAllUserRepository {
    UserDto[] fetchAllUsers();
}
