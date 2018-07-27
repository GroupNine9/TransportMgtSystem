<%-- 
    Document   : Booking
    Created on : Jul 27, 2018, 5:53:49 PM
    Author     : HP-
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>BOOKING</h1>
        <pre>
        <form action="/BookingController" method="POST"> 
                
 <label>Destination</label>              <input type="text" name="destination"/>
       
<label> Departure date</label>                 <input type="text" name="departuredate"/>
        
<label>Return Date</label>                   <input type="text" name="returndate"/>
        
<label>No. of Passengers</label>             <input type="text" name="passcount"/>

<label>Duration</label>             <input type="text" name="duration"/>
        <input type="submit" value="submit"/>
        
    </form>
        </pre>
    </body>
</html>
