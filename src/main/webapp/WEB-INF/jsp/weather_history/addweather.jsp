<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>날씨 정보</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
<link rel="stylesheet" type="text/css" href="/css/weather_history/weatherhistory.css">
</head>
<body>
	<div id="wrap" class="container bg-info">
		<section class="contents d-flex bg-secondary">
			<div class="menu bg-danger col-2"></div>
			<div class="input bg-primary col-10">
				<div>
				<h1>날씨 입력</h1>
				</div>
				<div>
					<form>
					<div class="d-flex ml-4">
					<label for="date">날짜</label>
					<input type="text" id="date" name="date" class="form-control col-2">
					<label for="weather" class="ml-3">날씨</label>
					<select name="weather" class="col-2">
						<option>최악</option>
						<option>나쁨</option>
						<option>보통</option>
						<option>좋음</option>
					</select>
					</div>
					</form>
				</div>
				
			</div>
		</section>
		
		<footer class="bg-warning d-flex">
			<div class="d-flex align-items-center">
				<img src="/img/logo.jpg" width="150">
			</div>
			<div class="d-flex ml-3 align-items-center">
				<small>
				서울시 동작구 여의대방로 16길 61<br>
				Copyright © marondal 2021
				</small>
			</div>
		</footer>
	</div>
</body>
</html>