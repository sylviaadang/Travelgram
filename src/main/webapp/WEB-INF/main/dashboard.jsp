<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
<script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
<meta charset="UTF-8">
<meta charset="UTF-8">
<title>Dashboard</title>
</head>
<body class="text-center">
		<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
			  <a class="navbar-brand ms-4" href="#">Travelgram</a>
			  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
			    <span class="navbar-toggler-icon"></span>
			  </button>
			  <div class="collapse navbar-collapse justify-content-center" id="navbarNav">
			    <ul class="navbar-nav">
			      <li class="nav-item active">
			        <a class="nav-link" href="/">Feed</a>
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
			  	  	<a class="btn btn-primary me-3" href="/profile">My Profile</a>
			  	</div>
			  	<div>
			  		<a class="btn btn-primary me-3" href="/users/logout">Logout</a>
			  	</div>
			  </div>
		</nav>
		
		<div>
			<c:forEach var="eachPost" items="${allPosts}">
				<div class="">
					<div class="d-flex justify-content-around">
						<h6>${eachPost.poster.userName}</h6>
						<p>Location: <c:out value="${eachPost.location}"/></p>
					</div>
					<div>
						<img class="w-50 h-50"src="${eachPost.image}" alt="${eachPost.location}">
						<p><c:out value="${eachPost.caption}"/></p>
						<div>
							<hr class="mx-auto w-50">
						</div>
					</div>
				</div>
				
			</c:forEach>
			
		</div>
	
</body>
</html>