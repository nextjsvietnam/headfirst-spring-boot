<%@page language="java" %>
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
        <h1>Hello, world!</h1>
        <p>${subcriber}</p>
        <p>Course : ${courseName}</p>
        <form method="get" action="/subcribe">
            <input type="hidden" name="subcriberId" value="1" />
            <div class="mb-3">
                <label for="exampleFormControlInput1" class="form-label">Email address</label>
                <input type="email" name="subcriberEmail" class="form-control" id="exampleFormControlInput1" placeholder="name@example.com">
            </div>
            <div class="mb-3">
                <label for="name"  class="form-label">Name</label>
                <input id="name" type="text" name="subcriberName" class="form-control" placeholder="your name" />
            </div>
            <div class="mb-3">
                <button class="btn btn-primary">Submit</button>
            </div>
        </form>
    </div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
</body>
</html>