<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
	<div class="row">
		<form action="./submitPerson" method="post">
			<table cellpadding="5px" cellspacing="5px">
				<tr>
					<td>ENTER NAME :</td>
					<td><input type="text" name="name" class="form-control"/></td>
				</tr>
				
				<tr>
					<td>ENTER AGE :</td>
					<td><input type="text" name="age" class="form-control"/></td>
				</tr>
				
				<tr>
					<td>ENTER PHONE :</td>
					<td><input type="text" name="phone" class="form-control"/></td>
				</tr>
				
				<tr>
					<td colspan="2" align="center"><input type="submit" value="SUBMIT" class="btn btn-primary"/></td>
				</tr>
			</table>
		</form>
	</div>
	</div>
	
	<div class="row">
		<div class="col-md-12">
			<div class="display-6" style="color: red">${error}</div>
			<div class="display-6" style="color: green">${success}</div>
		</div>
	</div>
</body>
</html>