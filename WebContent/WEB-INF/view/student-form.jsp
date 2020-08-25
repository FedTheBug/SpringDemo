<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
	<title>Student Registration Form</title>
	<style>
		.error{color:red}
	</style>
</head>
<body>
	<i>Asterisk (*) means required</i>
	<br></br>
	<form:form action="processForm" modelAttribute="Student">
	
	First Name: <form:input path ="firstName" />
	<form:errors path="firstName" cssClass="error"/>
	
	<br></br>
	
	Last Name(*): <form:input path ="lastName" />
	<form:errors path="lastName" cssClass="error"/>
	
	<br></br>
	
	Country:
	
	<form:select path = "country">
		<form:options items ="${Student.countryOptions}" />
	</form:select>
	
	<br></br>
	
	<input type = "submit" value="submit"/>
	
	</form:form>
</body>
</html>
