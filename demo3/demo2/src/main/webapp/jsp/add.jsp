<!DOCTYPE table PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script>
function add(){
	var a=document.getElementById("name").value;
	var b=document.getElementById("code").value;
	var c=document.getElementById("desg").value;
	
	document.getElementById("add").addEventListener("click", function(){

		console.log("inside call");
	
    });
}
</script>  
</head>
<body>
<form action="/list.jsp" method="post" onsubmit="add()">
Name : <input type="text" value="name" id="name"  ><br><br>
Code : <input type="text" value="code" id="code" ><br><br>
Desg : <input type="text" value="desg" id="desg"><br><br>
<input type="submit" value="submit" id="add" >
</form>
</body>
</html>