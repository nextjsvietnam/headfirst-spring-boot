<%@ page import="net.refactoreverything.headfirstspringboot.model.Job" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="main.css"/>
</head>
<body>
<div class="container">
    <h1>Job detail</h1>
    <%
        Job job = (Job) request.getAttribute("job");
    %>
    <table class="table">
        <tbody>
        <tr>
            <th>Name</th>
            <td><%= job.getJobName() %>
            </td>
        </tr>
        <tr>
            <th>Description</th>
            <td><%= job.getJobDescription() %>
            </td>
        </tr>
        <tr>
            <th>Exp</th>
            <td><%= job.getReqExperience() %>
            </td>
        </tr>
        <tr>
            <th>Date</th>
            <td><%= job.getDate() %>
            </td>
        </tr>
        <tr>
            <th>TechStacks</th>
            <td>
                <ul>
                    <c:forEach var="tech" items="${job.getTechStacks()}">
                        <li>${tech}</li>
                    </c:forEach>
                </ul>
            </td>
        </tr>
        </tbody>
    </table>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
        crossorigin="anonymous"></script>
</body>
</html>