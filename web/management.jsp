<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%
    String driverName = "com.mysql.jdbc.Driver";
    String connectionURL = "jdbc:mysql://localhost:3306/users?";
    String username = "root";
    String password = "";
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta  http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>log in</title>
    </head>
    <body>
        <form  method="POST"> 
        <pre>
        <input type="text" name="uname" placeholder="username"/> 

        <input type-="text" name="pass" placeholder="password"/>

        <input type="submit" value="insert"/>
        <input type="submit" value="view users" formaction="users.jsp"/>
        </pre>
    </form>
        
    </body>
</html>

<%
try {
            String uname = request.getParameter("uname");
            String pass = request.getParameter("pass");
            
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(connectionURL, username, password);
            
            Statement stmt = con.createStatement();
            stmt.executeUpdate("insert into user (name,pass) values ('"+uname+"' , '"+pass+"')");
           
                  
        }
        catch (Exception ex) 
        {
            ex.printStackTrace();
        }


%>

