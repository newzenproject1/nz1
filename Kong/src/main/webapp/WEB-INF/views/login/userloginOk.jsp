<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>		

	<c:if test="${UserLoginDTO!=null}">
  	<script>
  		location.href="${pageContext.request.contextPath }/board.action";
	</script>  
	</c:if>
	<c:if test="${UserLoginDTO==null}">
  	<script>
  	location.href="${pageContext.request.contextPath }/userlogin.action?clear=yes";
  	</script>  
	</c:if>
	