package br.ufac.sgcm.controller;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginServlet  extends HttpServlet{
    LoginController controller;

    public LoginServlet(){
        controller = new LoginController();
    }
    
    
    public void doPost(HttpServletRequest req, HttpServletResponse res){
        controller.processFormRequest(req, res);
    }
}
