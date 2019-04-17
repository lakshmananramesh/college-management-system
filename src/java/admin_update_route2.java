/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import java.sql.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author HP
 */
public class admin_update_route2 extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet admin_update_route2</title>");            
            out.println("</head>");
            out.println("<body>");
           String a=request.getParameter("txt1");
           String b=request.getParameter("txt2");
           String c=request.getParameter("txt3");
            int a1=Integer.parseInt(a);
            int c1=Integer.parseInt(c);
            
              String d="";
              HttpSession session3=request.getSession(false);
            if(session3!=null)
            {
               d=(String)session3.getAttribute("a");
             
            }
            try
            {
                 Class.forName("com.mysql.jdbc.Driver");
               Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cccms","root","");
               PreparedStatement p=con.prepareStatement("update bus_route set id=? ,place=? , fee=? where place=?");
               p.setInt(1,a1);
                p.setString(2,b);
                p.setInt(3,c1);
                 p.setString(4,d);
                p.executeUpdate();
                
                
                PreparedStatement pc = con.prepareStatement("select * from student where bus_id=? ");
               pc.setString(1, d);
                 ResultSet rs=pc.executeQuery();
                 while(rs.next())
                 {
                     String x=rs.getString("bus_id");
                   //    out.println(x);
                      PreparedStatement pq = con.prepareStatement("update student set  bus_id=? where bus_id=?");
                pq.setString(1,b);
                 pq.setString(2,x);
                
                pq.executeUpdate();
                 } 
                rs.close();
                
                response.sendRedirect("admin_home.html");
            }
            catch(Exception e)
            {
                out.println(e);
            } 
           
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
