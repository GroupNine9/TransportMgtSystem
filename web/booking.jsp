
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%
    String driverName = "com.mysql.jdbc.Driver";
    String connectionURL = "jdbc:mysql://localhost:3306/booking?";
    String username = "root";
    String password = "";
%>

<%@page contentType= "text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BOOKING</title>
        <link rel="stylesheet" type="text/css" href="styles.css" >
    </head>
    <body>
        <h1>BOOKING</h1>
        <pre>
        <form  method="POST"> 
                
 <label>Department Name</label>              <input type="text" name="uname"/>
       
<label> Booking Date</label>                 <input type="text" name="bkdate"/>
        
<label>Destination</label>                   <input type="text" name="dst"/>
        
<label>No. of Passengers</label>             <input type="text" name="pass"/>
        <input type="submit" value="submit"/>
        
    </form>
        </pre>
        
    </body>
</html>

<%
try {
            String Dname = request.getParameter("uname");
            String bdate = request.getParameter("bkdate");
            String dest = request.getParameter("dst");
            String Npass = request.getParameter("pass");
            
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(connectionURL, username, password);
            
            Statement stmt = con.createStatement();
            stmt.executeUpdate("insert into bdata (department_name,booking_date,destination,no_of_passengers) values ('"+Dname+"' , '"+bdate+"' , '"+dest+"' , '"+Npass+"')");
           
                  
        }
        catch (Exception ex) 
        {
            ex.printStackTrace();
        }


%>

