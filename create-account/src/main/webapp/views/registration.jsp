<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <title>Insert title here</title>
    </head>
    <body>
        <h1>registration form</h1>
        <form action="home">
        
            First Name : <input id="firstname" name="firstname"/><br>
            Last Name : <input id="lastname" name="lastname"/><br>
            Phone Number : <input type="number" id="number" name="number"/><br>
            Email ID : <input id="email" name="email"/><br>
            Password : <input type="password" id="password" name="password"/><br>
            Gender : <input type="radio" name="gender" value="M" checked="true"/>Male
                     <input type="radio" name="gender" value="F" />Female <br>
                     <br>
                     <input type="checkbox" name="hobby" value="Dancing"/>Dancing
                     <input name="hobby" type="checkbox" value="Singing"/>Singing<br>

                     <input type="submit" value="Register Now"/>
        </form>
    </body>
</html>