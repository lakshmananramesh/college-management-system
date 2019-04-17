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

/**
 *
 * @author HP
 */
public class bus_student_add extends HttpServlet {

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
            out.println("<title>Servlet bus_student_add</title>"); 
            
            
            out.println(" <link href=\"login.css\" rel=\"stylesheet\">\n" +
"        <link href=\"https://fonts.googleapis.com/css?family=Montserrat:600\" rel=\"stylesheet\">\n" +
"        <link href=\"https://fonts.googleapis.com/css?family=Quicksand:500\" rel=\"stylesheet\">\n" +
"    </head>\n" +
"        <body class=\"bg_img\">\n" +
"        <div>\n" +
"            <div class=\"cont1\">\n" +
"                <img src=\"gallery/logo.png\" style=\"width: 60%; height: 35%;\">\n" +
"            </div>\n" +
"            <div class=\"cont1\">\n" +
"              \n" +
"                <table cellspacing=\"10create \">\n" +
"                    <tr>\n" +
"                            <th><a href=\"admission_home.html\"><input type=\"submit\" value=\"HOME\" class=\"btn_lg\"> </a> </th> \n" +
"                         \n" +
"                                <th><div class=\"dropdown\">\n" +
"                               <button class=\"dropbtn\">STUDENT</button> \n" +
"                               <div class=\"dropdown-content\">\n" +
"                               <a href=\"add_student\">ADD STUDENT</a> \n" +
"                               <a href=\"late_entery_form\">LATE ENTERY </a> \n" +
"                               <a href=\"admission_update.html\">STUDENT UPDATE</a> \n" +
"                              <a href=\"admission_student_delete.html\">DELETE STUDENT</a> \n" +
"\n" +
"                               </div>\n" +
"                             </div></th>\n" +
"                             \n" +
"                             <th><div class=\"dropdown\">\n" +
"                               <button class=\"dropbtn\">COLLEGE BUS</button> \n" +
"                               <div class=\"dropdown-content\">\n" +
"                               <a href=\"bus_student_add\">ADD STUDENT</a> \n" +
"                              \n" +
"                               <a href=\"bus_student_update.html\">STUDENT UPDATE</a> \n" +
"                              <a href=\"bus_student_delete.html\">DELETE STUDENT</a> \n" +
"\n" +
"                               </div>\n" +
"                             </div></th>\n" +
"                            <th><a href=\"logout\"><input type=\"submit\" value=\"LOGOUT\" class=\"btn_lg\"> </a> </th> \n" +
"                    </tr>\n" +
"              \n" +
"                </table>\n" +
"            \n" +
"            </div>\n" +
"        </div>\n" +
"      ");
            
            try
            {
                 Class.forName("com.mysql.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cccms","root","");
                
                   out.println(" <br><br><br><br><br><br><br>\n" +
"            <center>\n" +
"                <div class=\"log_cont\" style=\"float:left; width: 50%;\">\n" +
"            \n" +
"                 <form action=\"bus_student_add1\" method=\"post\">\n" +
"                    \n" +
"                        <table cellpadding=\"5\"   >\n" +
"                                <tr>\n" +
"                                        <th colspan=2> <h1> COLLEGE BUS - ADD STUDENT </h1></th>\n" +
"                                </tr>\n" +
"                                <tr>\n" +
"                                        <th><input type=\"text\" name=\"txt1\" class=\"ip_txt\" placeholder=\"Roll Number\"> </th>\n" +
"                                " );
                 //  out.println("<center>");
                    PreparedStatement pw = con.prepareStatement("Select * from bus_route");
                 ResultSet rw = pw.executeQuery();
                  out.println("<center><th> ROUTE : <br><select name=\"txt2\" style=\"width:100%; float:left;\">");
                //  out.println("<option value=\"null\"> null </option>");
                  while(rw.next())
                {
                   out.println("<option value="+rw.getString("place")+"> "+rw.getString("place")+" </option>");
                }
                   out.println("</select></th></tr> </center>");
                   
                   //out.println("</center>");
                   
                   
                   out.println("<tr>\n" +
"                                        <td colspan=2><center> <input type=\"submit\" value=\"submit\" class=\"btn_lg\"> \n" +
"                                </tr>\n" +
"            \n" +
"                        </table>\n" +
"                         \n" +
"                </form>\n" +
"           \n" +
"       </div>\n" +
"         </center>"); 
                          
       
                
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
