<%@ page import="java.sql.*" %>
<%
    String id = request.getParameter("id");
    String coffeeName = request.getParameter("coffee_name");
    String price = request.getParameter("price");

    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");

        stmt = conn.createStatement();

        // Insert new record if form was submitted
        if (id != null && coffeeName != null && price != null) {
            String insertSQL = "INSERT INTO coffee VALUES (" + id + ", '" + coffeeName + "', " + price + ")";
            stmt.executeUpdate(insertSQL);
        }

        // Read all coffee records
        rs = stmt.executeQuery("SELECT * FROM coffee");

%>
        <h2>Coffee Records</h2>
        <table border="1">
            <tr>
                <th>ID</th>
                <th>Coffee Name</th>
                <th>Price</th>
            </tr>
<%
        while (rs.next()) {
%>
            <tr>
                <td><%= rs.getInt("id") %></td>
                <td><%= rs.getString("coffee_name") %></td>
                <td><%= rs.getDouble("price") %></td>
            </tr>
<%
        }
    } catch (Exception e) {
        out.println("Error: " + e.getMessage());
    } finally {
        try { if (rs != null) rs.close(); } catch (Exception e) {}
        try { if (stmt != null) stmt.close(); } catch (Exception e) {}
        try { if (conn != null) conn.close(); } catch (Exception e) {}
    }
%>
        </table>
