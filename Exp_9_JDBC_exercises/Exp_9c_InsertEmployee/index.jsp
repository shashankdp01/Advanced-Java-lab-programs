<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head><title>Add Employee</title></head>
<body>
<h2>Enter Employee Details</h2>
<form action="InsertEmployee.jsp" method="post">
    Emp No: <input type="text" name="empno" required /><br/><br/>
    Name: <input type="text" name="empname" required /><br/><br/>
    Basic Salary: <input type="text" name="salary" required /><br/><br/>
    <input type="submit" value="Add Employee" />
</form>
</body>
</html>