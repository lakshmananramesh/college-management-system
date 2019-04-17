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
public class bus_student_update1 extends HttpServlet {

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
            out.println("<title>Servlet bus_student_update1</title>");            
              out.println("<link href=\"login.css\" rel=\"stylesheet\">");
             out.println(" <link href=\"https://fonts.googleapis.com/css?family=Montserrat:600\" rel=\"stylesheet\">");
             out.println(" <link href=\"https://fonts.googleapis.com/css?family=Quicksand:500\" rel=\"stylesheet\">");
            out.println("</head>");
            out.println("<body class=\"bg_img\">");
           
           
           out.println("    <div>\n" +
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
           
           String rollno=request.getParameter("txt1");
           int r=Integer.parseInt(rollno);
           String name="",bus="";
           try
           {
               
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cccms","root","");
                 PreparedStatement ps = con.prepareStatement("Select * from student where rollno=?");
                 ps.setInt(1, r);
                 ResultSet rs = ps.executeQuery();
                 if(rs.next())
                 {
                     name=rs.getString("name");
                     bus=rs.getString("bus_id");
                     
                 }
                 
                 out.println(" <center>\n" +
"                <div class=\"log_cont\" style=\"float:left; width: 50%;\">\n" +
"            \n" +
"                 <form action=\"bus_student_update2\" method=\"post\">\n" +
"                    \n" +
"                        <table cellpadding=\"5\" cellspacing=\"10\" >\n" +
"                                <tr>\n" +
"                                        <th colspan=2> <h1> BUS - STUDENT UPDATE </h1></th>\n" +
"                                </tr>\n" +
"                                <tr>\n" +
"                                        <th>NAME : </th> <th>" +name+"  </th>\n" +
"                                </tr>\n" +
"                               \n" +
"        <tr>\n" +
"                                        <th>Rollno : </th> <th>" +r+"  </th>\n" +
"                                </tr>\n" +
 "       <tr>\n" +
"                                        <th>Bus route : </th> <th>" +bus+"  </th>\n" +
"                                </tr>\n" +
"                               \n" +
"                               \n");
                          out.println("");   
                 
                 PreparedStatement pw = con.prepareStatement("Select * from bus_route");
                 ResultSet rw = pw.executeQuery();
                  out.println("<center><th> ROUTE : </th> <th> <select name=\"txt1\" style=\"width:100%; float:left;\">");
                //  out.println("<option value=\"null\"> null </option>");
                  while(rw.next())
                {
                   out.println("<option value="+rw.getString("place")+"> "+rw.getString("place")+" </option>");
                }
                   out.println("</select></th></tr> </center>");
                   
                   //out.println("</center>");
                     if(!rollno.equals(" "))
                {
                   HttpSession session1=request.getSession();
                    session1.setAttribute("rollno",rollno);
                 
                }
                   
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
