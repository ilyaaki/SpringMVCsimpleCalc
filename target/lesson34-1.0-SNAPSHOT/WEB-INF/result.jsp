<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<%@ page session="true" %>
<%@include file="calc.jsp" %>
<% Double num=(Double)session.getAttribute("num");
    out.print("Result = "+num);   %>
</body>
</html>
