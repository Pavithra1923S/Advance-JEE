package com.xworkz.system.servlet;

import com.xworkz.system.dto.UserDto;
import com.xworkz.system.service.GetAllUserServiceImpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/getUsers")
public class GetAlluserServlet extends HttpServlet {

    GetAllUserServiceImpl service ;
    public GetAlluserServlet(){
        service = new GetAllUserServiceImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        UserDto[] dtos =  service.getAllUsers();

        for (UserDto dto: dtos ) {
            System.out.println("Dto is displaying");
        }

        String userName = "Pavithra";
        req.setAttribute("uName" , userName);
        req.setAttribute("listOfUsers",dtos);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("getUsers.jsp");
        requestDispatcher.forward(req , resp);

    }
}


