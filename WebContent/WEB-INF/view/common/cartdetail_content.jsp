
<table>
	<thead>
		<tr>
			<th>STT</th>
			<th>Tên sách</th>
			<th>Tác giả</th>
			<th>Giá</th>
			<th>Số lượng</th>
			<th>Thành tiền</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="book" items="${CART.books}">
			<tr>
				<td>1</td>
				<td>${book.title}</td>
				<td>${book.author}</td>
				<td>${book.price}</td>
				<td>${book.amount}</td>
				<td>${book.amount*book.price}</td>
			</tr>
		</c:forEach>
	</tbody>
	<tfoot>
		<tr>
			<td colspan="5">Tổng cộng</td>
			<td>${CART.moneyTotal}</td>
		</tr>
	</tfoot>
</tabfle>

	<a href="${contextPath}/checkout.do">Thanh toan</a>