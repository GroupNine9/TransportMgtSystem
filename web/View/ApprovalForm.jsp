<%-- 
    Document   : ApprovalForm
    Created on : Aug 6, 2018, 3:43:05 PM
    Author     : Grace
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="Model.MyDb"%>
<% MyDb db = new MyDb(); db.getCon();%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="form.css">
    </head>
    <body>
        <form>
<%         
        String query = "select * from staff ";
        Statement st = db.con.createStatement();
        ResultSet rs = st.executeQuery(query); 
%>
        <div class="dropdown">
        <p>Select Name 
            <select>
            <%
            while(rs.next())
            {
            String fname = rs.getString("NAME"); 
            %>
            <option value="<%=fname %>"><%=fname %></option>
            <%
            }
            %>
            </select>
        </p>
        
<%
        String query2 = "select * from vehicles ";
        Statement st2 = db.con.createStatement();
        ResultSet rs2 = st2.executeQuery(query2); 
%>
        <p>Select Vehicle :
            <select>
            <%
                while(rs2.next())
                {
                String fname = rs2.getString("PLATENUMBER"); 
            %>
                <option value="<%=fname %>"><%=fname %></option>
            <%
                }
            %>
            </select>
        </p>
        </div>
        <input class="btnsmall" type="submit" value="APPROVE TRIP"/>
        </form>
    </body>
</html>
