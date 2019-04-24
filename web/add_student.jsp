<%-- 
    Document   : add_student
    Created on : Apr 24, 2019, 10:35:49 AM
    Author     : khsci5mca16124
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    <link href="login.css" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Montserrat:600" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Quicksand:500" rel="stylesheet">
        <script type="text/javascript">
            function valid()
            {
                letter = /^[A-Za-z]+$/;
                num=/^[0-9]+$/;
                var n=document.getElementIdBy("name").value;
                if(!n.match(letter))
                    document.getElementIdBy("namelab").value="Not valid";
                
                
            }
        </script>
    </head>
    <body class="bg_img">
        <div>
            <div class="cont1">
                <img src="gallery/logo.png" style="width: 60%; height: 35%;">
            </div>
        </div>
        
         <div class="log_cont1" style="width: 100%;">
            <center>
             <form action="admission_student" method="post">
                
                <table  cellpadding="6create" style="width:80%;">
                    
                    <tr>
                        <td> Name :</td> 
                        <td> <input type="text" name="txt1" class="input" id="name"><label for="name" id="namelab"></label><h5 style="color:red">*</h5></td>
                         <td>Admission No :</td> 
                          <td> <input type="text" name="txt3" class="input"> </td>
                        
                        <td>Admission date :</td> 
                        <td> dd-mm-yy <br> <input type="date"><h5 style="color:red">*</h5></td>
                        <td>DOB :</td> 
                        <td> dd-mm-yy <br> <input type="date"><h5 style="color:red">*</h5></td>
                        <td>Gender :</td> 
                        <td> <input type="radio" name="txt5" value="male" id='g' >Male <input type="radio" name="txt5" id='g' value="female" >Female<label for="name" id="genlab"></label> <h5 style="color:red">*</h5></td>
                        
                    </tr>
                    <tr>
                        <td>Course :</td> 
                        <td><select name="course" style="width: 100px;">
        <option selected="selected" value="bca">bca</option>
        <option value="ba english">ba english</option>
        <option value="mca">mca</option>
          <option value="ma english">ma english</option>
           <option value="bsc">bsc</option>
                            </select><h5 style="color:red">*</h5></td>
                    <td> Father Name :</td> 
                        <td> <input type="text" name="txt7" class="input" ><h5 style="color:red">*</h5><label for="name" id="fathrlab"></label> </td>
                         <td>Mother Name :</td> 
                        <td> <input type="text" name="txt8" class="input" ><h5 style="color:red">*</h5><label for="name" id="mothrlab"></label> </td>
                        <td>Father job:</td> 
                        <td> <input type="text" name="txt9" class="input"> </td>
                        <td>Mother job :</td> 
                        <td> <input type="text" name="txt10" class="input"> </td>
                        
                    </tr>
                    
                    <tr>
                        <td>Father Number :</td> 
                        <td> <input type="text" name="txt11" class="input" ><h5 style="color:red">*</h5><label for="name" id="fathrnum"></label> </td>
                        <td>Mother Number :</td> 
                        <td> <input type="text" name="txt12" class="input" ><h5 style="color:red">*</h5><label for="name" id="mothrnum"></label> </td>
                    <td> Email id :</td> 
                        <td> <input type="text" name="txt13" class="input" > </td>
                         <td>Religion :</td> 
                        <td> <input type="text" name="txt14" class="input" > </td>
                        <td>Address:</td> 
                        <td> <textarea cols="20" rows="4"></textarea>  </td>
                       
                    </tr>
                    
                     <tr>
                          <td>District :</td> 
                        <td> <input type="text" name="txt16" class="input" > </td>
                        <td> State:</td>
                        <td> <input type="text" name="txt17" class="input" > </td>
                        <td>Nationality :</td> 
                        <td> <input type="text" name="txt18" class="input" > </td>
                    <td> Guradian name :</td> 
                        <td> <input type="text" name="txt19" class="input" > </td>
                         <td>Guradian address :</td> 
                        <td> <input type="text" name="txt20" class="input" > </td>
                        
                        
                        
                    </tr>
                    <tr>
                        <td>Guradian number:</td> 
                        <td> <input type="text" name="txt21" class="input"> </td>
                        <td>Latarl entry :</td> 
                        <td> <input type="radio" name="txt22" value="yes" >Yes <input type="radio" name="txt22" value="no" >No </td>
                        <td>College Bus :</td> 
                        <td> <input type="radio" name="txt23" value="yes" >Yes <input type="radio" name="txt23" value="no" >No </td>
                        </tr>
                    
                     
                </table>
                    <br> <br>
                     <table class="blueTable">
<thead>
<tr>
<th>Qalification</th>
<th>Institution Name</th>
<th>Year passed</th>
<th>Mark</th>
</tr>
</thead>

<tbody>
<tr>
<td>High school<h5 style="color:red">*</h5></td>
<td><input type="text" name="txt25" class="input1" ></td>
<td><input type="text" name="txt26" class="input1" ></td>
<td><input type="text" name="txt27" class="input1" ></td>
</tr>
<tr>
<td>Higher Secondary<h5 style="color:red">*</h5></td>
<td><input type="text" name="txt28" class="input11" ></td>
<td><input type="text" name="txt29" class="input1" ></td>
<td><input type="text" name="txt30" class="input1" ></td>
</tr>
<tr>
<td>Under Graguation</td>
<td><input type="text" name="txt31" class="input1" ></td>
<td><input type="text" name="txt32" class="input1" ></td>
<td><input type="text" name="txt34" class="input1" ></td>
</tr>
<tr>
<td>Post Graguation</td>
<td><input type="text" name="txt35" class="input1" ></td>
<td><input type="text" name="txt36" class="input1" ></td>
<td><input type="text" name="txt37" class="input1" ></td>
</tr>
</tbody>
</table>
                
                <br> <br>
                <input type="submit" value="Submit" class="btn_lg" onclick="valid()">
              <br><br>
                      
                
    
    
    
   
            </form>
                <a href="admission_home.html"> <input type="submit" value="Cancel" class="btn_lg" > </a>
              </center>
              <br>  <br>
        </div>
        <%
            try 
            {
            String name=request.getParameter("txt1");
            name=name.replaceAll(" ", "_");
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
            address=address.replaceAll(" ", "_");
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
            hs_name=hs_name.replaceAll(" ", "_");
            String hs_year=request.getParameter("txt24");
            String hs_mark=request.getParameter("txt25");
            
            String hss_name=request.getParameter("txt26");
            hss_name=hss_name.replaceAll(" ", "_");
            String hss_year=request.getParameter("txt27");
            String hss_mark=request.getParameter("txt28");
            
            String ug_name=request.getParameter("txt29");
            ug_name=ug_name.replaceAll(" ", "_");
            String ug_year=request.getParameter("txt30");
            String ug_mark=request.getParameter("txt31");
            
            
            String pg_name=request.getParameter("txt32");
            pg_name=pg_name.replaceAll(" ", "_");
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
        %>
    </body>
</html>
