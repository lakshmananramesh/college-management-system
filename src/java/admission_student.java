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
public class admission_student extends HttpServlet {

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
            out.println("<title>Servlet admission_student</title>");            
            out.println("</head>");
            out.println("<body>");
            String name=request.getParameter("txt1");
            String course=request.getParameter("course");
            String j_year=request.getParameter("yy");
            String r="1";
            String no=request.getParameter("txt3");
            //out.println(name+""+course+""+j_year);
             int d=Integer.parseInt(no);;
            try
               
            {
                 Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cccms","root","");
                 PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?,?,?)");
                ps.setString(1,name);
                ps.setString(2,course);
                ps.setString(3,j_year);
                ps.setString(4,r);
                ps.setInt(5, d);
                ps.executeUpdate();
                int i=1;
                String a="",b ="";
                int h=0;
                
                //PreparedStatement p = con.prepareStatement("update student set rollnumber=? where course=? and year=? order by name asc");
                //p.setString(1,r);
                //p.setString(2,course);
                // p.setString(3,j_year);
                 //p.executeUpdate();
                 
                  PreparedStatement pa = con.prepareStatement("select * from student where course=? and year=? order by name asc");
                  pa.setString(1,course);
                  pa.setString(2,j_year);
                ResultSet rs = pa.executeQuery();
                while(rs.next())
                {
                    a=Integer.toString(i);
                    r=course+j_year+a;
                   b=rs.getString("name");
                   h=rs.getInt("admission_no");
                     PreparedStatement p = con.prepareStatement("update student set rollnumber=? where name=? and admission_no=?");
                      p.setString(1,r);
                p.setString(2,b);
                p.setInt(3,h);
                p.executeUpdate();
                 out.print(b+"   "+r+"<br>");
                   
                    i=i+1;
                   
                 }
                rs.close();
               //  out.print(b);
                 con.close();
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
