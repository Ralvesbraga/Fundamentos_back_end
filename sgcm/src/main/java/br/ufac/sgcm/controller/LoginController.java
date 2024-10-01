package br.ufac.sgcm.controller;

import java.io.IOException;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginController {

    public void processFormRequest(HttpServletRequest req, HttpServletResponse res){
        String paramSubmit = req.getParameter("submit");
        String paramNome = req.getParameter("email");
        String paramSenha = req.getParameter("senha");

        if (paramNome != null && paramSenha != null && paramSubmit != null) {
            try {
                res.sendRedirect("index.jsp");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }    
}
