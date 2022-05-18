<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
  <title>$Title$</title>
  <meta charset="ascii">
</head>
<body>
<form action="/dictionary" method="post">


  <p>Enter the word to translate</p>

  <input type="text" name="word" value="${word}">

  <input type="submit" value="translate">

  <c:if test="${word != null}">
    <p> ${doTrans} </p>
  </c:if>
</form>
</body>
</html>