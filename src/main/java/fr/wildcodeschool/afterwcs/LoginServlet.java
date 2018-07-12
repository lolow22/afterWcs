package fr.wildcodeschool.afterwcs;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
        String username = request.getParameter("emailValue");
        String password = request.getParameter("passwordValue");

        UserModel userModel = null;
        if (username != null && password != null && !username.isEmpty() && !password.isEmpty()){
            userModel = new UserModel(username, password);

        }
        request.setAttribute("user", userModel);
        this.getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request,response);
    }
}
