<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>First Servlet</title>
</head>

<body style="background-color:powderblue;">
<body>


<script language="JavaScript">
    function validate(form1)
    { 
    	if (form1.text.value == "")
        {
    		alert("field is empty.")
            form1.text.focus()
            form1.text.select()
          
            return false
        }
    
    	
    return true}
    </script>

</head>
<body>

<form method="GET" action="finalexamproject.do"
    onSubmit="return validate(this)">
	
	
	<center>
	<h3> Enter text here:</h3>
	<br> 
		
      <textarea rows="10" cols="50" name="text"></textarea> 
      <br/>
      
      <input type="submit" value="submit"/>
    
      <input type = "reset" value = "Reset" />
	
	<br>
	</center>
</form>


</body>
</html>