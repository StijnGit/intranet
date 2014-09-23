<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
    <h1>List of All Outputs</h1>
    <ul>
        <c:forEach var="p" items="${outputs}">
            <li>ID: ${p.id} - Name: ${p.name} - Word: ${p.word} - Bit: ${p.bit} - Value: ${p.value} }</li>
        </c:forEach>
    </ul>
</body>
</html>
