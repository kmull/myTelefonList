<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
    <title>Home page</title>
</head>
<body>
    <div>
        <%@include file="face.jsp" %>
    </div>
    <h2>Hello World!</h2>
    <br/>

    <a href="/find-user-by-id">find user by id</a>
    <br/><br/>
    <a href="addUser.jsp">add user</a>
    <br/><br/>
    <a href="/read-user">show users</a>


</body>
</html>
