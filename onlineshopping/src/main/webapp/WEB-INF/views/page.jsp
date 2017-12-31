<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />
<%-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Online Shopping</title>
</head>
<body>
${contextRoot} says  ${greeting}
</body>
</html> --%>


<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Online Shopping - ${title}</title>

<script>
	window.menu = '${title}'
</script>

<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">

<!-- Bootstrap Readable Theme CSS -->
<!-- <link href="${css}/bootstrap-readable-theme.css" rel="stylesheet"> -->

<!-- Bootstrap Minty Theme CSS -->
<!--<link href="${css}/bootstrap-minty-theme.css" rel="stylesheet">-->

<!-- Custom styles for this template -->
<link href="${css}/myapp.css" rel="stylesheet">

</head>

<body>
	<!-- Navigation -->
	<%@include file="./shared/navbar.jsp"%>

	<!-- Page Content -->
	<!--Loading The Home Content  -->
	<c:if test="${userClickHome == true }">
		<%@include file="home.jsp"%>
	</c:if>

	<!--Load only user clicks about  -->
	<c:if test="${userClickAbout == true }">
		<%@include file="about.jsp"%>
	</c:if>

	<!--Load only user clicks Contact  -->
	<c:if test="${userClickContact == true }">
		<%@include file="contact.jsp"%>
	</c:if>

	<!--Load only user clicks View Products  -->
	<c:if
		test="${userClickAllProducts == true or userClickCategoryProducts == true }">
		<%@include file="listProducts.jsp"%>
	</c:if>

	<!-- Footer -->
	<%@include file="./shared/footer.jsp"%>

	<!-- JQUERY -->
	<script src="${js}/jquery.min.js"></script>

	<!-- Bootstrap core JavaScript -->
	<script src="${js}/bootstrap.bundle.min.js"></script>

	<!--self coded JavaScript -->
	<script src="${js}/myapp.js"></script>

</body>

</html>
