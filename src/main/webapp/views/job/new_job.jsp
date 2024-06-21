<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="main.css" />
</head>
<body>
<div class="container">
    <h1>New job</h1>
   <form:form action="create-job" method="post" modelAttribute="job">
       <input type="hidden" name="jobId" value="1" />
       <div class="mb-3">
           <label for="exampleFormControlInput1" class="form-label">Job</label>
           <input type="text" name="jobName" class="form-control" id="exampleFormControlInput1" >
       </div>
       <div class="mb-3">
           <label for="jobDescription"  class="form-label">Description</label>
           <form:textarea path="jobDescription" />
       </div>
       <div class="mb-3">
           <label for="date"  class="form-label">Date</label>
           <input id="date" type="date" name="date" class="form-control"  />
       </div>
       <div class="mb-3">
           <label for="reqExperience"  class="form-label">Required experience</label>
           <input id="reqExperience" type="number" min="0" max="30" name="reqExperience" class="form-control" />
       </div>
       <div class="mb-3">
           <label for="techStacks"  class="form-label">Techstacks</label>
           <select name="techStacks" id="techStacks" multiple="multiple">
               <option value="">Please select</option>
               <c:forEach var="techStack" items="${techStacks}">
                   <option value="${techStack.name}">${techStack.name}</option>
               </c:forEach>
           </select>
       </div>
       <div class="mb-3">
           <button class="btn btn-primary">Submit</button>
       </div>
   </form:form>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
</body>
</html>