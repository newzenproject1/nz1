<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
<style>


</style>

	<h1>게시판</h1>
	<c:if test="${UserLoginDTO!=null and UserLoginDTO.readO == 'o'}">

	
	<div class="container" align="center">
		<table class="table table-boader" style="margin:0 auto;">
			<thead>
	
			<tr>
				<th style="text-align:center;">번호</th>
				<th style="text-align:center;">제목</th>
				<th style="text-align:center;">작성일</th>	
				<th style="text-align:center;">작성자</th>
			</tr>


			<c:forEach items="${nlist}" var="dto">
			<tr>
				<td style="text-align:center;">${dto.boardseq}</td>
				<td style="text-align:left;"><a href="${pageContext.request.contextPath}/boardview.action?boardseq=${dto.boardseq}">${dto.title}</a></td>
				<td style="text-align:center;">${dto.enrolltime.substring(0,10)}</td>
				<td style="text-align:center;">${dto.userid}</td>
			</tr>
			</c:forEach>

		</table>

			<c:if test="${UserLoginDTO.writeO eq 'o'}">
				<input class="btn btn-default pull-right" type="button" id="write" name="write" style="margin-top:10px;" value="글쓰기" onclick="location.href='/test/boardadd.action';">
			</c:if>
	</div>
	
	
	</c:if>	
	
	
	
	
	<c:if test="${UserLoginDTO == null}">
	<script>
	location.href="${pageContext.request.contextPath }/userlogin.action?clear=yes";

	</script>
	</c:if>
	
	
	
	
	
	
	
	
	
	
