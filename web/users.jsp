<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%
    String driverName = "com.mysql.jdbc.Driver";
    String connectionURL = "jdbc:mysql://localhost:3306/users?";
    String username = "root";
    String password = "";
%>
<h2 align="center"><font color="#FF00FF"><strong>USERS</strong></font></h2>
<table align="center" cellpadding="4" cellspacing="4">
<tr>

</tr>
<tr>
<td><b>NAME</b></td>
<td><b>PASSWORD</b></td>
</tr>
<%
try {
        Class.forName(driverName);
        Connection connection = DriverManager.getConnection(connectionURL, username, password);
        Statement statement = connection.createStatement();
        String sql = "SELECT * FROM user";

        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next())
        {
%>
            <tr>
            <td><%=resultSet.getString("name")%></td>
            <td><%=resultSet.getString("pass")%></td>
            </tr>
<%
        }
    }
catch (Exception e) 
    {
        e.printStackTrace();
    }
%>
</table>