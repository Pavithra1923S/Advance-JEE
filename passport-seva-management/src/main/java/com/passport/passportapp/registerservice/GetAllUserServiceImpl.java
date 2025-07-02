package com.passport.passportapp.registerservice;


import com.passport.dto.UserDto;
import com.passport.passportapp.repository.GetAllUserRepository;
import com.passport.passportapp.repository.GetAllUserRepositoryImpl;

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





