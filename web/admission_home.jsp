<%-- 
    Document   : admission_home
    Created on : 28 Apr, 2019, 10:23:44 AM
    Author     : RL
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body class="bg_img">
        <div>
            <div class="cont1">
                <img src="gallery/logo.png" style="width: 60%; height: 35%;">
            </div>
            <div class="cont1">
              
                <table cellspacing="10create ">
                    <tr>
                            <th><a href="admission_home.html"><input type="submit" value="HOME" class="btn_lg"> </a> </th> 
                                <th><div class="dropdown">
                               <button class="dropbtn">STUDENT</button> 
                               <div class="dropdown-content">
                               <a href="add_student.jsp">ADD STUDENT</a> 
                               <a href="late_entery_form">LATE ENTERY </a> 
                               <a href="admission_update.html">STUDENT UPDATE</a> 
                              <a href="admission_student_delete.html">DELETE STUDENT</a> 
                               </div>
                             </div></th>
                             <th><div class="dropdown">
                               <button class="dropbtn">COLLEGE BUS</button> 
                               <div class="dropdown-content">
                               <a href="bus_student_add">ADD STUDENT</a> 
                               <a href="bus_student_update.html">STUDENT UPDATE</a> 
                              <a href="bus_student_delete.html">DELETE STUDENT</a> 
                               </div>
                             </div></th>
                            <th><a href="logout"><input type="submit" value="LOGOUT" class="btn_lg"> </a> </th> 
                    </tr>
                </table>
            </div>
        </div>
        <div>
            <div class="log_cont">
                <span id="txt"></span>
                <%
                  try{
                  String txt=request.getParameter("txta");
                  Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cccms","root","");
                PreparedStatement ps = con.prepareStatement("select * from home");
                ResultSet rs = ps.executeQuery();
                while(rs.next())
                {
                    txt=rs.getString(0);
                    txt.replaceAll("_"," ");
                }
                  }catch(Exception e)
                  { 
                      out.println(e); 
                  }
              %>
            </div>
        </div>
    </body>
</html>
