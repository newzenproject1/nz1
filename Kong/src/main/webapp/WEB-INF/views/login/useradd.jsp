<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>


	 <div id="signForm">
	<form method="post" action="${pageContext.request.contextPath }/useraddOk.action">
	<div id="box">
	<table id="tbl" class="table">
	
	<tr>
		<td>
			아이디
		</td>
		<td>
			<input type="email" id="userid" name="userid" class="form-control" required>
		</td>
		<td id="useridResponse">
		
		</td>
	</tr>
	
	<tr>
		<td>
			비밀번호
		</td>
		<td>
			<input type="password" id="userpassword" name="userpassword"  class="form-control" required>
		</td>
		<td id="userpasswordResponse">	
		
		</td>
	</tr>	
	<tr>
		<td>
			비밀번호 다시 입력
		</td>
		<td>
			<input type="password" id="reuserpassword" name="reuserpassword" class="form-control"  required>
		</td>
		<td id="reuserpasswordResponse">
			
		</td>
	</tr>	
	
	<tr>
		<td colspan="3">
			<input type="submit" value="가입하기" class="btn">
		</td>
	</tr>
	
	</table>
	<!-- <input type="button" onclick="history.back();" value="뒤로가기">
 -->
 	</div>	
 </form>
	
	</div>

<script>
	
	var useridCheck=false;
	var userpasswordCheck=false;
	var reuserpasswordCheck=false;


	
	$("#userid").change(function(){
		
		
		var reg = /^([a-zA-Z0-9_\-\.]+)@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.)|(([a-zA-Z0-9\-]+\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\]?)$/;
		
		if($("#userid").val().length==0){
			$("#useridResponse").html("");
			useridCheck=false;
			
		}else if(!reg.test($("#userid").val())){
			
			$("#useridResponse").html("<div style='color:red;'>이메일을 입력하세요.</div>");
			useridCheck=false;
			
	}
		
			
		
	});
	
	
	$("#userpassword").change(function(){
		
		var reg = /^(?=[^\d_].*?\d)\w(\w|[!@#$%]){7,12}$/;
		
		
		if($("#userpassword").val().length==0){
			$("#userpasswordResponse").html("")
			userpasswordCheck=false;
			
		}else if(!reg.test($("#userpassword").val())){
			
			$("#userpasswordResponse").html("<div style='color:red;'>8자 이상 12자 이하, 숫자 하나 이상 포함, 숫자로 시작X</div>")
			userpasswordCheck=false;
			
		}else if(reg.test($("#userpassword").val())){

			$("#userpasswordResponse").html("");
			userpasswordCheck=true;
			checkSubmit();
			
		}
		
		
		
	});
	
	$("#reuserpassword").change(function(){
		if($("#reuserpassword").val().length==0){
			$("#reuserpasswordResponse").html("");
			reuserpasswordCheck=false;
			
		}else if($(this).val()!=$("#userpassword").val()){
			$("#reuserpasswordResponse").html("<div style='color:red;'>동일하지 않은 비밀번호입니다.</div>")
			reuserpasswordCheck=false;
			
		}else if($(this).val()==$("#userpassword").val()){
		
			$("#reuserpasswordResponse").html("");
			reuserpasswordCheck=true;
			checkSubmit();
		}

	}); 
	
	</script>