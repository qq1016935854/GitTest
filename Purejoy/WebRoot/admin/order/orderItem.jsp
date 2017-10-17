<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="s"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>会员登录</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/bootstrap.min.css"
	type="text/css" />
<script src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js"
	type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"
	type="text/javascript"></script>
</head>
<body>
	<div class="container">
		<table class="table table-bordered">
			<tr class="danger">
				<th>图片</th>
				<th>商品</th>
				<th>价格</th>
				<th>数量</th>
				<th>小计</th>
			</tr>
			<s:forEach var="orderItem" items="${orders.list }">
				<tr>
					<td><img width="40" height="45"
						src="${pageContext.request.contextPath }/${orderItem.product.pimage}"></td>
					<td>${orderItem.product.pname }</td>
					<td>${orderItem.product.shop_price }</td>
					<td>${orderItem.count}</td>
					<td>${orderItem.subtotal }</td>
				</tr>
			</s:forEach>
		</table>
	</div>
</body>
</html>
