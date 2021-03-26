<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="text-align: center">
<table>	
<th>VegetableID </th><th> VegetableName </th><th> VegetableColor</th>
	<c:forEach var="vegetable" items="${vegList}">
	<tr>
		<td>${vegetable.getVegetableId()}</td>
		<td> ${vegetable.getVegetableName()}</td>
		<td>${vegetable.getVegetableColor()}</td>
	</tr>
		
	</c:forEach>
	
</table>

</body>
</html>






<%-- <%
List<VegetableDTO> vegetableList = (List<VegetableDTO>) request.getAttribute("vegList");
%> --%>
