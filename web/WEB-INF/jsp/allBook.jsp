<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2023/4/5
  Time: 12:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>书籍展示</title>
<%--    BootStrap美化界面--%>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>书籍列表---显示所有书籍</small>
                </h1>
            </div>
        </div>
        <div class="col-md-3 column">
<%--            查询书籍--%>
            <form action="${pageContext.request.contextPath}/book/getBooks" method="get" class="form-inline">
                <input type="text" class="form-control" name="query" placeholder="请输入书籍名称发起查询">
                <input type="submit" class="btn btn-primary" value="查询">
            </form>

        </div>
        <div class="col-md-0 column">
            <%--            查询书籍--%>
            <form action="${pageContext.request.contextPath}/book/allBook" method="get" class="form-inline">
                <input type="submit" class="btn btn-primary" value="显示全部书籍">
            </form>

        </div>
    </div>
</div>

<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                   <tr>
                       <th>书籍编号</th>
                       <th>书籍名称</th>
                       <th>书籍数量</th>
                       <th>书籍描述</th>
                       <th>操作</th>
                   </tr>
                </thead>
<%--                书籍从数据库中查询出来，从这个list中遍历出来：for-each--%>
                <tbody>
                    <c:forEach var="book" items="${list}">
                        <tr>
                            <td>${book.bookID}</td>
                            <td>${book.bookName}</td>
                            <td>${book.bookCounts}</td>
                            <td>${book.detail}</td>
                            <td>
                                <a class="btn btn-primary" href="${pageContext.request.contextPath}/book/toAddBook">新增</a>
                                &nbsp; | &nbsp;
                                <a class="btn btn-primary" href="${pageContext.request.contextPath}/book/toUpdateBook?id=${book.bookID}">修改</a>
                                &nbsp; | &nbsp;
                                <a class="btn btn-primary" href="${pageContext.request.contextPath}/book/deleteBook?id=${book.bookID}">删除</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
<%--<h1>书籍展示</h1>--%>
</body>
</html>
