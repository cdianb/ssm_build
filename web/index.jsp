<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2023/4/5
  Time: 11:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>首页</title>
    <style>
      a{
        text-decoration: none;
        color: black;
        font-size: 48px;
      }
      h3{
        width: 480px;
        height: 138px;
        margin: 100px auto;
        text-align: center;
        line-height: 138px;
        background-color: #e67c9e;
        border-radius: 8px;
      }
    </style>
  </head>
  <body>
  <h3>
    <a href="${pageContext.request.contextPath}/book/allBook">进入书籍页面</a>
  </h3>
  </body>
</html>
