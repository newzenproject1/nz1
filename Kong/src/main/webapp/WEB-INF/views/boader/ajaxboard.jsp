<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
<style>


</style>

<script>

	$(document).ready(function() {
		
		$.ajax({
			type:"get",
			url:"${pageContext.request.contextPath}/ajaxboard.action",
			success:function(result) {
				alert("우와된다!");
			},
			error:function(err) {
				alert("안됨ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ");
			}
			
			
		});
		
		
	});
	
</script>