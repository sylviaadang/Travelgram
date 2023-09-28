<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
<script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
<meta charset="UTF-8">
<title>Profile</title>
</head>
<body class="text-center">
		<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
			  <a class="navbar-brand ms-4" href="/">Travelgram</a>
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
			  	<div class="d-flex dropdown">
			  	 <button class="btn btn-primary dropdown-toggle me-3" type="button" data-bs-toggle="dropdown" aria-expanded="false">
				    Post
				  </button>
				  <ul class="dropdown-menu">
				    <li><a class="dropdown-item" href="/post/create">Picture</a></li>
				    <li><a class="dropdown-item" href="#">Itinerary</a></li>
				    <li><a class="dropdown-item" href="#">Expense</a></li>
				  </ul>
				</div>
			  		
				  	<div>
				  		<a class="btn btn-primary me-3" href="/users/logout">Logout</a>
				  	</div>
			  </div>
		</nav>
		<div class="row mt-3">
			<div class="col-6 col-md-4 fixed">
				<p>Username: <c:out value="${loginUser.userName}"/></p>
				<a href="/bio/create">Edit Bio</a>
			</div>
			<div class="col-12 col-md-8">
				
					<c:forEach var="eachPost" items="${allPosts}">
						<c:if test="${eachPost.poster.id == loginUser.id}">
						<div class="border border-dark mb-3">
							<p>Location: <c:out value="${eachPost.location}"/></p>
							<img class="w-50 h-50"src="${eachPost.image}" alt="${eachPost.location}">
							<p><c:out value="${eachPost.caption}"/></p>
							</div>
						</c:if>
					</c:forEach>
				
			</div>
		</div>

</body>
</html>