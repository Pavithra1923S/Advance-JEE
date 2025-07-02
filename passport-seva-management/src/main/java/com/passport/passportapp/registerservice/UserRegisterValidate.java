package com.passport.passportapp.registerservice;

import com.passport.dto.UserDto;
import com.passport.passportapp.repository.RegisterUserServiceImpl;
import com.passport.passportapp.repository.UserRegisterServiceRepo;

public class UserRegisterValidate implements UserRegisterService{
    UserRegisterServiceRepo userRegisterServiceRepo;

    public UserRegisterValidate(){
        userRegisterServiceRepo = new RegisterUserServiceImpl();
    }

    @Override

        public boolean validAndSaveUser(UserDto dto) {
            boolean userValid = false;
            boolean isFirstNameValid = false;
            boolean isGenderValid = false;
            boolean isEmailValid = false;
            boolean islastname = false;
            boolean ispassword = false;



            if (dto.getFirstName() != null && !dto.getFirstName().isEmpty()) {
                isFirstNameValid = true;
            }
if(dto.getLastname() !=null && !dto.getLastname().isEmpty()){
    islastname = true;
}


            if (dto.getGender() != null && !dto.getGender().isEmpty()) {
                isGenderValid = true;
            }

            if (dto.getEmailId() != null && !dto.getEmailId().isEmpty()) {
                isEmailValid = true;
            }
        if (dto.getPassword() != null && !dto.getPassword().isEmpty()) {
            ispassword = true;
        }


//            if (dto.getLoginId() != null && !dto.getLoginId().isEmpty()) {
//                isLoginIdValid = true;
//            }



            if (isFirstNameValid  && isGenderValid && islastname && ispassword &&
                    isEmailValid  ) {
                userValid = userRegisterServiceRepo.saveUser(dto);
            }

            return userValid;
        }
}


