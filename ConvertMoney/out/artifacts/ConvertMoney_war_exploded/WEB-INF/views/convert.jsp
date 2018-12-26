<%--
  Created by IntelliJ IDEA.
  User: lycifer
  Date: 26/12/2018
  Time: 10:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Currency Converter</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<div id="global">
    <form action="/details" method="post">
        <fieldset>
            <legend>Convert</legend>
            <label>Rate: </label><br/>
            <input type="text" name="rate" placeholder="RATE" value="22000"/><br/>
            <label>USD: </label><br/>
            <input type="text" name="usd" placeholder="USD" value="0"/><br/>
            <input type = "submit" id = "submit" value = "Converter"/>
        </fieldset>
    </form>
</div>

</body>
</html>
