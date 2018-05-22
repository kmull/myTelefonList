<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>add User</title>
</head>
<body>
    <h1>Add user in one step</h1>

    <form method="post" action="/add-user">
        <label>Id: </label><input name="id" type="text"><br/><br/>
        <label>imie: </label><input name="name" type="text"><br/><br/>
        <label>nazwisko: </label><input name="surname" type="text"><br/><br/>
        <label>wiek: </label><input name="age" type="text"><br/><br/>
        <label>płeć: </label><input name="gender" type="text"><br/><br/>
        <label>telefon: </label><input name="telephone" type="text"><br/><br/>
        <label>komórka: </label><input name="mobile" type="text"><br/><br/>
        <label>adres: </label><input name="address" type="text"><br/><br/>
        <input type="submit" name="add-user" value="add-user">
    </form>

</body>
</html>
