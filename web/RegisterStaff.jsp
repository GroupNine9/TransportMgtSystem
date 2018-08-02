<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="beans.Staff"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Worker</title>
    </head>
    <body>
        <jsp:useBean id="staff" scope="request" class="beans.Staff"></jsp:useBean>
        
        <form  action="RegisterStaffServelet" method="post">
            STAFF ID <br>
            <input type="text" name="staffid" value="<jsp:getProperty name="staff" property="staffid"/>"><br>
        
            NAME<br>
            <input type="text" name="name" value="<jsp:getProperty name="staff" property="name"/>"><br>

            E-MAIL<br>
            <input type="text" name="email" value="<jsp:getProperty name="staff" property="email"/>"><br>
            
            ID-NUMBER<br>
            <input type="text" name="idnumber" value="<jsp:getProperty name="staff" property="idnumber"/>"><br>
            
            PHONE NUMBER<br>
            <input type="text" name="phonenumber" value="<jsp:getProperty name="staff" property="phonenumber"/>"><br>
            
            ROLE<br>
            <input type="text" name="role" value="<jsp:getProperty name="staff" property="role"/>"><br>
                         
            PASSWORD<br>
            <input type="text" name="password" value="<jsp:getProperty name="staff" property="password"/>"><br><br>
            
            <input type="submit" value="ADD EMPLOYEE">
        </form>
    </body>
</html>
