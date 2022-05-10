<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Calin
  Date: 08/05/2022
  Time: 11:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Investment Calculator</title>
    <link type="text/css"
          rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>
    <div class="container">
        <div class="content">
            <b>Welcome to the investment calculator!</b>
            <br>
            <b>Please fill in the inputs of your projected investment:</b>
            <br>
            <form:form action="showFutureValue" modelAttribute="dataEntry">
                Start amount: <form:input path="startAmount"/>
                <br>
                Contribution: <form:input path="contribution"/>
                <br>
                Number of contributions during the year: <form:input path="contributionRate"/>
                <br>
                Compounding periods: <form:input path="compoundPeriods"/>
                <br>
                Timespan of investment: <form:input path="time"/>
                <br>
                Projected return of the market: <form:input path="returnRate"/>
                <br>
                <input type="submit" value="Compute future value">
            </form:form>
        </div>
    </div>
</body>
</html>
