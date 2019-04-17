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
public class late_entery_form extends HttpServlet {

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
            out.println("<title>Servlet late_entery_form</title>");            
       out.println("<link href=\"login.css\" rel=\"stylesheet\">");
             out.println(" <link href=\"https://fonts.googleapis.com/css?family=Montserrat:600\" rel=\"stylesheet\">");
             out.println(" <link href=\"https://fonts.googleapis.com/css?family=Quicksand:500\" rel=\"stylesheet\">");
            out.println("</head>");
            out.println("<body class=\"bg_img\">");
            out.println("<div>");
             out.println("<div class=\"cont1\">"); 
           out.println("  <img src=\"gallery/logo.png\" style=\"width: 60%; height: 35%;\"> </div>");
           out.println("<div class=\"cont1\">\n" +
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
"                              <a href=\"admission_update.html\">STUDENT UPDATE</a> \n" +
"                              <a href=\"admission_student_delete.html\">DELETE STUDENT</a> \n" +
"\n" +
"                               </div>\n" +
"                             </div></th>\n" +
"                            <th><a href=\"logout\"><input type=\"submit\" value=\"LOGOUT\" class=\"btn_lg\"> </a> </th> \n" +
"                    </tr>\n" +
"              \n" +
"                </table>\n" +
"            \n" +
"            </div>");
           
