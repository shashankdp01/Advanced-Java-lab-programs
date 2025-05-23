<%--9b. Read all the existing records from the table coffee which is from the database test and query
coffee name starting with D in the table using HTML and JSP to get the field and display the
results respectively --%>


<%@ page import="java.sql.*" %>
<%
    String startLetter = request.getParameter("start_letter");

    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");

        String query = "SELECT * FROM coffee WHERE coffee_name LIKE ?";
        pstmt = conn.prepareStatement(query);
        pstmt.setString(1, startLetter + "%");

        rs = pstmt.executeQuery();
%>
        <h2>Coffee Names Starting with '<%= startLetter %>'</h2>
        <table border="1">
            <tr>
                <th>ID</th>
                <th>Coffee Name</th>
                <th>Price</th>
            </tr>
<%
        boolean found = false;
        while (rs.next()) {
            found = true;
%>
            <tr>
                <td><%= rs.getInt("id") %></td>
                <td><%= rs.getString("coffee_name") %></td>
                <td><%= rs.getDouble("price") %></td>
            </tr>
<%
        }

        if (!found) {
%>
            <tr><td colspan="3">No records found starting with '<%= startLetter %>'</td></tr>
<%
        }

    } catch (Exception e) {
        out.println("Error: " + e.getMessage());
    } finally {
        try { if (rs != null) rs.close(); } catch (Exception e) {}
        try { if (pstmt != null) pstmt.close(); } catch (Exception e) {}
        try { if (conn != null) conn.close(); } catch (Exception e) {}
    }
%>
        </table>
