<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>add User</title>
</head>
<body>
    <div>
        <%@include file="face.jsp" %>
    </div>
    <div class="content">
    <br/>
    <h1 class="center">Add user in one step</h1>
        <%--<h2>Wprowadzone dane są niepoprawne!</h2>--%>
    <c:if test="${errorMessage != null}">
        <div style="color: red;" class="center">
            <h2>Wprowadzone dane są niepoprawne!</h2>
        </div>
    </c:if>
        <c:if test="${errorMessage == null}">
            <div style="color: blue;" class="center">
                <h2>Wprowadź dane:</h2>
            </div>
        </c:if>
    

    <form method="post" action="/add-user">
        <br/>
        <table>
            <tbody>
                <tr>
                    <td style="width: 100px;">
                        <label>imie: </label>
                    </td>
                    <td style="width: 100px;">
                        <input name="name" type="text">
                    </td>
                </tr>
                <tr>
                    <td style="width: 100px;">
                        <label>nazwisko: </label>
                    </td>
                    <td style="width: 100px;">
                        <input name="surname" type="text">
                    </td>
                </tr>
                <tr>
                    <td style="width: 100px;">
                        <label>wiek: </label>
                    </td>
                    <td style="width: 100px;">
                        <input name="age" type="text">
                    </td>
                </tr>
                <tr>
                    <td style="width: 100px;">
                        <label>płeć: </label>
                    </td>
                    <td style="width: 100px;">
                        <input name="gender" type="text">
                    </td>
                </tr>
                <tr>
                    <td style="width: 100px;">
                        <label>telefon: </label>
                    </td>
                    <td style="width: 100px;">
                        <input name="telephone" type="text">
                    </td>
                </tr>
                <tr>
                    <td style="width: 100px;">
                        <label>komórka: </label>
                    </td>
                    <td style="width: 100px;">
                        <input name="mobile" type="text">
                    </td>
                </tr>
                <tr>
                    <td style="width: 100px;">
                        <label>adres: </label>
                    </td>
                    <td style="width: 100px;">
                        <input name="address" type="text">
                    </td>
                </tr>
                <tr>
                    <td style="width: 100px;">
                        <br/>
                        <input type="submit" name="add-user" value="add-user">
                    </td>
                </tr>
            </tbody>
        </table>
    </form>


    <%--<label>imie: </label><input name="name" type="text"><br/><br/>--%>
    <%--<label>nazwisko: </label><input name="surname" type="text"><br/><br/>--%>
    <%--<label>wiek: </label><input name="age" type="text"><br/><br/>--%>
    <%--<label>płeć: </label><input name="gender" type="text"><br/><br/>--%>
    <%--<label>telefon: </label><input name="telephone" type="text"><br/><br/>--%>
    <%--<label>komórka: </label><input name="mobile" type="text"><br/><br/>--%>
    <%--<label>adres: </label><input name="address" type="text"><br/><br/>--%>
    <%--<input type="submit" name="add-user" value="add-user">--%>
    </div>
</body>
</html>
