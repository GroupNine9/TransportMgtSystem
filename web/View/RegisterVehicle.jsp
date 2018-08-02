<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="beans.Vehicle"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Vehicle</title>
    </head>
    <body>
        <jsp:useBean id="vehicle" scope="request" class="beans.Vehicle"></jsp:useBean>
        
        <form  action="<%=request.getContextPath() %>/RegisterVehicleServelet" method="post">
            VEHICLE ID <br>
            <input type="text" name="vehicleid" value="<jsp:getProperty name="vehicle" property="vehicleid"/>"><br>
        
            PLATE NUMBER<br>
            <input type="text" name="platenumber" value="<jsp:getProperty name="vehicle" property="platenumber"/>"><br>

           MODEL<br>
            <input type="text" name="model" value="<jsp:getProperty name="vehicle" property="model"/>"><br>
            
            CAPACITY<br>
            <input type="text" name="capacity" value="<jsp:getProperty name="vehicle" property="capacity"/>"><br>
            
            TYPE<br>
            <input type="text" name="type" value="<jsp:getProperty name="vehicle" property="type"/>"><br>
            
            STATUS<br><br>
            <input type="text" name="status" value="<jsp:getProperty name="vehicle" property="status"/>"><br>
                       
            <input type="submit" value="ADD VEHICLE">
        </form>
    </body>
</html>
