<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title></title>
    <link rel="stylesheet" href="lib/css/bootstrap.min.css" />
</head>
<body>
  <c:forEach items="${users}" var="user">
      ${user.id}
      ${user.age}
      ${user.name}
      ${user.sex}
      ${user.mail}
      <br>
  </c:forEach>

<hr>

<form action="user" method="post">

    姓名：<input type="text" name="name" value="test">
    性别：<input type="text" name="sex" value="女">
    年龄：<input type="text" name="age" value="18">
    邮箱：<input type="text" name="mail" value="test@qq.com">
    <input type="submit" value="添加">
</form>

</body>

<script type="javascript" src="lib/js/jquery-1.11.1.min.js"></script>
<script type="javascript" src="lib/js/bootstrap.js"></script>

</html>
