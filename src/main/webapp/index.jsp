<%--
  Created by IntelliJ IDEA.
  User: tam
  Date: 15/08/2021
  Time: 09:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>aduudu</title>
  </head>
  <body>
  <h1>heloo doanhuutam</h1>
  <h2>Heloo:${name}</h2>
  <h1>chuyen dooi tien te</h1>
  <form action="/convert" method="post">
  <input type="text" name="money" placeholder="nhap so tien do muon chuyen">
  <select name="giatri" id="">
    <option value="22000">vnd</option>
    <option value="200">jpy</option>
  </select>
  <button type="submit"> chuyen doi</button>
  </form>
  </body>
</html>
