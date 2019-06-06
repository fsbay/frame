<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
 <HEAD>
  <TITLE> New Document </TITLE>
  <META NAME="Generator" CONTENT="EditPlus">
  <META NAME="Author" CONTENT="">
  <META NAME="Keywords" CONTENT="">
  <META NAME="Description" CONTENT="">
<script src="https://web.iapppay.com/pub/js/jquery-1.12.4.js"></script>
  <script type="text/javascript">
  $(document).ready(function(){
	  $("#b01").click(function(){
	  var username=$("#username").val();
	  var password=$("#password").val();
	  var validate_code=$("#validate_code").val();
		alert("登录"+username+"|"+ password);
	  $.post("/api/sys/login",{"username":username,"password":password,"validate_code":validate_code},function(result){
	    alert(JSON.stringify(result));
	  });
	  });
	  
	  $("#b02").click(function(){
		  $.post("/api/sys/testapi",function(result){
		    alert(JSON.stringify(result));
		  });
		});
	  
	  $("#b03").click(function(){
		  $.post("/api/logout",function(result){
		    alert(JSON.stringify(result));
		  });
		});
	  
	  $("#b04").click(function(){
		  $.post("/api/sys/testapi1",function(result){
		    alert(JSON.stringify(result));
		  });
		});
	});
  </script>
 </HEAD>

 <BODY>
 <FORM METHOD=POST ACTION="">
	 用户名：<br/>
	<INPUT TYPE="text" NAME="username" id="username" value="dengzhineng"><br/>
 	密码：<br/>
 	<INPUT TYPE="text" NAME="password" id="password" value="bbbb"><br/>
 	<INPUT TYPE="text" NAME="validate_code" id="validate_code" value=""><br/>
 	<img src="/api/sys/validate_code" />
  	<INPUT id="b01" TYPE="button" value="登录"><br/>
 </FORM>
	<INPUT id="b02" TYPE="button" value="调起api"><br/>
	<INPUT id="b03" TYPE="button" value="登出"><br/>
	<INPUT id="b04" TYPE="button" value="没有权限的"><br/>
 </BODY>
</HTML>