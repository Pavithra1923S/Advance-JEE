package com.passport.passportapp.repository;

import com.passport.dto.UserDto;

public interface GetAllUserRepository {

        UserDto[] fetchAllUsers();
    }

