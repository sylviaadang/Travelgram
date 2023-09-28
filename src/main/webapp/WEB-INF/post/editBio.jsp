<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Bio</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
			  <a class="navbar-brand" href="#">Travelgram</a>
			  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
			    <span class="navbar-toggler-icon"></span>
			  </button>
			  <div class="collapse navbar-collapse justify-content-center" id="navbarNav">
			    <ul class="navbar-nav">
			      <li class="nav-item active">
			        <a class="nav-link" href="/">Feed<span class="sr-only">(current)</span></a>
			      </li>
			      <li class="nav-item">
			        <a class="nav-link" href="#">Itineraries</a>
			      </li>
			      <li class="nav-item">
			        <a class="nav-link" href="#">Expenses</a>
			      </li>
			    </ul>
			  </div>
			  <div class="d-flex">
			  	<div class="mr-3">
			  	  	<a href="/profile">My Profile</a>
			  	</div>
			  	<div>
			  		<a href="#">Logout</a>
			  	</div>
			  </div>
		</nav>
		
		<h4>Edit Bio</h4>
		<div class="row mt-3">
			<div class="border border-primary col-6 col-md-4">
				<p>Profile Info</p>
			</div>
			<div class="border border-primary col-12 col-md-8">
				<form:form action="/edit/bio" method="patch" modelAttribute="post">
						<form:hidden path="poster"/>
					<div class="form-group">
				        <label>First Name:</label>
				        <form:input path="firstName" class="form-control"/>
				        <form:errors path="firstName" class="text-danger"/>
				    </div>
				    <div class="form-group">
				        <label>Last Name:</label>
				        <form:input path="lastName" class="form-control"/>
				        <form:errors path="lastName" class="text-danger"/>
				    </div>
				     <div class="form-group">
				        <label>About Me:</label>
				        <form:input path="bio" class="form-control"/>
				        <form:errors path="bio" class="text-danger"/>
				    </div>
				    <input type="submit" value="Submit" class="btn btn-primary"/>
				</form:form>
				
			</div>
		</div>
		

</body>
</html>