/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author HP
 */
public class admin_add_course3 extends HttpServlet {

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
            out.println("<title>Servlet admin_add_course3</title>");            
            out.println("</head>");
            out.println("<body>");
            String a="",b="",c="";
            //int h=Integer.parseInt(c);
           // String [] d=new String[3];
             HttpSession session5=request.getSession(false);
            if(session5!=null)
            {
               a=(String)session5.getAttribute("a");
               b=(String)session5.getAttribute("b");
               c=(String)session5.getAttribute("c");
              session5.getAttributeNames().nextElement();
             String [] j=(String [])session5.getAttribute("l");
              /*for(int i=0;i<j.length;i++)
            {
                out.println(j[i]);
            }*/
              int q=Integer.parseInt(a);
              int h=Integer.parseInt(c);
              int lo;
              try
              {
                  int i=0,v=1,g;
                  String x="";
                   Class.forName("com.mysql.jdbc.Driver");
               Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cccms","root","");
               while(i<h)
               {  lo=i+1;
                   x=j[i];
                   g=Integer.parseInt(x);
                   int a1=0;
                   String h1="";
                   String [] s=new String[10];
                   int [] b1=new int[10];
                   while(a1<g)
                   {
                       int g1=1;
                      s[a1]=request.getParameter("txt"+g1+"");
                      h1=request.getParameter("cxt"+g1+"");
                      b1[a1]=Integer.parseInt(h1);
                      g1++;
                      
                      
                   a1++;
                   }
                   
                  
                   out.println("<br>");
                   PreparedStatement p=con.prepareStatement("insert into course values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
               p.setInt(1,q);
               p.setString(2,b);
               p.setInt(3, lo);
                p.setString(4,s[0]);
                p.setString(5,s[1]);
                p.setString(6,s[2]);
                p.setString(7,s[3]);
                p.setString(8,s[4]);
                p.setString(9,s[5]);
                p.setString(10,s[6]);
                p.setString(11,s[7]);
                p.setString(12,s[8]);
                p.setString(13,s[9]);
                 p.setInt(14, b1[0]);
                  p.setInt(15, b1[1]);
                   p.setInt(16, b1[2]);
                    p.setInt(17, b1[3]);
                     p.setInt(18, b1[4]);
                      p.setInt(19, b1[5]);
                       p.setInt(20, b1[6]);
                        p.setInt(21,b1[7]);
                         p.setInt(22,b1[8]);
                          p.setInt(23,b1[9]);
               p.executeUpdate();
                   
                   
                   
                   i++;
               }
               
                if(!a.equals(" "))
                {
                   HttpSession session6=request.getSession();
                    session6.setAttribute("a",a);
                    session6.setAttribute("b",b);
                    session6.setAttribute("c",c);
                    
                 
                }
               
               response.sendRedirect("admin_add_course4");
              }
              catch(Exception e)
              {
                  out.println(e);
              }
              
              
              
              
              
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
