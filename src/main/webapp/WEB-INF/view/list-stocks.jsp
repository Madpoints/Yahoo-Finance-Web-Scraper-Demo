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
				
				<!-- loop over and print our customers -->
				<c:forEach var="tempStock" items="${stocks}">
				
					<tr>
						<td> ${tempStock.symbol} </td>
					</tr>
				
				</c:forEach>
						
			</table>
				
		</div>
	
	</div>
	

</body>

</html>
