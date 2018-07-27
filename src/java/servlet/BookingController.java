/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import entity.Bookedtrip;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.BookedtripFacade;

/**
 *
 * @author HP-
 */
@WebServlet(name = "BookingController", urlPatterns = {"/BookingController"})
public class BookingController extends HttpServlet {
     @EJB
    private BookedtripFacade booking;

    public void setBooking(BookedtripFacade booking) {
        this.booking = booking;
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
         getServletContext()
                .getRequestDispatcher("/WEB-INF/jsp/Booking.jsp")
                .forward(request, response);
        
        
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
        
        Bookedtrip newtrip = new Bookedtrip();
        
        newtrip.setDestination(request.getParameter("destination"));
        newtrip.setDeparturedate(request.getParameter("departuredate"));
        newtrip.setReturndate(request.getParameter("returndate"));
        newtrip.setPasscount(request.getParameter("passcount"));
        newtrip.setDuration(request.getParameter("duration"));
        
        
        
        BookedtripFacade.create(newtrip);
        
    }

    

}
