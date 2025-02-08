<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="insert">
			<label for="name"><b>Name</b></label>  
            <input type="text" id="name" name="name" placeholder="Enter Name" required>  
  
            <label for="email"><b>Email</b></label>  
            <input type="email" id="email" name="email" placeholder="Enter Email" required>  

            <label for="country"><b>Country</b></label>  
            <input type="text" id="country" name="country"  placeholder="Enter Country" required>  
  
            <button type="submit">Register</button>  

</form>


</body>
</html>