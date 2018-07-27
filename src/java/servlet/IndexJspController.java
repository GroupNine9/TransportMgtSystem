package servlet;

import entity.Vehicle;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.VehicleFacade;

/**
 *
 * @author GraceTina
 */
@WebServlet(name = "IndexJspController", urlPatterns = {"/"})
public class IndexJspController extends HttpServlet {
    
    @EJB
    private VehicleFacade vehicleFacade;

    public void setVehicleFacade(VehicleFacade vehicleFacade) {
        this.vehicleFacade = vehicleFacade;
    }
    
    /**
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
                .getRequestDispatcher("/WEB-INF/jsp/index.jsp")
                .forward(request, response);
    }

    /**
     * .
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
}
