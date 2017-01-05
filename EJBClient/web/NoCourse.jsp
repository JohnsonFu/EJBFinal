<%--
  Created by IntelliJ IDEA.
  User: fulinhua
  Date: 2017/1/4
  Time: 17:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.fulinhua.bean.Student" %>
<html>
<head>
    <title>没有选课</title>
    <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
    <script src="bootstrap/js/bootstrap.min.js"></script>
    <script src="jquery-1.8.3/jquery.js"></script>
</head>
<body>
 <jsp:useBean id="student"
              type="com.fulinhua.bean.Student"
              scope="session"></jsp:useBean>
 <a href="/EJBClient_war_exploded/logout.student">退出登录</a><br>
 学生ID:<jsp:getProperty name="student" property="id"></jsp:getProperty>
 学生姓名:<jsp:getProperty name="student" property="name"></jsp:getProperty><br>
你没有选任何课程!
</body>
</html>
