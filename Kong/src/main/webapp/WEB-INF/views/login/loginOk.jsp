<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>		

	<c:if test="${LoginDTO!=null}">
  	<script>
  		location.href="${pageContext.request.contextPath }/admin.action";
	</script>  
	</c:if>
	<c:if test="${LoginDTO==null}">
  	<script>
  	location.href="${pageContext.request.contextPath }/userlogin.action?clear=yes";
  	</script>  
	</c:if>
	