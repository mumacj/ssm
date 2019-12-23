<%--
  Created by IntelliJ IDEA.
  User: Ncj
  Date: 2019/12/23
  Time: 15:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>更新书籍</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>更新书籍</small>
                </h1>
            </div>
        </div>

        <form action="/book/updateBook" method="post">
            <input type="text" name="bookId" id="bookId" value="${book.bookId}" hidden>
            <div class="form-group">
                <label>书籍名称</label>
                <input type="text" name="bookName" class="form-control" id="bookName" value="${book.bookName}" required>
            </div>
            <div class="form-group">
                <label>书籍数量</label>
                <input type="text" name="bookCounts" class="form-control" id="bookCounts" value="${book.bookCounts}" required>
            </div>
            <div class="form-group">
                <label>书籍描述</label>
                <input type="text" name="detail" class="form-control" id="detail" value="${book.detail}" required>
            </div>

            <div class="form-group">
                <input type="submit" class="form-control" value="更新">
            </div>
        </form>
    </div>
</div>
</body>
</html>
