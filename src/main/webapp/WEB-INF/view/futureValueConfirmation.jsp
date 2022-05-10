<%--
  Created by IntelliJ IDEA.
  User: Calin
  Date: 10/05/2022
  Time: 13:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Future value confirmation</title>
    <link type="text/css"
          rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>
    <div class="container">
        <div class="content">
            <b>The future value of your investment is:</b>
            <br>
            ${futureValue}
            <br>
        </div>
    </div>
</body>
</html>
