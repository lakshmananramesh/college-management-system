<%-- 
    Document   : student_profile
    Created on : Apr 17, 2019, 1:06:30 PM
    Author     : KHSCI5MCA16124
--%>

<%@page import="java.sql.*"%>
<%@ page session="false"%>
<%@page import="javax.servlet.http.HttpSession" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="login.css" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Montserrat:600" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Quicksand:500" rel="stylesheet">
    </head>
    <body class="bg_img">
        <div>
            <div class="cont1">
                <img src="gallery/logo.png" style="width: 60%; height: 35%;">
            </div>
            <div class="cont1">
              
                <table cellspacing="10create ">
                    <tr>
                            <th><a href="student_home.html"><input type="submit" value="HOME" class="btn_lg"> </a> </th> 
                                <th><div class="dropdown">
                               <button class="dropbtn">PERSONAL</button> 
                               <div class="dropdown-content">
                               <a href="student_profile.jsp">VIEW PROFILE</a> 
                              <a href="student_profile_update">PROFILE UPDATE</a> 
                              <a href="change_password.html">CHANGE PASSWORD</a> 
                               </div>
                             </div></th>
                            <th><input type="submit" value="ATTENDENCE" class="btn_lg"> </th> 
                                                        <th><div class="dropdown">
                              <button class="dropbtn">EXAM SCORE</button> 
                              <div class="dropdown-content">
                              <a href="internal">INTERNALS</a> 
                             <a href="semester">SEMESTER</a> 
                              </div>
                            </div></th>
                             <th><div class="dropdown">
                        <button class="dropbtn">TIMETABLE</button> 
                        <div class="dropdown-content">
                        <a href="class_timetable">CLASS TIMETABLE</a> 
                       <a href="exam_timetable">EXAM TIMETABLE</a> 
               </div>
                      </div></th>  
                    </tr>
                    <tr>
                              <th><a href="fees.jsp"><input type="submit" value="FEE" class="btn_lg"> </a> </th> 
                              <th><a href="about_us.html"><input type="submit" value="ABOUT US" class="btn_lg"> </a> </th> 
                   <th><a href="contact_us"><input type="submit" value="CONTACT US" class="btn_lg"> </a> </th> 
                   <th><a href="logout"><input type="submit" value="LOGOUT" class="btn_lg"> </a> </th> 
                    </tr>
                </table>
            </div>
        </div>
        <div>
            <div class="cont3">
                
                <table class="log_cont1">
                    <tr>
                        <td colspan="2">
                    <center><h2>Student Profile</h2></center>
                </td>
                    </tr>
                    <%
      
                    try{
                        HttpSession ses=request.getSession(false);
                            String a=(String)ses.getAttribute("rollno");
                        
                String c= request.getParameter("course");
                String s=request.getParameter("semester");
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cccms","root","");
                
                PreparedStatement ps = con.prepareStatement("Select* from student where Stud_id=?");
                ps.setString(1,a);
                ResultSet rs = ps.executeQuery();
                while(rs.next())
                {
                    String n=rs.getString("Stud_name");
                    n.replaceAll("_", " ");
                    
                    %>
                    <tr>
                        <td>Student id.</td>
                        <td><%=rs.getString("Stud_id")%></td>
                    </tr>
                    <tr>
                        <td>Student name</td>
                        <td><%=n%></td>
                    </tr>
                    <tr>
                        <td>Date of Birth</td>
                        <td><%=rs.getString("DOB")%></td>
                    </tr>
                    <tr>
                        <td>Gender</td>
                        <td><%=rs.getString("Gender")%></td>
                    </tr>
                    <tr>
                        <td>Address</td>
                        <td><%=
                            String ad=rs.getString("Address");
                    ad.replaceAll("_", " ");%></td>
                    </tr>
                    <tr>
                        <td>Course id</td>
                        <td><%=rs.getString("Course_id")%></td>
                    </tr>
                    <tr>
                        <td>Father's name</td>
                        <td><%=rs.getString("Father_name")%></td>
                    </tr>
                    <tr>
                        <td>Mother's name</td>
                        <td><%=rs.getString("Mother_name")%></td>
                    </tr>
                    <tr>
                        <td>Father's occupation</td>
                        <td><%=rs.getString("Father_occupation")%></td>
                    </tr>
                    <tr>
                        <td>Mother's occupation</td>
                        <td><%=rs.getString("Mother_occupation")%></td>
                    </tr>
                    <tr>
                        <td>Email id</td>
                        <td><%=rs.getString("Stud_email_id")%></td>
                    </tr>
                    <tr>
                        <td>Parent's contact no.</td>
                        <td><%=rs.getInt("Parent_no")%></td>
                    </tr>
                    <tr>
                        <td>Emergency Contact no.</td>
                        <td><%=rs.getInt("Contact_no")%></td>
                    </tr>
                    <tr>
                        <td>10th grade</td>
                        <td><%=rs.getFloat("10th_marks")%></td>
                    </tr>
                    <tr>
                        <td>+2 grade</td>
                        <td><%=rs.getDouble("12th_marks")%></td>
                    </tr>
                <%
                    }
                }
                    catch(Exception e)
                {
                    out.println(e);
                }
                %>
                </table>
            </div>
        </div>
    </body>
</html>
