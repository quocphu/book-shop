
	<div class="image">
		<img src="${contextPath}/images/book/default-book.jpeg" />
	</div>
	<div class="info">
		<c:if test="${not empty book}">
		
			<form action="${contextPath}/addcart.do" method="POST">
				<input type="hidden" name="bookId" value="${book.id }"/>
				<ul class="none-bullet">			
					<li>${book.title }</li>
					<li>${book.categoryName }</li>
					<li>${book.author }</li>
					<li>Đơn giá: ${book.price}</li>
					<li>Số lượng: <input type="text" value="<c:if test="${not empty ERROR }">${ERROR }</c:if><c:if test="${empty ERROR }">1</c:if>" name="amount"/></li>
					<c:if test="${not empty ERROR }"><li class="error-message"> Số lượng sách không đúng</li></c:if>
				</ul>
				<input type="submit" value="Mua sách này">
			</form>
		</c:if>
	</div>
