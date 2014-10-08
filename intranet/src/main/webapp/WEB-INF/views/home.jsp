<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
    <h1>List of All Inputs</h1>
    <ul>
        <c:forEach var="p" items="${inputs}">
            <li>Id: ${p.id} - Name: ${p.name} - Word: ${p.word} - Bit: ${p.bit} - Value: ${p.value} }</li>
        </c:forEach>
    </ul>
</body>
</html>
