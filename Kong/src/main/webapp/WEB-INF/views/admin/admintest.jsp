<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style>

	
	
</style>
<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
<script>

	function mySubmit(index) {
		
		if(index == 1) {
			document.myForm.action="${pageContext.request.contextPath}/userdel.action";
		}
		
		if(index == 2) {
			document.myForm.action="${pageContext.request.contextPath}/writeo.action";
		}
		
		if(index == 3) {
			document.myForm.action="${pageContext.request.contextPath}/writex.action";
		}
		
		document.myForm.submit();
		
	}


</script>

	<c:if test="${LoginDTO != null}">

	<div>
	<form <%-- action="${pageContext.request.contextPath}/userdel.action" --%> name="myForm" method="post">
	<c:forEach items="${userlist}" var="udto">
	<table>
		<tr>
			<td><input type="checkbox" id="userid" name="userid" value="${udto.userid}"></td>
			<th>아이디</th>
			<td>${udto.userid}</td>
			<th>비밀번호</th>
			<td>${udto.userpassword}</td>
			<th>글권한</th>
			<td>${udto.writeO}</td>
			<th>읽기권한</th>
			<td>${udto.readO}</td>
		</tr>
	</table>
		
		<%-- <input type="hidden" id="userid" name="userid" value="${udto.userid}"> --%>
	
	</c:forEach>
	
	<input type="button" onclick='mySubmit(1)' value="삭제">
	<input type="button" onclick="mySubmit(2)" value="권한">
	<input type="button" onclick="mySubmit(3)" value="권한취소">
	<!-- <input type="submit" value="삭제" > -->
	 <%-- onclick="location.href='${pageContext.request.contextPath}/userdel.action';" --%>
	
	</form>
		
	
	</div>
	
	</c:if>
	<c:if test="${LoginDTO==null}">
	<script>
  	location.href="${pageContext.request.contextPath }/login.action?clear=yes";
	</script>
	</c:if>

	
	
	
	