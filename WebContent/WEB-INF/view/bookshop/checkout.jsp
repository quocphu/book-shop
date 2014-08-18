
<tiles:insert beanName="main">
  <tiles:put name="title" value="Login" />
  <tiles:put name="category" value="category.jsp"/>
  <tiles:put name="content" type="string">
  <a href="${contextPath }/books.do">Tiep tuc mua</a><br/>
  <a href="${contextPath }/history.do">Lich su mua</a><br/>
  </tiles:put>
</tiles:insert>
