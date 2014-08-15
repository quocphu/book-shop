
<c:if test="${not empty books }">
	<c:forEach var="book" items="${books}">

		<div class="book">
			<a href="${contextPath}/bookdetail.do?id=${book.id}"> 
			<img src="${contextPath}/images/book/default-book.jpeg" />
			 <span>${book.title}</span>
			</a>
		</div>
	</c:forEach>
</c:if>