<%-- 
    Document   : fees
    Created on : Apr 1, 2019, 2:32:11 PM
    Author     : KHSCI5MCA16124
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <link href="https://fonts.googleapis.com/css?family=Montserrat:600" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Quicksand:500" rel="stylesheet">
    <link href="login.css" rel="stylesheet">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CCMS Fees Structure</title>
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
                               <a href="student_profile">VIEW PROFILE</a> 
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
                              <th><a href="fee.html"><input type="submit" value="FEE" class="btn_lg"> </a> </th> 
                              <th><a href="aboutus"><input type="submit" value="ABOUT US" class="btn_lg"> </a> </th> 
                              <th><a href="contactus"><input type="submit" value="CONTACT US" class="btn_lg"> </a> </th>              
                              <th><a href="logout"><input type="submit" value="LOGOUT" class="btn_lg"> </a> </th> 
                    </tr>
                </table>
            </div>
        </div>
        <div>
        <div class="log_cont2">
                    
                        <table cellpadding="5" cellspacing="5" class="log_cont">
                                <tr>
                                    <td> <h3> FEE STRUCTURE </h3></td>
                                
                                   
                                    <td><div class="dropdown">
                                            <input type="text" class="dropbtn" value="SEMESTER" readonly="readonly">
                        
                        <div class="dropdown-content">
                            <form>
                        <input type="submit" class="btn_lg" value="1" name="1">
                         <input type="submit" class="btn_lg" value="2" name="1">
                          <input type="submit" class="btn_lg" value="3" name="1">
                           <input type="submit" class="btn_lg" value="4" name="1">
                            <input type="submit" class="btn_lg" value="5" name="1">
                              <input type="submit" class="btn_lg" value="6" name="1">
                                 </form>
                        </div>
                        </div></td>
                      </div>
                       </tr>
                        
                      
            <div>
                <%
                    String sem= request.getParameter("1");
                    
                try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cccms","root","");
                PreparedStatement ps = con.prepareStatement("Select Tution_Fee,University_fee,Special_fee,Caution_deposit,"
                        + "Transportation_fee,Insurance,Admission_fee,Uniform from fees_struct where Course_id=? and Semester=?");
                   ps.setString(1,sem);
                ResultSet rs = ps.executeQuery();
                while(rs.next())
                {%>
                    <tr>
                        <td><h>Fees Section</h3></td>
                        <td><h3>Assigned Amount</h3></td>
                    </tr>
                
                    
                    <tr>
                        <td>Tuition fee</td>
                        <td><%=rs.getDouble("Tution_Fee")%></td>
                    </tr>
                    <tr>
                        <td>University fee</td>
                        <td><%=rs.getDouble("University_fee") %></td>
                    </tr>
                    <tr>
                        <td>Special fee</td>
                        <td><%=rs.getDouble("Special_fee") %></td>
                    </tr>
                    <tr>
                        <td>Caution deposit</td>
                        <td><%=rs.getDouble("Caution_deposit")%></td>
                    </tr>
                    <tr>
                        <td>Transportation fee</td>
                        <td><%=rs.getDouble("Transportation_fee") %></td>
                    </tr>
                    
                    <tr>
                        <td>Insurance</td>
                        <td><%=rs.getDouble("Insurance") %></td>
                    </tr>
                   
                    <tr>
                        <td>Admission fee</td>
                        <td><%=rs.getDouble("Admission_fee")%></td>
                    </tr>
                    <tr>
                        <td>Uniform</td>
                        <td><%=rs.getDouble("Uniform") %></td>
                    </tr>
                   </table> 
                
                <%
                    }
                }
                    catch(Exception e)
                {
                    out.println(e);
                }
                %>
            </div>
    </div>
        </div>
    </body>
</html>
