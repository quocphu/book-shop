
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
					<li>Số lượng: <input type="text" value="1" name="amount"/></li>
					<input type="submit" value="Mua sách này" />
				</ul>
				
			</form>
		</c:if>
	</div>
