<%-- 
    Document   : account_home
    Created on : Apr 10, 2019, 1:38:50 PM
    Author     : KHSCI5MCA16124
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://fonts.googleapis.com/css?family=Montserrat:600" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Quicksand:500" rel="stylesheet">
        <link href="login.css" rel="stylesheet">
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
                              <th><a href="fees_struct.jsp"><input type="submit" value="FEE" class="btn_lg"> </a> </th> 
<th><a href="aboutus"><input type="submit" value="ABOUT US" class="btn_lg"> </a> </th> 
<th><a href="contactus"><input type="submit" value="CONTACT US" class="btn_lg"> </a> </th> 
<th><a href="logout"><input type="submit" value="LOGOUT" class="btn_lg"> </a> </th> 
                    </tr>
                </table>
            
            </div>
        </div>
    </body>
</html>
