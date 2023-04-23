<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.text.*,java.util.*"%>
<%@page import="java.io.*" %>
<%

String id = request.getParameter("userid");
String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3317/";
String database = "openmrs";
String userid = "openmrs";
String password = "TRyMGeAoqO4D";

// FETCH PASSED PARAMETERS
String person_id = request.getParameter("id"); // from URL GET
String given_name = request.getParameter("given_name"+person_id); // from form POST
String family_name = request.getParameter("family_name"+person_id); // from form POST

try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<!DOCTYPE html>
<html>
<body>

<h1>Retrieve data from database in jsp</h1>
<%
try{
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String sql = "UPDATE person_name SET given_name='"+given_name+"', family_name='"+family_name+"' WHERE person_id='"+person_id+"'";
statement.executeUpdate(sql);
connection.close();
} catch (Exception e) {
out.println("Exception occurred");
out.println(e.getMessage());
}
%>
</body>
</html>