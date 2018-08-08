<%@ page import="java.util.*" %>
<jsp:useBean id="pendingacademic" class="beans.PendingAcademic" scope="request" />

 <!DOCTYPE html>
<html>
<head>
        <link rel="stylesheet" type="text/css" href="table.css">
        <h2 align="center"><font color="green" ><strong>TRIPS</strong></font></h2>
</head>
<body>
    <div style="overflow-x: auto;">
    <table class="table">
                <tr >
                 <th><b>TRIP NAME</b></th>
                 <th><b>DEPARTURE DATE</b></th>
                 <th><b>RETURN DATE</b></th>
                 <th><b>PASSENGER COUNT</b></th>
                 <th><b>DURATION</b></th>
                 <th><b>DESTINATION</b></th>
                 <th><b>DEPARTMENT</b></th>
                 <th><b>          </b></th>

                </tr>
    <%
		List<Object> list=new ArrayList<Object>();
		list=pendingacademic.getDb_Data();
		for(int i=0;i<list.size();i++)
                {
		pendingacademic.setObj(list.get(i));
		%>
            <tr>
                <td><%out.print(pendingacademic.getTripName());%></td>
                <td><%out.print(pendingacademic.getDestination());%></td> 
                <td><%out.print(pendingacademic.getDepartureDate());%></td>
                <td><%out.print(pendingacademic.getReturnDate());%></td>
                <td><%out.print(pendingacademic.getDuration());%></td>
                <td><%out.print(pendingacademic.getPassengerNumber());%></td>
                <td><%out.print(pendingacademic.getDepartment());%></td>
                <td><input type="button" class="btn" value="OPEN" /></td>

            </tr>
    <%          }
   
 %>
</table>
    </div>
</body>
</html>