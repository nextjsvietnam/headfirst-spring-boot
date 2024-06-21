<%@page language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <h1>Job list</h1>
    <div class="row">

        <c:forEach var="job" items="${jobs}">

            <div class="card col-3 m-4">
                <div class="card-body">
                    <h5 class="card-title">${job.getJobName()}</h5>
                    <h6 class="card-subtitle mb-2 text-muted">${job.getDate()}</h6>
                    <p class="card-text">${job.getJobDescription()}</p>
                    <p>Required Year of Experience: ${job.getReqExperience()}</p>
                    <p>
                    <ul>
                        <c:forEach var="tech" items="${job.getTechStacks()}">
                            <li>${tech}</li>
                        </c:forEach>
                    </ul>
                    </p>
                    <a href="#" class="card-link">Details</a>
                </div>
            </div>
        </c:forEach>
    </div>

</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
        crossorigin="anonymous"></script>
</body>
</html>