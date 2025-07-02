package com.xworkz.system.servlet;

import com.xworkz.system.dto.UserDto;
import com.xworkz.system.service.UserRegisterService;
import com.xworkz.system.service.UserRegisterValidate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/registration")
public class RegisterUserServlet extends HttpServlet {
    RegisterUserServlet registerUserServlet;

    public RegisterUserServlet(){
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

        dto.setPassword(password);

        System.out.println(dto);

        UserRegisterService user;
        user = new UserRegisterValidate();
        user.validAndSaveUser(dto);

        System.out.println("The First Name: "+firstName);
        PrintWriter printWriter =  resp.getWriter();
        printWriter.write("thank you" + firstName + "for Registration");
    }

}


