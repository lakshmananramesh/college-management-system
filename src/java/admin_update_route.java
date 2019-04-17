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

/**
 *
 * @author HP
 */
public class admin_update_route extends HttpServlet {

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
            out.println("<title>Servlet admin_update_route</title>");            
           out.println("<link href=\"login.css\" rel=\"stylesheet\">\n" +
"        <link href=\"slide.css\" rel=\"stylesheet\">\n" +
"        <link href=\"https://fonts.googleapis.com/css?family=Montserrat:600\" rel=\"stylesheet\">\n" +
"        <link href=\"https://fonts.googleapis.com/css?family=Quicksand:500\" rel=\"stylesheet\">\n" +
"    </head>\n" +
"    \n" +
"   <body class=\"bg_img\">\n" +
"        <div>\n" +
"            <div class=\"cont1\">\n" +
"                <img src=\"gallery/logo.png\" style=\"width: 60%; height: 35%;\">\n" +
"            </div>\n" +
"            <div class=\"cont1\"> \n" +
"                <table cellspacing=\"10create \">\n" +
"                     <tr>\n" +
"                            <th><a href=\"admin_home.html\"><input type=\"submit\" value=\"HOME\" class=\"btn_lg\"> </a> </th> \n" +
"                         \n" +
"                                <th><div class=\"dropdown\">\n" +
"                               <button class=\"dropbtn\">COURSE</button> \n" +
"                               <div class=\"dropdown-content\">\n" +
"                               <a href=\"\">ADD COURSE</a> \n" +
"                               \n" +
"                               <a href=\"\">UPDATE COURSE</a> \n" +
"                              <a href=\"\">DELETE COURSE</a> \n" +
"\n" +
"                               </div>\n" +
"                             </div></th>\n" +
"                             \n" +
"                             <th><a href=\"\"><input type=\"submit\" value=\"UPDATE FEE\" class=\"btn_lg\"> </a> </th>\n" +
"                             \n" +
"                             <th><div class=\"dropdown\">\n" +
"                               <button class=\"dropbtn\">COLLEGE BUS</button> \n" +
"                               <div class=\"dropdown-content\">\n" +
"                               <a href=\"admin_add_route.html\">ADD ROUTE</a> \n" +
"                              \n" +
"                               <a href=\"admin_update_route\">UPDATE ROUTE</a> \n" +
"                              <a href=\"\">DELETE ROUTE</a> \n" +
"\n" +
"                               </div>\n" +
"                             </div></th>\n" +
"                             \n" +
"                              <th><div class=\"dropdown\">\n" +
"                               <button class=\"dropbtn\">TEACHER</button> \n" +
"                               <div class=\"dropdown-content\">\n" +
"                               <a href=\"\">ADD TEACHER</a> \n" +
"                             \n" +
"                               <a href=\"\">UPDATE TEACHER</a> \n" +
"                              <a href=\"\">DELETE TEACHER</a> \n" +
"                               <a href=\"\"> ADD ATTENDENCE</a> \n" +
"                                 <a href=\"\">UPDATE ATTENDENCE</a>\n" +
"                               </div>\n" +
"                             </div></th> </tr>\n" +
"        <tr>                  \n" +
"            \n" +
"            <th><div class=\"dropdown\">\n" +
"                               <button class=\"dropbtn\">EXAM TIMETABLE</button> \n" +
"                               <div class=\"dropdown-content\">\n" +
"                               <a href=\"\">PERIODICAL</a> \n" +
"                           <a href=\"\">UPDATE PERI0DICAL</a> \n" +
"                           <a href=\"\">SEMSETER</a> \n" +
"                           <a href=\"\">UPDATE SEMESTER</a> \n" +
"                               \n" +
"\n" +
"                               </div>\n" +
"                             </div></th>\n" +
"            \n" +
"            \n" +
"            <th><div class=\"dropdown\">\n" +
"                               <button class=\"dropbtn\">CLASS TIMETABLE</button> \n" +
"                               <div class=\"dropdown-content\">\n" +
"                               <a href=\"\">ADD TIMETABLE</a> \n" +
"                           <a href=\"\">UPDATE TIMETABE</a> \n" +
"                          \n" +
"                               \n" +
"\n" +
"                               </div>\n" +
"                             </div></th>\n" +
"                               <th><div class=\"dropdown\">\n" +
"                               <button class=\"dropbtn\">TEACHER TIMETABLE</button> \n" +
"                               <div class=\"dropdown-content\">\n" +
"                               <a href=\"\">ADD TIMETABLE</a> \n" +
"                           <a href=\"\">UPDATE TIMETABE</a> \n" +
"                          \n" +
"                               \n" +
"\n" +
"                               </div> \n" +
"                             </div></th>\n" +
"      <th><a href=\"logout\"><input type=\"submit\" value=\"LOGOUT\" class=\"btn_lg\"> </a> </th> \n" +
"                    </tr>\n" +
"              \n" +
"                </table>\n" +
"            </div>\n" +
"        </div>");
          
           try
           {
                Class.forName("com.mysql.jdbc.Driver");
               Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cccms","root","");
                PreparedStatement p=con.prepareStatement("select* from bus_route");
                ResultSet rs=p.executeQuery();
                out.println(" <div class=\"log_cont\" style=\"float:left; width: 50%;\">");
                
                out.println("<form action=\"admin_update_route1\">");
                out.println("<center> <h1> UPDATE ROUTE </h1>");
                 out.println(" <h4> Select route </h4> ");
                 
                      //out.println("");     out.println("");
                out.println("<select name=\"txt1\" style=\"width:50%;\" >");
                while(rs.next())
                {
                    out.println("<option value="+rs.getString("place")+"> "+rs.getString("place")+"  </option>");
                    
                }
                
                out.println("</select> <br><br>");
                out.println("<input type=\"submit\" value=\"submit\" class=\"btn_lg\">  </center> <br>");
                out.println("</form>");
               
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
