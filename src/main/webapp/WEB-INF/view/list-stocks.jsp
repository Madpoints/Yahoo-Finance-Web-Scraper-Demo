<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>Stocks</title>
</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>Web Scraper Demo</h2>
		</div>
	</div>
	
	<div id="container">
	
		<div id="content">
		
			<table>
				<tr>
					<th>Stock Symbols</th>
				</tr>
				
				<c:forEach var="tempStock" items="${stocks}">
				
					<tr>
						<td> ${tempStock.symbol} </td>
					</tr>
				
				</c:forEach>
				
				<tr>
					<th>Stock Names</th>
				</tr>
				
				<c:forEach var="tempStock" items="${stocks}">
				
					<tr>
						<td> ${tempStock.name} </td>
					</tr>
				
				</c:forEach>
				
				<tr>
					<th>Price</th>
				</tr>
				
				<c:forEach var="tempStock" items="${stocks}">
				
					<tr>
						<td> ${tempStock.price} </td>
					</tr>
				
				</c:forEach>
						
			</table>
				
		</div>
	
	</div>
	

</body>

</html>
