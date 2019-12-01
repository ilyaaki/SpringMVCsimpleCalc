<%--
  Created by IntelliJ IDEA.
  User: Ilya
  Date: 01-Dec-19
  Time: 18:12
  To change this template use File | Settings | File Templates.
--%>
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
