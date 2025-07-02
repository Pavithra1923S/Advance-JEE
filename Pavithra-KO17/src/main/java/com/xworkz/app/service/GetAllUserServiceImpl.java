package com.xworkz.app.service;


import com.xworkz.app.dto.UserDto;
import com.xworkz.app.repo.GetAllUserRepository;
import com.xworkz.app.repo.GetAllUserRepositoryImpl;

public class GetAllUserServiceImpl implements GetAllUserService{

    GetAllUserRepository repository;

    public GetAllUserServiceImpl() {
        repository = new GetAllUserRepositoryImpl();
    }
    @Override
    public UserDto[] getAllUsers() {
        return repository.fetchAllUsers();
    }

}





