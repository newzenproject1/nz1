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
<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>


	<c:if test="${UserLoginDTO!=null}">

	<h1 class="container" align="center">게시판</h1>
	
	<div id="wrap" class="container" style="width:500px; height:500px; align:center;">
	<c:forEach items="${nvlist}" var="vdto">
	<table class="table" id="BoardView" style="width:500px;">
	
		<tr>
			<td id="title">작성자</td>
			<td>${vdto.userid}</td>
		</tr>
	
		<tr>
			<td id="title">제목</td>
			<td>${vdto.title}</td>
		</tr>
		<tr>
			<td id="title" style="height:200px; vertical-align:middle;">내용</td>
			<td style="vertical-align:middle;">${vdto.ncontent}</td>
		</tr>
		<tr>
			<td id="title">작성일</td>
			<td>${vdto.enrolltime}</td>
		</tr>
		<tr>
			<td id="title">조회수</td>
			<td>${vdto.cnt_hit}</td>
		</tr>


	</table>

	<input type="hidden" value="${vdto.userid}" name="userid">
	
	<div align="center">
		<input class="btn btn-normal" type="button" value="뒤로가기" class="btn" onclick="history.back();">
		<c:if test="${UserLoginDTO.userid == vdto.userid}">
		<input class="btn btn-normal" type="button" id="delbtn" name="delbtn" value="글삭제" class="btn" onclick="location.href='${pageContext.request.contextPath}/boardDel.action?boardseq=${vdto.boardseq}';">
		<input class="btn btn-normal" type="button" id="editbtn" name="editbtn" value="수정하기" class="btn" onclick="location.href='${pageContext.request.contextPath}/boardEdit.action?boardseq=${vdto.boardseq}';">
		</c:if>
	</div>
	

	
	
	<!-- <script>
	
	$(document).ready(function() {
		
		
		var i = "${UserLoginDTO.userid}";
		
		if(i != "${vdto.userid}"){
			
			$("#delbtn").hide();
			$("#editbtn").hide();
		}
		
		
	});
	
	</script> -->
		
		</c:forEach>
		
		
		
	</div>
	</c:if>
	<c:if test="${UserLoginDTO == null}">
	<script>
	location.href="${pageContext.request.contextPath }/userlogin.action?clear=yes";
	</script>
	</c:if>
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
