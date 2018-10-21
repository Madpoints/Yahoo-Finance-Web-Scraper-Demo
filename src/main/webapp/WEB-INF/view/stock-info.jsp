<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>Stock-Info</title>
</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>Stock Info</h2>
		</div>
	</div>
	
	<div id="container">
	
		<div id="content">
		
			<table>
			
				<tr>
					<th>Symbol</th>
					<th>Name</th>
					<th>Price</th>
					<th>Change</th>
				</tr>
				
				<tr>
					<td>${stockSymbol}</td>
					<td>${stockName}</td>
					<td>${stockPrice}</td>
					<td>${change}</td>
				</tr>
				
			</table>
		
		</div>
		
	</div>
	

</body>

</html>