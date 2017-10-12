/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nuuptech.hellojava;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author thom
 */
public class Team1Controller extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String entrada1 = request.getParameter("entrada1");
        String entrada2 = request.getParameter("entrada2");
        String entrada3 = request.getParameter("entrada3");
                
        //Agrega la magia!       
        String resultado1 = reto1(entrada1);
        String resultado2 = reto2(entrada2);
        String resultado3 = reto3(entrada3);
        
        //Fin de la magia        
        System.out.println("Entrada1 -> " + entrada1);
        System.out.println("Entrada2 -> " + entrada2);
        System.out.println("Entrada3 -> " + entrada3);
        
        System.out.println("Resultado1 -> " + resultado1);
        System.out.println("Resultado2 -> " + resultado2);
        System.out.println("Resultado3 -> " + resultado3);
        
        request.setAttribute("result1", resultado1);
        request.setAttribute("result2", resultado2);
        request.setAttribute("result3", resultado3);
        request.getRequestDispatcher("team1result.jsp").forward(request, response);
    }
    
    String reto1(String entrada) {
        String salida = "NotImplementedYet";
        //TODO
        return salida;
    }
    String reto2(String entrada) {
        String salida = "NotImplementedYet";
        //TODO. 
        return salida;
    }
    String reto3(String entrada) {
        String salida = "NotImplementedYet";
        //TODO
        return salida;
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