            try
           {
               Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cccms","root","");
                
           out.println("<div class=\"log_cont1\" style=\"width: 69%; float: left;\">");
           out.println("<center>");
           out.println("<form action=\"late_add_student\" method=\"post\">");
           out.println(" <table  cellpadding=\"5create\"  style=\"width:90%;\">");
           out.println(" <tr><td> Name :</td> <td> <input type=\"text\" name=\"txt1\" class=\"input\" > </td><td>Admission No :</td> <td> <input type=\"text\" name=\"txt2\" class=\"input\"> </td>");
           out.println(" <td>Admission date :</td> <td> dd-mm-yy <br> <select name=\"dd\"><option selected=\"selected\" value=\"1\">1</option>");
           out.println(" <option value=\"2\">2</option> <option value=\"3\">3</option>  <option value=\"4\">4</option><option value=\"5\">5</option> <option value=\"6\">6</option><option value=\"7\">7</option><option value=\"8\">8</option> <option value=\"9\">9</option><option value=\"10\">10</option>");
           out.println(" <option value=\"11\">11</option> <option value=\"12\">12</option> <option value=\"13\">13</option><option value=\"14\">14</option><option value=\"15\">15</option><option value=\"16\">16</option> <option value=\"17\">17</option><option value=\"18\">18</option><option value=\"19\">19</option><option value=\"20\">20</option><option value=\"21\">21</option> <option value=\"22\">22</option><option value=\"23\">23</option> <option value=\"24\">24</option><option value=\"25\">25</option><option value=\"26\">26</option> <option value=\"27\">27</option> <option value=\"28\">28</option><option value=\"29\">29</option> <option value=\"30\">30</option><option value=\"31\">31</option></select>");
           out.println(" <select name=\"mm\"> <option selected=\"selected\" value=\"1\">1</option> <option value=\"2\">2</option> <option value=\"3\">3</option>  <option value=\"4\">4</option><option value=\"5\">5</option> <option value=\"6\">6</option><option value=\"7\">7</option><option value=\"8\">8</option> <option value=\"9\">9</option><option value=\"10\">10</option> <option value=\"11\">11</option> <option value=\"12\">12</option> </select>");
           out.println(" <select name=\"yy\"><option selected=\"selected\" value=\"2018\">2018</option><option value=\"2019\">2019</option><option value=\"2020\">2020</option><option value=\"2021\">2021</option><option value=\"2022\">2022</option><option value=\"2023\">2023</option><option value=\"2024\">2024</option><option value=\"2025\">2025</option><option value=\"2026\">2026</option></select></td></tr>");
           
            out.println("<tr> <td>DOB :</td> <td> dd-mm-yy <br> <select name=\"bdd\"><option selected=\"selected\" value=\"1\">1</option>");
           out.println(" <option value=\"2\">2</option> <option value=\"3\">3</option>  <option value=\"4\">4</option><option value=\"5\">5</option> <option value=\"6\">6</option><option value=\"7\">7</option><option value=\"8\">8</option> <option value=\"9\">9</option><option value=\"10\">10</option>");
           out.println(" <option value=\"11\">11</option> <option value=\"12\">12</option> <option value=\"13\">13</option><option value=\"14\">14</option><option value=\"15\">15</option><option value=\"16\">16</option> <option value=\"17\">17</option><option value=\"18\">18</option><option value=\"19\">19</option><option value=\"20\">20</option><option value=\"21\">21</option> <option value=\"22\">22</option><option value=\"23\">23</option> <option value=\"24\">24</option><option value=\"25\">25</option><option value=\"26\">26</option> <option value=\"27\">27</option> <option value=\"28\">28</option><option value=\"29\">29</option> <option value=\"30\">30</option><option value=\"31\">31</option></select>");
           out.println(" <select name=\"bmm\"> <option selected=\"selected\" value=\"1\">1</option> <option value=\"2\">2</option> <option value=\"3\">3</option>  <option value=\"4\">4</option><option value=\"5\">5</option> <option value=\"6\">6</option><option value=\"7\">7</option><option value=\"8\">8</option> <option value=\"9\">9</option><option value=\"10\">10</option> <option value=\"11\">11</option> <option value=\"12\">12</option> </select>");
           out.println(" <select name=\"byy\"><option selected=\"selected\" value=\"1997\">1997</option><option value=\"1998\">1998</option><option value=\"1999\">1999</option><option value=\"2000\">2000</option><option value=\"2001\">2001</option><option value=\"2002\">2002</option><option value=\"2003\">2003</option><option value=\"2004\">2004</option><option value=\"2005\">2006</option></select></td>");
          
           
           out.println("<td>Gender :</td> \n" +
"                        <td> <input type=\"radio\" name=\"txt3\" value=\"male\" >M <input type=\"radio\" name=\"txt3\" value=\"female\" >F </td>\n" +
"                        \n" +
                   
"                        <td>Course :</td> ");
          PreparedStatement p = con.prepareStatement("Select * from course");
                 ResultSet r = p.executeQuery();
                  out.println("<td><select name=\"txt4\">");
                  while(r.next())
                {
                   out.println("<option value="+r.getString("id")+"> "+r.getString("id")+" </option>");
                }
                   out.println("</select></td> </tr>");
         
           out.println("<tr>   <td> Father Name :</td> \n" +
"                        <td> <input type=\"text\" name=\"txt5\" class=\"input\" > </td>\n" +
"                         <td>Mother Name :</td> \n" +
"                        <td> <input type=\"text\" name=\"txt6\" class=\"input\" > </td>\n" +
"                        <td>Father job:</td> \n" +
"                        <td> <input type=\"text\" name=\"txt7\" class=\"input\"> </td>  </tr> <br><tr> <td>Mother job :</td> \n" +
"                        <td> <input type=\"text\" name=\"txt8\" class=\"input\"> </td>\n" +
"             <td>Father Number :</td> \n" +
"                        <td> <input type=\"text\" name=\"txt9\" class=\"input\" > </td>\n" +
"                        <td>Mother Number :</td> \n" +
"                        <td> <input type=\"text\" name=\"txt10\" class=\"input\" > </td> </tr>");
           out.println("<tr>  <td> Email id :</td> \n" +
"                        <td> <input type=\"text\" name=\"txt11\" class=\"input\" > </td>\n" +
"                         <td>Religion :</td> \n" +
"                        <td> <input type=\"text\" name=\"txt12\" class=\"input\" > </td>\n" +
"                        <td>Address:</td> \n" +
"                        <td> <textarea cols=\"20\" rows=\"4\" name=\"txt13\"></textarea> </td> </tr>  <tr> <td>District :</td> \n" +
"                        <td> <input type=\"text\" name=\"txt14\" class=\"input\" > </td>\n" +
"                        <td> State:</td>\n" +
"                        <td> <input type=\"text\" name=\"txt15\" class=\"input\" > </td>\n" +
"                        <td>Nationality :</td> \n" +
"                        <td> <input type=\"text\" name=\"txt16\" class=\"input\" > </td> </tr>  <tr><td> Guradian name :</td> \n" +
"                        <td> <input type=\"text\" name=\"txt17\" class=\"input\" > </td>\n" +
"                         <td>Guradian address :</td> \n" +
"                        <td> <textarea cols=\"20\" rows=\"4\" name=\"txt18\"></textarea> </td>\n" +
"           <td>Guradian number:</td> \n" +
"                        <td> <input type=\"text\" name=\"txt19\" class=\"input\"> </td>  </tr> <tr><td>Latarl entry :</td> \n" +
"                        <td> <input type=\"radio\" name=\"txt20\" value=\"yes\" >Yes <input type=\"radio\" name=\"txt20\" value=\"no\" >No </td>\n" +
"                        <td>College Bus :</td> \n" +
"                        <td> <input type=\"radio\" name=\"txt21\" value=\"yes\" >Yes <input type=\"radio\" name=\"txt21\" value=\"no\" >No </td>  <td>Bus id :</td> ");
              PreparedStatement pw = con.prepareStatement("Select * from bus_route");
                 ResultSet rw = pw.executeQuery();
                  out.println("<td><select name=\"txt22\">");
                  out.println("<option value=\"null\"> null </option>");
                  while(rw.next())
                {
                   out.println("<option value="+rw.getString("id")+"> "+rw.getString("id")+" </option>");
                }
                   out.println("</select></td> </tr>");
           out.println("<tr> <td> Parent Email id </td>  <td>  <input type=\"text\" name=\"txt35\" class=\"input\" ></td> </tr> ");
           out.println(" </table>\n" +
"                    <br> <br>\n" +
"                     <table class=\"blueTable\">\n" +
"<thead>\n" +
"<tr>\n" +
"<th>Qalification</th>\n" +
"<th>Institution Name</th>\n" +
"<th>Year passed</th>\n" +
"<th>Mark</th>\n" +
"</tr>\n" +
"</thead>\n" +
"\n" +
"<tbody>\n" +
"<tr>\n" +
"<td>High school</td>\n" +
"<td><input type=\"text\" name=\"txt23\" class=\"input1\" ></td>\n" +
"<td><input type=\"text\" name=\"txt24\" class=\"input1\" ></td>\n" +
"<td><input type=\"text\" name=\"txt25\" class=\"input1\" ></td>\n" +
"</tr>\n" +
"<tr>\n" +
"<td>Higher Secondary</td>\n" +
"<td><input type=\"text\" name=\"txt26\" class=\"input1\" ></td>\n" +
"<td><input type=\"text\" name=\"txt27\" class=\"input1\" ></td>\n" +
"<td><input type=\"text\" name=\"txt28\" class=\"input1\" ></td>\n" +
"</tr>\n" +
"<tr>\n" +
"<td>Under Graguation</td>\n" +
"<td><input type=\"text\" name=\"txt29\" class=\"input1\" ></td>\n" +
"<td><input type=\"text\" name=\"txt30\" class=\"input1\" ></td>\n" +
"<td><input type=\"text\" name=\"txt31\" class=\"input1\" ></td>\n" +
"</tr>\n" +
"<tr>\n" +
"<td>Post Graguation</td>\n" +
"<td><input type=\"text\" name=\"txt32\" class=\"input1\" ></td>\n" +
"<td><input type=\"text\" name=\"txt33\" class=\"input1\" ></td>\n" +
"<td><input type=\"text\" name=\"txt34\" class=\"input1\" ></td>\n" +
"</tr>\n" +
"</tbody>\n" +
"</table>\n" +
"                \n" +
"                <br> <br>\n" +
"                <input type=\"submit\" value=\"Submit\" class=\"btn_lg\">\n" +
"              <br><br>\n" +
"                      \n" +
"                \n" +
"    \n" +
"    \n" +
"    \n" +
"   \n" +
"            </form>\n" +
"                <a href=\"admission_home.html\"> <input type=\"submit\" value=\"Cancel\" class=\"btn_lg\" > </a>\n" +
"              </center>\n" +
"              <br>  <br>\n" +
"        </div>");
           
           
           
           
          
           
           //out.println("<div class=\"log_cont2\">");
           out.println("<div class=\"log_cont2\" style=\"width: 20%; float: right; top:5%;\">");
           
           
           
              // out.println("<br> <br>");

               out.println("<center>");
               
                 PreparedStatement ps = con.prepareStatement("Select * from course");
                 ResultSet rs = ps.executeQuery();
                 out.println("<table class=\"blueTable\">\n" +
"<thead>\n" +
"<tr>\n" +
"<th>Course Id</th>\n" +
"<th>Course Name</th>\n" +

"</tr>\n" +
"</thead>\n" +
"\n" +
"<tbody>");
                while(rs.next())
                {
                  out.println("<tr> <td> "+ rs.getInt("id")+"</td> <td> "+ rs.getString("name")+"</td> </tr>");  
                }
                out.println("</tbody>\n" +
"</table>");  
                
                out.println("<br> <br>");
                
                PreparedStatement pa = con.prepareStatement("Select * from bus_route");
                 ResultSet ra = pa.executeQuery();
                 out.println("<table class=\"blueTable\">\n" +
"<thead>\n" +
"<tr>\n" +
"<th>Route Id</th>\n" +
"<th>Route Name</th>\n" +

"</tr>\n" +
"</thead>\n" +
"\n" +
"<tbody>");
                while(ra.next())
                {
                  out.println("<tr> <td> "+ ra.getInt("id")+"</td> <td> "+ ra.getString("place")+"</td> </tr>");  
                }
                out.println("</tbody>\n" +
"</table>");  
                
                
                
                out.println("</center>");
                out.println("<br> <br>");
               
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
