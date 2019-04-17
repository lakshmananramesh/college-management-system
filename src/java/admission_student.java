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
            //out.println("hwllo");
            String name=request.getParameter("txt1");
            
            String admission_no=request.getParameter("txt2");
            String a_d=request.getParameter("dd");
            String a_m=request.getParameter("mm");
            String a_y=request.getParameter("yy");
            String admission_date=a_d+"-"+a_m+"-"+a_y;
          
            String b_d=request.getParameter("bdd");
            String b_m=request.getParameter("bmm");
            String b_y=request.getParameter("byy");
            String dob=b_d+"-"+b_m+"-"+b_y;
            
            String gender=request.getParameter("txt3");
            String course=request.getParameter("txt4");
            
            String f_name=request.getParameter("txt5");
            String m_name=request.getParameter("txt6");
            String f_job=request.getParameter("txt7");
            String m_job=request.getParameter("txt8");
            
            
            String f_num=request.getParameter("txt9");
            String m_num=request.getParameter("txt10");
            String email=request.getParameter("txt11");
            
            String religion=request.getParameter("txt12");
            String address=request.getParameter("txt13");
            
            String district=request.getParameter("txt14");
            String state=request.getParameter("txt15");
            String nation=request.getParameter("txt16");
            
            String g_name=request.getParameter("txt17");
            
            String g_address=request.getParameter("txt18");
            String g_num=request.getParameter("txt19");
            
            String latral=request.getParameter("txt20");
            String college_bus=request.getParameter("txt21");
            String bus_id=request.getParameter("txt22");
            String parent_email=request.getParameter("txt35");
            //out.println(parent_email);
            String hs_name=request.getParameter("txt23");
            String hs_year=request.getParameter("txt24");
            String hs_mark=request.getParameter("txt25");
            
            String hss_name=request.getParameter("txt26");
            String hss_year=request.getParameter("txt27");
            String hss_mark=request.getParameter("txt28");
            
            String ug_name=request.getParameter("txt29");
            String ug_year=request.getParameter("txt30");
            String ug_mark=request.getParameter("txt31");
            
            
            String pg_name=request.getParameter("txt32");
            String pg_year=request.getParameter("txt33");
            String pg_mark=request.getParameter("txt34");
            //String r="123";
            int r=1;
          //  int b1=Integer.parseInt(bus_id);
            int h1=Integer.parseInt(hs_year);
            int h2=Integer.parseInt(hss_year);
            int h3=Integer.parseInt(ug_year);
            int h4=Integer.parseInt(pg_year);
            
            int m1=Integer.parseInt(hs_mark);
            int m2=Integer.parseInt(hss_mark);
            int m3=Integer.parseInt(ug_mark);
            int m4=Integer.parseInt(pg_mark);
                       //out.println(name+""+course+""+j_year);
             int d=Integer.parseInt(admission_no);
             String password="ccms12345";
             
          try
               
            {
                 Class.forName("com.mysql.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cccms","root","");
               
              PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                ps.setString(1,name);
                ps.setInt(2,d);
                ps.setString(3,admission_date);
                ps.setString(4,dob);
                ps.setString(5,gender);
                ps.setString(6,course);
                ps.setString(7,f_name);
                ps.setString(8,m_name);
                ps.setString(9,f_job);
                ps.setString(10,m_job);
                ps.setString(11,f_num);
                ps.setString(12,m_num);
                ps.setString(13,email);
                ps.setString(14,religion);
                ps.setString(15,address);
                ps.setString(16,district);
                ps.setString(17,state);
                ps.setString(18,nation);
                ps.setString(19,g_name);
                ps.setString(20,g_address);
                ps.setString(21,g_num);
                ps.setString(22,latral);
                ps.setString(23,college_bus);
                ps.setString(24,bus_id);
                ps.setString(25,parent_email);
                ps.setString(26,hs_name);
                ps.setInt(27,h1);
                 ps.setInt(28,m1);
                ps.setString(29,hss_name);
                ps.setInt(30,h2);
                 ps.setInt(31,m2);
                ps.setString(32,ug_name);
                ps.setInt(33,h3);
                 ps.setInt(34,m3);
                 ps.setString(35,pg_name);
                ps.setInt(36,h4);
                 ps.setInt(37,m4);
                 ps.setString(38,password);
                 ps.setInt(39,r);
                  ps.setString(40,a_y);
               
                
                
                ps.executeUpdate();
                int i=1;
                String a="",b ="";
                int h=0;
                String f="";
              
                 
                  PreparedStatement pa = con.prepareStatement("select * from student where course=? and year=? order by name asc");
                  pa.setString(1,course);
                  pa.setString(2,a_y);
                ResultSet rs = pa.executeQuery();
                while(rs.next())
                {
                     r=0;
                    f=Integer.toString(r);
                    a=Integer.toString(i);
                    
                    f=course+a_y+a;
                    
                   b=rs.getString("name");
                   h=rs.getInt("admission_no");
                   r=Integer.parseInt(f);
                     PreparedStatement p = con.prepareStatement("update student set rollno=? where name=? and admission_no=?");
                     p.setInt(1,r);
                p.setString(2,b);
                p.setInt(3,h);
                p.executeUpdate();
                 
                   //out.println(r);
                    i=i+1;
                   
                 }
                rs.close();
                 PreparedStatement pf = con.prepareStatement("insert into parent values (?,?,?)");
                     pf.setInt(1,r);
                pf.setString(2,parent_email);
                pf.setString(3,password);
              pf.executeUpdate();
                 con.close();
                 response.sendRedirect("admission_home.html");
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
