<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Welcome</title>
</head>
<body>
<h1> Welcome to Web ${ username }</h1>
<h2> <a href="web/user">User page (admin+user permission)</a> </h2>
<h2> <a href="web/hello">Hello Page (admin+user permission)</a> </h2>
<h2> <a href="web/admin">Admin page (admin permission)</a> </h2>
<h2>@Copyright</h2>

</body>
</html>
