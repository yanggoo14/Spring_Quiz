<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quiz03</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
</head>
<body>
	<div class="container text-center">
		<h1>후보자 득표율</h1>
		<table class="table">
			<thead>
				<tr>
					<th>기호</th>
					<th>득표 수</th>
					<th>득표 율</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${candidates}" var="candidate" varStatus="status">
				<tr>
					<td>${status.count }</td>
					<td><fmt:formatNumber value="${candidate }" /> </td>
					<td></td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>	
	<div class="container">
	<h1>카드 명세서</h1>
	<table class="table">
			<thead>
				<tr>
					<th>사용처</th>
					<th>가격</th>
					<th>사용날짜</th>
					<th>할부</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${cardBills }" var="cardBill">
				<tr>
					<td>${cardBill.store }</td>
					<td><fmt:formatNumber value="${cardBill.pay }" type="currency"/></td>
					<td>
						<fmt:parseDate value="${cardBill.date }" pattern="yyyy-MM-dd" var="date"/>
						
					</td>
					<td></td>	
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>