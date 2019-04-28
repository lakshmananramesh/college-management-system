<%-- 
    Document   : admin_home
    Created on : 28 Apr, 2019, 10:09:04 AM
    Author     : RL
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="login.css" rel="stylesheet">
        <link href="slide.css" rel="stylesheet">
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
                            <th><a href="admin_home.html"><input type="submit" value="HOME" class="btn_lg"> </a> </th>

                                <th><div class="dropdown">
                               <button class="dropbtn">COURSE</button>
                               <div class="dropdown-content">
                               <a href="admin_add_course.html">ADD COURSE</a>

                               <a href="">UPDATE COURSE</a>
                              <a href="">DELETE COURSE</a>

                               </div>
                             </div></th>

                             <th><a href=""><input type="submit" value="UPDATE FEE" class="btn_lg"> </a> </th>

                             <th><div class="dropdown">
                               <button class="dropbtn">COLLEGE BUS</button>
                               <div class="dropdown-content">
                               <a href="admin_add_route.html">ADD ROUTE</a>

                               <a href="admin_update_route">UPDATE ROUTE</a>
                              <a href="admin_delete_route">DELETE ROUTE</a>

                               </div>
                             </div></th>

                              <th><div class="dropdown">
                               <button class="dropbtn">TEACHER</button>
                               <div class="dropdown-content">
                               <a href="">ADD TEACHER</a>

                               <a href="">UPDATE TEACHER</a>
                              <a href="">DELETE TEACHER</a>
                               <a href=""> ADD ATTENDENCE</a>
                                 <a href="">UPDATE ATTENDENCE</a>
                               </div>
                             </div></th> </tr>
        <tr>
            <th><div class="dropdown">
                               <button class="dropbtn">EXAM TIMETABLE</button>
                               <div class="dropdown-content">
                               <a href="">PERIODICAL</a>
                           <a href="">UPDATE PERI0DICAL</a>
                           <a href="">SEMSETER</a>
                           <a href="">UPDATE SEMESTER</a>
                         </div>
                             </div></th>
            <th><div class="dropdown">
                               <button class="dropbtn">CLASS TIMETABLE</button>
                               <div class="dropdown-content">
                               <a href="">ADD TIMETABLE</a>
                           <a href="">UPDATE TIMETABE</a>
                               </div>
                             </div></th>
                               <th><div class="dropdown">
                               <button class="dropbtn">TEACHER TIMETABLE</button>
                               <div class="dropdown-content">
                               <a href="">ADD TIMETABLE</a>
                           <a href="">UPDATE TIMETABE</a>
                          </div>
                             </div></th>
      <th><a href="logout"><input type="submit" value="LOGOUT" class="btn_lg"> </a> </th>
                    </tr>

                </table>
            </div>
        </div>
        <div>
          <div class="log_cont">
              <textarea rows="10" cols="20" id="txta"></textarea>
              <%
                  try{
                  String txt=request.getParameter("txta");
                  txt.replaceAll(" ","_");
                  Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cccms","root","");
                PreparedStatement ps = con.prepareStatement("insert into home values (?)");
                ps.setString(0,txt);
                ps.executeQuery();
                  }catch(Exception e)
                  { 
                      out.println(e); 
                  }
              %>
          </div>
        </div>
    </body>
</html>
