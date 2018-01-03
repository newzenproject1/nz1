<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<style>
	#Boardadd { margin-bottom:30px; }
</style>

	<c:if test="${UserLoginDTO!=null}">
	

	<h1 align="center"> 글쓰기</h1>
	
	<div id="Boardadd" align="center">
		<form action="${pageContext.request.contextPath}/boardaddOk.action" method="post">
			<div id="formTbl">
				<table>
					<tr>
						<th>제목</th>
						<td><input type="text" name="title" style="width:500px;" class="form-control" requried/></td>
					</tr>
					<tr>
						<th>내용</th>
						<td><textarea name="ncontent" style="height:300px; width:500px; resize:none;" class="form-control" requried></textarea></td>
					</tr>
					<tr>
				</table>
			</div>
			<hr style="width:700px;">
			<input type="button" value="취소하기" class="btn" onclick="history.back();"/>
			<input type="submit" value="등록하기" class="btn" />
			<input type="hidden" value="${UserLoginDTO.userid}" name="userid">
			</form>
	
	</div>
	
	</c:if>
	
	<c:if test="${UserLoginDTO == null}">
	<script>
	location.href="${pageContext.request.contextPath }/userlogin.action?clear=yes";

	</script>
	</c:if>
















