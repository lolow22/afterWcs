package fr.wildcodeschool.afterwcs;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "InscriptionServlet", urlPatterns = "/inscription")
public class InscriptionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        initUser(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        initUser(request,response);
    }
    private void initUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstname = request.getParameter("firstNameValue");
        String lastname = request.getParameter("lastNameValue");
        String password = request.getParameter("password");
        String email = request.getParameter("emailValue");
        String school = request.getParameter("schoolValue");
        boolean admin = Boolean.parseBoolean(request.getParameter("isAdminValue"));


        UserModel userModel = null;
        if (firstname != null && lastname != null && password != null && email !=null && school != null && !firstname.isEmpty() && !lastname.isEmpty()
                && !password.isEmpty() && !email.isEmpty() && !school.isEmpty()){
            userModel = new UserModel(firstname, lastname, email, password, school, admin);

        }
        request.setAttribute("user", userModel);
        this.getServletContext().getRequestDispatcher("/WEB-INF/inscription.jsp").forward(request,response);
    }
}
