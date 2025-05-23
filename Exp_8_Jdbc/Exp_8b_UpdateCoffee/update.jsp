<%--8b. Read all the existing records from the table coffee which is from the database test and update an
existing coffee product in the table with its id. [Create a table coffee with fields
( id,coffee_name,price)] using HTML and JSP to get the fields and display the results respectively --%>
<%@ page import="java.sql.*" %>
<%
    String id = request.getParameter("id");
    String coffeeName = request.getParameter("coffee_name");
    String price = request.getParameter("price");

    Connection conn = null;
    PreparedStatement pstmt = null;
    Statement stmt = null;
    ResultSet rs = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");

        // Update existing record
        if (id != null && coffeeName != null && price != null) {
            String updateSQL = "UPDATE coffee SET coffee_name = ?, price = ? WHERE id = ?";
            pstmt = conn.prepareStatement(updateSQL);
            pstmt.setString(1, coffeeName);
            pstmt.setDouble(2, Double.parseDouble(price));
            pstmt.setInt(3, Integer.parseInt(id));
            pstmt.executeUpdate();
        }

        // Display all coffee records
        stmt = conn.createStatement();
        rs = stmt.executeQuery("SELECT * FROM coffee");
%>
        <h2>Updated Coffee Records</h2>
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
        try { if (pstmt != null) pstmt.close(); } catch (Exception e) {}
        try { if (conn != null) conn.close(); } catch (Exception e) {}
    }
%>
        </table>
