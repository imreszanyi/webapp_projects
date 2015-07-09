<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head><title>Hello</title></head>
    <body bgcolor="white">
        <img src="duke.waving.gif"> 
        <h2>Hello, my name is Duke. My hobby is Golf. What are your name and hobby?</h2>
        <form method="get">
            <input type="text" name="username" size="25">
            <input type="text" name="hobby" size="25">
            <p></p>
            <input type="submit" value="Submit">
            <input type="reset" value="Reset">
        </form>
        
        <%@include file="response.jsp" %>
    </body>
</html>

