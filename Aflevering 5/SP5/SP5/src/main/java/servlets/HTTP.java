package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "HTTP", urlPatterns = {"/HTTP"})
public class HTTP extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet HTTP</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet HTTP at " + request.getContextPath() + "</h1>");
            
            out.println("<p>Host: " + request.getHeader("Host") + "</p>");
            out.println("<p>Connection: " + request.getHeader("Connection") + "</p>");
            out.println("<p>Cache Control: " + request.getHeader("Cache-Control") + "</p>");
            out.println("<p>Accept: " + request.getHeader("Accept") + "</p>");
            out.println("<p>User Agent: " + request.getHeader("User-Agent") + "</p>");
            out.println("<p>Accept Encoding: " + request.getHeader("Accept-Encoding") + "</p>");
            out.println("<p>Accept Language: " + request.getHeader("Accept-Language") + "</p>");
            
            out.println("<a href='index.html'>Til index.html</a>");
            out.println("</body>");
            out.println("</html>");
        }
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
