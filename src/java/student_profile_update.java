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
public class student_profile_update extends HttpServlet {

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
            out.println("<title>Servlet student_profile_update</title>");            
                     out.println("<link href=\"login.css\" rel=\"stylesheet\">");
            out.println("</head>");
            out.println("<body class=\"bg_img\">");
            String rollno="";
            HttpSession session=request.getSession(false);
            if(session!=null)
            {
                rollno=(String)session.getAttribute("rollno");
            }
           out.println("<div class=\"cont1\">"); 
           out.println("  <img src=\"gallery/logo.png\" style=\"width: 60%; height: 35%;\">");
           
           
           try
           {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cccms","root","");
                PreparedStatement p=con.prepareStatement("select * from student where rollno=?");
                p.setString(1,rollno);
                ResultSet rs=p.executeQuery();
                out.println("<center>");
               
                out.println("<div  class=\"log_cont\">");
               
                out.println("<form action=\"student_update\">");
                out.println("<table>");
                out.println("<h1> STUDENT DETAILS </h1>");
                while(rs.next())
                {
                  out.println("<tr> <th> NAME: </th>  <th> <input type=\"text\" name=\"txt1\" value="+rs.getString("name")+" class=\"ip_txt\"> </th> </tr>");
                  out.println("<tr> <th> PASSWORD:  </th>  <th><input type=\"text\" name=\"txt2\" value="+rs.getString("password")+" class=\"ip_txt\"></th> </tr>");
                  
                }
              
               out.println("</table>");     
               out.println("<br>");     
               if(!rollno.equals(""))
                {
            
                 HttpSession session1=request.getSession();
                 session1.setAttribute("rollno",rollno);
                }
               out.println("<input type=\"submit\" value=\"UPDATE\" class=\"btn_lg\">");
               out.println("<br><br>");   
          
               out.println("</form>");
               out.println("<a href=\"student_home.html\"><input type=\"submit\" value=\"Cancel\" class=\"btn_lg\" align=\"left\"></a>");
               out.println("<br><br>"); 
               out.println("</div>");
               out.println("</center>");
              out.println("</div>"); 
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
