package com.passport.passportapp.registerservlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import com.passport.dto.UserDto;
import com.passport.passportapp.registerservice.GetAllUserService;
import com.passport.passportapp.registerservice.GetAllUserServiceImpl;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/getUsers")
public class GetAlluserServlet extends HttpServlet {

            GetAllUserService service ;
        public GetAlluserServlet(){
            service = new GetAllUserServiceImpl();
        }

        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


            UserDto[] dtos =  service.getAllUsers();

            for (UserDto dto: dtos ) {
                System.out.println("Dto is displaying");
            }
            req.setAttribute("listOfUsers",dtos);

            RequestDispatcher requestDispatcher = req.getRequestDispatcher("getUsers.jsp");
            requestDispatcher.forward(req , resp);

        }
    }


