<%@page import="model.Libro"%>
<%@page import="controller.LibroCtrl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello Tomcat</title>
<link href="./css/style.css" rel="stylesheet">
</head>
<body>

	<h1>Hello web</h1>
	
	<%
	
		LibroCtrl.libreria.add(new Libro("Zanna Bianca"));
		LibroCtrl.libreria.add(new Libro("Io robot"));
	
		for (Libro l: LibroCtrl.libreria) {
			out.print("<p>" + l + "</p>");
		}
		
	%>
	
	<ul>
		<li>
			<a href="pagina2.jsp">Pagina 2</a>
		</li>
	</ul>
	
	<script type="text/javascript">
		console.log('Funziona');
	</script>	
	
</body>
</html>