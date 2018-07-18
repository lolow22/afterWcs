package fr.wildcodeschool.afterwcs;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        initUser(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         initUser(request,response);
    }
    private void initUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("emailValue");
        String password = request.getParameter("passwordValue");

        LoginModel loginModel = null;
        if (email != null && password != null && !email.isEmpty() && !password.isEmpty()){
            loginModel = new LoginModel(password, email);

        }
        request.setAttribute("user", loginModel);
        this.getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request,response);

    }
}
