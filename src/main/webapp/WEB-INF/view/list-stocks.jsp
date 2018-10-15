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
					<th>Stock Names</th>
					<th>Price</th>
				</tr>
				
				<c:forEach var="tempStock" items="${stocks}">
				
					<c:url var="stockInfoLink" value="/stocks/info">
						<c:param name="stock" value="${tempStock}" />
					</c:url>
				
					<tr>
						<td> ${tempStock.symbol} </td>
						<td> ${tempStock.name} </td>
						<td> ${tempStock.price} </td>
						
						<td>
							<a href="${stockInfoLink}">More info</a>
						</td>					
					</tr>
				
				</c:forEach>
						
			</table>
				
		</div>
	
	</div>
	

</body>

</html>
