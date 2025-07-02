package com.xworkz.system.repository;

import com.xworkz.system.dto.UserDto;

public interface GetAllUserRepository {

    UserDto[] fetchAllUsers();
}

