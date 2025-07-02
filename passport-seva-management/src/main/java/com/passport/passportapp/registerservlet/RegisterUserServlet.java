package com.passport.passportapp.registerservlet;

import com.passport.dto.UserDto;
import com.passport.passportapp.registerservice.UserRegisterService;
import com.passport.passportapp.registerservice.UserRegisterValidate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/registration")
public class RegisterUserServlet extends HttpServlet {

    UserRegisterService service;

    public RegisterUserServlet(){
        service = new UserRegisterValidate();
        System.out.println("RegisterUserServlet object is created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost is invoked via service");

        String firstName = req.getParameter("firstName");
        String lastName =req.getParameter("lastName");
        String gender =req.getParameter("gender");
        String emailId =req.getParameter("emailId");
        String loginId =req.getParameter("loginId");
        String password =req.getParameter("password");
        String confirmPassword =req.getParameter("confirmPassword");

        UserDto dto = new UserDto();

        dto.setFirstName(firstName);
        dto.setLastname(lastName);
        dto.setGender(gender);
        dto.setEmailId(emailId);
//        dto.setLoginId(loginId);
        dto.setPassword(password);

        System.out.println(dto);


       boolean userRegistered =  service.validAndSaveUser(dto);

        System.out.println("The First Name: "+firstName);
        PrintWriter printWriter =  resp.getWriter();
        printWriter.write("thank you" + firstName + "for Registration");
    }




}


