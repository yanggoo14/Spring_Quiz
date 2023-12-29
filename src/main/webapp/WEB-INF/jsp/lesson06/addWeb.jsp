<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>즐겨찾기 추가하기</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.7.1.js" integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
</head>
<body>
	<div class="container">
	<h1>즐겨찾기 추가하기</h1>	
		<div>
			<label for="name">제목</label>
			<input type="text" id="name" name="name" class="form-control col-3">
		</div>
		<div>
			<label for="address">주소</label>
			<input type="text" id="address" name="address" class="form-control col-10">
		</div>
		<input type="button" id="joinBtn" class="btn btn-success col-10 mt-3" value="추가">
	</div>
</body>
<script>
	$(document).ready(function () {
		$("#joinBtn").on('click',function() {
			
		let name = $("#name").val();
		if(!name){
			alert("제목를 입력하세요");
		}
		
		let address = $("#address").val();
		if(!address){
			alert("주소를 입력하세요");
		}
		console.log(name);
		console.log(address);
		
		$.ajax({
		//request	
			type:"POST"
			, url:"/add-web"
			, data:{"name":name, "address":address}
		
		//response
		,success:function(data){
			alert(data);
			if(data=="성공"){
				location.href="/lesson06/quiz01/after-web-view";
			}
		}
		,errer:function(request, status, error){
			alert(request);
			alert(status);
			alert(error);
			}
		}); // ajax끝
		});  // click 끝
	}); // ready끝

</script>
</html>