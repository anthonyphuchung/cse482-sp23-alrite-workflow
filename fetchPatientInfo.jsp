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

try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
Statement stmnt = null;
ResultSet resultSet = null;
ResultSet rS = null;

try{
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
stmnt=connection.createStatement();

String sql = "SELECT * FROM person";
rS = stmnt.executeQuery(sql);

while(rS.next()){
    
    String pid = rS.getString("person_id");
    String gender = rS.getString("gender");
    String uuid = rS.getString("uuid");

    String sql2 = "SELECT * FROM person_name WHERE person_id=" + pid;
    statement=connection.createStatement();
    resultSet = statement.executeQuery(sql2);

    while(resultSet.next()){
        String person_id = resultSet.getString("person_name_id");
        String given_name = resultSet.getString("given_name");
        String family_name = resultSet.getString("family_name");
        
        out.println(person_id + " " + given_name + " " + family_name + " " + pid + " " + gender + " " + uuid);
    }

    statement.close();
    statement = null;
    resultSet.close();
    resultSet = null;
}

stmnt.close();
connection.close();
} catch (Exception e) {
out.println("Exception occurred");
out.println(e.getMessage());
}
%>