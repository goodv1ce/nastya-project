<%@ page isELIgnored="false" %><%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
	<title>Book list</title>
</head>
<body>
	<h1>Book list</h1>

	<c:forEach var="book" items="${bookList}">
		<h3>Name: ${book.name}</h3>
		<h3>Type: ${book.type}</h3>
		<h3>Author: ${book.author}</h3>
		<h3>Condition: ${book.book_condition}</h3>
		<h3>Added: ${book.date_added}</h3>
	</c:forEach>
	<br>
</body>
</html>