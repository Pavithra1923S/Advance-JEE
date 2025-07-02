package com.xworkz.system.service;

import com.xworkz.system.dto.UserDto;
import com.xworkz.system.repository.GetAllUserRepository;
import com.xworkz.system.repository.GetAllUserRepositoryImpl;

public class GetAllUserServiceImpl implements GetAllUserService {

    GetAllUserRepository repository;

    public GetAllUserServiceImpl() {
        repository = new GetAllUserRepositoryImpl();
    }
    @Override
    public UserDto[] getAllUsers() {
        return repository.fetchAllUsers();
    }
}





