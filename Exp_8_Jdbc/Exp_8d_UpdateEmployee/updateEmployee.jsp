<%--8d. Develop a JDBC project using JDBC to update the fields empno, empname and basicsalary into
the table Emp of the database Employee using HTML and JSP to get the fields and display the
results respectively --%>

<%@ page import="java.sql.*" %>
<%
    String empno = request.getParameter("empno");
    String empname = request.getParameter("empname");
    String basicsalary = request.getParameter("basicsalary");

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "");
        
        String query = "UPDATE Emp SET Emp_Name=?, Basicsalary=? WHERE Emp_NO=?";
        PreparedStatement pstmt = conn.prepareStatement(query);
        pstmt.setString(1, empname);
        pstmt.setInt(2, Integer.parseInt(basicsalary));
        pstmt.setInt(3, Integer.parseInt(empno));
        
        int rowsUpdated = pstmt.executeUpdate();

        if (rowsUpdated > 0) {
            out.println("<p>Employee details updated successfully!</p>");
        } else {
            out.println("<p>No employee found with given Emp No.</p>");
        }

        conn.close();
    } catch (Exception e) {
        out.println("<p>Error: " + e.getMessage() + "</p>");
    }
%>
<a href="updateForm.jsp">Go Back</a>