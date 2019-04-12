<%-- 
    Document   : fees_struct
    Created on : Apr 10, 2019, 12:46:27 PM
    Author     : KHSCI5MCA16124
--%>

<%@page import="java.sql.*"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="login.css" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Montserrat:600" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Quicksand:500" rel="stylesheet">
        <title>CCMS - FEES STRUCTURE</title>
    </head>
    <body class="bg_img">
    <div>
        <div class="cont1">
        <img src="gallery\logo.png" style="width: 60%; height: 35%;">
        </div>
        <div class="cont1">
                <table cellspacing="10create ">
                    <tr>
                        <th><a href="account_home.jsp"><input type="submit" value="HOME" class="btn_lg"> </a> </th> 
                                <th><div class="dropdown">
                               <button class="dropbtn">PERSONAL</button> 
                               <div class="dropdown-content">
                              <!-- <a href="student_profile">VIEW PROFILE</a> 
                              <a href="student_profile_update">PROFILE UPDATE</a> 
                              <a href="change_password.html">CHANGE PASSWORD</a> 
                               </div>
                             </div></th>-->
                            <th><a href="aboutus"><input type="submit" value="ABOUT US" class="btn_lg"> </a> </th> 
                            <th><a href="contactus"><input type="submit" value="CONTACT US" class="btn_lg"> </a> </th>              
                            <th><a href="logout"><input type="submit" value="LOGOUT" class="btn_lg"> </a> </th> 
                    </tr>
                </table>
            </div>
        </div>
        <div class="cont1">
            <div>
                <table cellpadding="5" cellspacing="5" class="log_cont">
                    <tr>
                        <td>
                            <form>
                    <center><select name="course" class="btn_lg">
                            <option value ="Null">-Select-</option>
                            <option value="IntMCA">Integrated MCA</option>
                            <option value="BCom">BCom</option>
                            <option value="BBA">BBA</option>
                            <option value="Bsc.Visual_Media">BSc. Visual Media</option>
                            <option value="BFA">BFA</option>
                            <option value="MFA">MFA</option>
                            <option value="MCA">MCA</option>
                        </select><select name="semester" class="btn_lg">
                            <option value ="Null">-Select-</option>
                            <option value="1">1</option>
                            <option value="2">2</option>
                            <option value="3">3</option>
                            <option value="4">4</option>
                            <option value="5">5</option>
                            <option value="6">6</option>
                            <option value="7">7</option>
                                    </select></center>
                        
                        <input type="submit" value="Show Fees" class="btn_lg">
                        </form></td>
                    </tr>
        <%
            
            try{
                String c= request.getParameter("course");
                String s=request.getParameter("semester");
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cccms","root","");
                PreparedStatement ps = con.prepareStatement("Select Tution_Fee,University_fee,Special_fee,Caution_deposit,"
                        + "Transportation_fee,Insurance,Admission_fee,Uniform,Total_Amount from fees_struct where Course_id=? AND Semester=?");
                ps.setString(1,c);
                ps.setString(2,s);
                ResultSet rs = ps.executeQuery();
                while(rs.next())
                {%>
                    
                    <tr>
                        <td><h3>Fees Section</h3></td>
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
    </body>
</html>
