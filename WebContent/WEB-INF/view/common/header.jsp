<div id="logo">Logo</div>
<div id="user-info">
	<a href="#">${LOGIN.name }</a> | <a href="${contextPath}/logout.do">Logout</a> <br />
			<c:if test="${not empty CART }">
				<a	href="${contextPath }/cartdetail.do">Giỏ hàng</a>: 
				${CART.itemTotal} sách | Tổng tiền: ${CART.moneyTotal} 
			</c:if>
		
</div>