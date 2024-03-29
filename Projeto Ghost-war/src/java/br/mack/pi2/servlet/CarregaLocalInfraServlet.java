/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mack.pi2.servlet;

import br.mack.pi2.ejb.interfaces.InfraestruturaRemote;
import br.mack.pi2.ejb.interfaces.LocaisRemote;
import br.mack.pi2.ejb.interfaces.UnidadeAcademicaRemote;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 41180283
 */
public class CarregaLocalInfraServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @EJB InfraestruturaRemote oInfraCRUD;
    @EJB LocaisRemote oLocalCRUD;
    @EJB UnidadeAcademicaRemote oUnidadeAcademicaCRUD;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
          request.getSession().setAttribute("locais", oLocalCRUD.getAllLocais());
          request.getSession().setAttribute("unidadesAcademicas", oUnidadeAcademicaCRUD.getAllUA());
          response.sendRedirect("cadEvento.jsp");
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
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
     * Handles the HTTP
     * <code>POST</code> method.
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
