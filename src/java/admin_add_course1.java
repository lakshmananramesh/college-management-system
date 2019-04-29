/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author HP
 */
public class admin_add_course1 extends HttpServlet {

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
            out.println("<title>Servlet admin_add_course1</title>");
         out.println("   <link href=\"login.css\" rel=\"stylesheet\">\n" +
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
"                               <a href=\"admin_add_course.html\">ADD COURSE</a> \n" +
"                               \n" +
"                               <a href=\"\">UPDATE COURSE</a> \n" +
"                              <a href=\"\">DELETE COURSE</a> \n" +
" \n" +
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
"                              <a href=\"admin_delete_route\">DELETE ROUTE</a> \n" +
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
         String a=request.getParameter("txt1");
         String b=request.getParameter("txt2");
         String c=request.getParameter("txt3");
         int n=Integer.parseInt(c);
         int i=1;
         out.println("<center>  <div class=\"log_cont\" style=\"float:left; width: 50%;\"> <form action=\"admin_add_course2\" method=\"post\"> <table cellspacing=20>");
         out.println("<h2> NUMBER OF SUBJECT </h2>");
         while(i<=n)
         {
             out.println("<tr> <th>Semester "+i+"</th> <th><select name=\"txt"+i+"\" style=\"width: 100%;\" requireds><option value=\"\">-Select Semester-</option><option value=\"1\"> 1 </option>\n" +
"                                             <option value=\"2\"> 2 </option>\n" +
"                                             <option value=\"3\"> 3 </option>\n" +
"                                             <option value=\"4\"> 4 </option>\n" +
"                                             <option value=\"5\"> 5 </option>\n" +
"                                             <option value=\"6\"> 6 </option>\n" +
"                                             <option value=\"7\"> 7 </option>\n" +
"                                             <option value=\"8\"> 8 </option>\n" +
"                                             <option value=\"9\"> 9 </option>\n" +
"                                             <option value=\"10\"> 10 </option>\n" +
"                                         \n" +
"                                         </select> </th></tr>");
             i=i+1;
         }




         out.println("</table> <br> <input type=\"submit\" value=\"submit\" class=\"btn_lg\"> </center> <br> <br>");
          if(!a.equals(" "))
                {
                   HttpSession session4=request.getSession();
                    session4.setAttribute("a",a);
                    session4.setAttribute("b",b);
                    session4.setAttribute("c",c);

                }

         out.println("</form>  </div> ");
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
