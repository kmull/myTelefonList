<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Read user</title>
</head>
<body>
<div>
    <%@include file="face.jsp" %>
</div>
<div class="content">
    <br/>
    <h2 class="center">Odczytaj wszystkich Userow</h2>
</div>


<div class="container" style="width: 50%">
    <h2>Wybierz osobe</h2>
    <div class="panel-group" id="accordion">
        <c:forEach var="entry" items="${userList}">

            <div class="panel panel-default">
                <div class="panel-heading">
                    <h4 class="panel-title">
                        <a data-toggle="collapse" data-parent="#accordion"
                           href="#collapse${entry.getId()}">${entry.getName()} ${entry.getSurname()}</a>
                    </h4>
                </div>
                <div id=collapse${entry.getId()} class="panel-collapse collapse in">
                    <div class="panel-body">
                        <p>komórka: ${entry.getMobile()}</p>
                        <p>stacjonarny: ${entry.getTelephone()}</p>
                        <p>adres: ${entry.getAddress()}</p>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>
</div>

</body>
</html>
