<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>배탈의 민족</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
<link rel="stylesheet" type="text/css" href="/css/Store/StoreStyle.css">
</head>
<body>
	<div id="wrap" class="container bg-info">
		<header class="bg-warning d-flex align-items-center ml-3">
			<div>
			<h1>배탈의 민족</h1>
			</div>
		</header>
		<section class="content bg-success">
			<div>
				<h1>우리동네 가게</h1>
			</div>
			<c:forEach items="${storeList }" var="store">
				<div>
					<div>${store.name }</div>
					<div>${store.phoneNumber }</div>
					<div>${store.address }</div>
				</div>
			</c:forEach>
		</section>
		<footer class="bg-danger d-flex align-items-center">
			<small>
				<div>
					<h3>㈜우아한형제</h3><br>
					<h4>고객센터:1500-1500</h4>
				</div>
			</small>
		</footer>
	</div>
</body>
</html>