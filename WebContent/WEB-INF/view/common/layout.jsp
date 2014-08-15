<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
  <link href="${contextPath}/css/style.css" rel="stylesheet" type="text/css" id="globalStyle"></link>
  <script type="text/javascript" src="${contextPath}/js/execute.js"></script>
  <title><tiles:getAsString name="title" /></title>
</head>

<body>

<div>
	<div id="header">
		<tiles:insert attribute="header" />
	</div>
	<div id="container">		
		<div id="category">
			<tiles:insert attribute="category" />
			
		</div>
		<div id="content">
			<tiles:insert attribute="content" />
			
		</div>
	</div>
	<div id="footer"><tiles:insert attribute="footer" /></div>
</div>


</body>
</html>