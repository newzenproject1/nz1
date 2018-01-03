<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style>
	#wrap{
		width:800px;
		margin: 0px auto 0 auto;
	}
	
	#title{
		height : 16;
         font-family :'돋움';
            font-size : 12;
            text-align :center;
            background-color: #F7F7F7;
	}
	
	
</style>


	<h1 class="container" align="center">댓글</h1>
	
	
	<form action="${pageContext.request.contextPath}/replyaddOk.action" method="Post">
	<table class="table table-boader" style="width:500px;">
		<tr>
			<th>댓글</th>
			<th><textarea name="reply" style="width:412px; height:60px; resize:none;" class="form-control" requried></textarea></th>
			<th><input name="btn1" type="submit" value="등록" style="width:45px;" onclick="location.href='${pageContext.request.contextPath}/replyadd.action?boardseq=${vdto.boardseq}'"></th>
		</tr>	
	</table>
		<input type="hidden" name="boardseq" value="${vdto.boardseq}">
	</form>
	<table class="table table-boader">
		<c:forEach items="${rlist}" var="rdto">
		<tr>
			<th>응?</th>
			<td>${rdto.reply}</td>
			<td>${rdto.boardseq}</td>
		</tr>
		</c:forEach>	
	</table>

		
