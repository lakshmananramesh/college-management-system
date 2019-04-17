/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author HP
 */
public class student_update extends HttpServlet {

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
            out.println("<title>Servlet student_update</title>");            
             out.println("<link href=\"login.css\" rel=\"stylesheet\">");
            out.println("</head>");
            out.println("<body class=\"bg_img\">");
          
            String rollno="";
            HttpSession session1=request.getSession(false);
            if(session1!=null)
            {
               rollno=(String)session1.getAttribute("rollno");
            }
            String b=request.getParameter("txt1");
            String c=request.getParameter("txt2");
            String d=request.getParameter("txt3");
            String e=request.getParameter("txt4");
            String f=request.getParameter("txt5");
            String g=request.getParameter("txt6");
            int a1=Integer.parseInt(d);
            int a2=Integer.parseInt(e);
            b = b.replaceAll(" ", "_");
            c = c.replaceAll(" ", "_");
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cccms","root","");
                PreparedStatement pa=con.prepareStatement("update student set Stud_name=?,Address=?,Parent_no=?,Contact_no=?,Stud_email_id=?,Password=? where Stud_id=?");
                pa.setString(1,b);
                pa.setString(2,c);
                pa.setInt(3, a1);
                pa.setInt(4,a2);
                pa.setString(5,f);
                pa.setString(6, g);
                pa.setString(7,rollno);
                pa.executeUpdate();
                response.sendRedirect("student_home.html");

              
           }
             catch(Exception ex)
             {
                 out.println(ex);
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
