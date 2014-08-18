<h3>Loại sách</h3>
<ul>
	<c:if test="${not empty category}">
		<c:forEach var="c" items="${category }">
			<li><a href="${contextPath}/books.do?categoryid=${c.id}">${c.name }</a></li>
			
		</c:forEach>
	</c:if>
</ul>