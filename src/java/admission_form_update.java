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
public class admission_form_update extends HttpServlet {

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
            out.println("<title>Servlet admission_form_update</title>");            
            out.println("</head>");
            out.println("<body>");
           
            
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
            int b1=Integer.parseInt(bus_id);
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
             String password="";
             String b="";
              HttpSession session0=request.getSession(false);
            if(session0!=null)
            {
               b=(String)session0.getAttribute("as");
             
            }
            r=Integer.parseInt(b);
             out.println(r);
          try
               
            {
                 Class.forName("com.mysql.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cccms","root","");
               
             
             PreparedStatement pc = con.prepareStatement("select *  from parent where student_id=?");
                pc.setInt(1,r);
                String email1="";
              ResultSet rz = pc.executeQuery();
                 if(rz.next())
                 {
                    
                     email1=rz.getString("email_id");
                     
                 }
                 
                 if(!email1.equals(parent_email))
                 {
                       PreparedStatement pl = con.prepareStatement("update parent set email_id=? where student_id=?");
                        pl.setString(1,parent_email);
                       pl.setInt(2,r);
                       pl.executeUpdate();
                 }
                 
             
             
             
             
             PreparedStatement pd = con.prepareStatement("select *  from student where rollno=?");
                pd.setInt(1,r);
                String y="",c="",n="";
              ResultSet ro = pd.executeQuery();
                 if(ro.next())
                 {
                     password=ro.getString("password");
                     y=ro.getString("year");
                     c=ro.getString("course");
                     n=ro.getString("name");
                     
                 }
                 
             
             if(y.equals(a_y) && c.equals(course) && n.equals(name) )
             {
                 PreparedStatement ps = con.prepareStatement("update student set name=? ,admission_no=?,admission_date=?,dob=?,gender=?,course=?,f_name=?,m_name=?,f_job=?,m_job=?,f_num=?,m_num=?,email=?,religion=?,address=?,district=?,state=?,nation=?,g_name=?,g_address=?,g_num=?,latral=?,college_bus=?,bus_id=?,parent_email=?,hs_name=?,hs_year=?,hs_mark=?,hss_name=?,hss_year=?,hss_mark=?,ug_name=?,ug_year=?,ug_mark=?,pg_name=?,pg_year=?,pg_mark=?,password=?,rollno=?,year=? where rollno=?");
                ps.setString(1,n);
                ps.setInt(2,d);
                ps.setString(3,admission_date);
                ps.setString(4,dob);
                ps.setString(5,gender);
                ps.setString(6,c);
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
                ps.setInt(24,b1);
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
               ps.setInt(41, r);
                
                
                ps.executeUpdate(); 
                 response.sendRedirect("admission_home.html");
             }
             else
             {
                  PreparedStatement p = con.prepareStatement("select *  from student where rollno=?");
                p.setInt(1,r);
                String y1="",c1="",n1="";
              ResultSet roo = p.executeQuery();
                 if(roo.next())
                 {
                     password=roo.getString("password");
                     y1=roo.getString("year");
                     c1=roo.getString("course");
                     n1=roo.getString("name");
                     
                 }
                 if(!c1.equals(course) && !y1.equals(a_y))
                 {
                     password="ccms12345";
                 }
                 
                  PreparedStatement pa = con.prepareStatement("delete  from student where rollno=?");
                pa.setInt(1, r);
                pa.executeUpdate();
                 
                
                 
                
                 r=1;
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
                ps.setInt(24,b1);
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
                String a2="",b2 ="";
                int h=0;
                String f="";
              
                 
                  PreparedStatement pk = con.prepareStatement("select * from student where course=? and year=? order by name asc");
                  pk.setString(1,course);
                  pk.setString(2,a_y);
                ResultSet rs = pk.executeQuery();
                while(rs.next())
                {
                     r=0;
                    f=Integer.toString(r);
                    a2=Integer.toString(i);
                    
                    f=course+a_y+a2;
                    
                   b2=rs.getString("name");
                   h=rs.getInt("admission_no");
                   r=Integer.parseInt(f);
                     PreparedStatement px = con.prepareStatement("update student set rollno=? where name=? and admission_no=?");
                     px.setInt(1,r);
                px.setString(2,b2);
                px.setInt(3,h);
                px.executeUpdate();
                 
                   //out.println(r);
                    i=i+1;
                   
                 }
                 
                  response.sendRedirect("admission_home.html");
             }
             
            
             
            
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
