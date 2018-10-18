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
		
			<p>${stockSymbol}</p>
			<p>${stockName}</p>
			<p>${stockPrice}</p>
		
		</div>
		
	</div>
	

</body>

</html>