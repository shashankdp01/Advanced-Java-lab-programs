<%--9d. Develop a JDBC project using MySQL to delete the records in the table Emp of the database
Employee by getting the name starting with S through keyboard and Generate the report as
follows using HTML and JSP to get the field and display the results respectively

Salary Report

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Emp_No : 101
Emp_Name: Ramesh'
Basic : 25000
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Emp_No : 102
Emp_Name: Ravi
Basic : 20000
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ --%>

<%@ page import="java.sql.*" %>
<html>
<head>
    <title>Delete Employees Starting with 'S'</title>
</head>
<body>
<h2>Delete Employees Whose Name Starts with:</h2>
<form method="post">
    Enter Starting Letter: <input type="text" name="startLetter" maxlength="1" required/>
    <input type="submit" value="Delete"/>
</form>

<%
Connection con = null;
try {
    Class.forName("com.mysql.jdbc.Driver");
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "");

    String letter = request.getParameter("startLetter");
    if (letter != null && !letter.trim().isEmpty()) {
        String pattern = letter + "%"; // e.g., S%

        // First, fetch and show records to be deleted
        out.println("<h3>Employees to be deleted:</h3>");
        PreparedStatement psSelect = con.prepareStatement("SELECT * FROM Emp WHERE Emp_Name LIKE ?");
        psSelect.setString(1, pattern);
        ResultSet rsDel = psSelect.executeQuery();

        boolean found = false;
        while (rsDel.next()) {
            found = true;
            out.println("Emp_NO: " + rsDel.getInt("Emp_NO") + ", ");
            out.println("Name: " + rsDel.getString("Emp_Name") + ", ");
            out.println("Salary: " + rsDel.getInt("Basicsalary") + "<br/>");
        }

        if (!found) {
            out.println("<p style='color:blue;'>No employees found starting with '" + letter + "'.</p>");
        } else {
            // Delete the records
            PreparedStatement psDelete = con.prepareStatement("DELETE FROM Emp WHERE Emp_Name LIKE ?");
            psDelete.setString(1, pattern);
            int count = psDelete.executeUpdate();
            out.println("<p style='color:green;'>" + count + " record(s) deleted successfully.</p>");
        }
    }

    // Display Remaining Employees
    out.println("<hr/><h3>Remaining Employee Records:</h3>");
    Statement stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery("SELECT * FROM Emp");

    out.println("<pre>---------------------------------------------</pre>");
    while (rs.next()) {
        out.println("Emp_NO   : " + rs.getInt("Emp_NO") + "<br/>");
        out.println("Emp_Name : " + rs.getString("Emp_Name") + "<br/>");
        out.println("Basic    : " + rs.getInt("Basicsalary") + "<br/>");
        out.println("<pre>---------------------------------------------</pre>");
    }

} catch(Exception e) {
    out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
} finally {
    if (con != null) con.close();
}
%>
</body>
</html>