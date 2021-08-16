<%--
  Created by IntelliJ IDEA.
  User: tam
  Date: 15/08/2021
  Time: 22:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Toi thich em</title>
</head>
<body>
<h2>cung doanhuutam tra cuu tieng anh nao</h2>
<form action="/seach" method="get">
    <input type="text" name="word" placeholder="nao minh cung tra cuu">
    <button type="submit">Tra cuu</button>

</form>
<h1>${result}</h1>
</body>
</html>
