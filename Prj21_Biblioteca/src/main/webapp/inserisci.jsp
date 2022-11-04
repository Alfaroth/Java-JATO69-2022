<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inserisci</title>
</head>
<body>
	<h1>Inserisci</h1>

	<%@ include file="menu.jsp" %>

	<form action="doInserisci.jsp" method="post">
	
		<label for="titoloLibro">Titolo</label>
		<input type="text" name="titoloLibro" id="titoloLibro">
		<input type="submit" value="Aggiungi libro">
	
	</form>
	
	<div>
		<%
			if(request.getParameter("insert") != null)
                out.print(request.getParameter("insert"));
		%>
	</div>
	
</body>
</html>