<%--
  Created by IntelliJ IDEA.
  User: taozihan
  Date: 2016/12/19
  Time: 下午10:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>

    <script src="dist/js/jQuery-2.1.4.min.js"></script>
    <link href="dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="dist/css/bootstrap.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="lab/css/signin.css" rel="stylesheet">

    <%--<script src="dist/js/jquery.dataTables.min.js"></script>--%>
    <%--<script src="dist/js/bootstrap.min.js"></script>--%>
    <script src="dist/js/bootstrap.js"></script>

</head>

<meta charset="utf-8">

<body>
<%--Welcome <%=session.getAttribute("user") %><br>--%>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <nav class="navbar navbar-default" role="navigation">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="welcome.jsp">学生教务系统</a>
                </div>
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li>
                            <a href="welcome.jsp">首页</a>
                        </li>
                        <li>
                            <a href="scores.jsp">成绩查看</a>


                        </li>

                    </ul>

                    <ul class="nav navbar-nav navbar-right">

                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">个人设置<strong class="caret"></strong></a>
                            <ul class="dropdown-menu">
                                <li>
                                    <a href="#">Action</a>
                                </li>
                                <li>
                                    <a href="#">Another action</a>
                                </li>
                                <li>
                                    <a href="#">Something else here</a>
                                </li>
                                <li class="divider">
                                </li>
                                <li>
                                    <a href="#">Separated link</a>
                                </li>
                            </ul>
                        </li>

                        <li>
                            <a href="welcome.jsp">退出</a>
                        </li>
                    </ul>

                    <form class="navbar-form navbar-right" role="search">
                        <div class="form-group">
                            <input type="text" class="form-control" />
                        </div> <button type="submit" class="btn btn-default">搜索</button>
                    </form>
                </div>
            </nav>
        </div>
    </div>
</div>

<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="jumbotron">
                <h1 class="center-block">
                    欢迎进入学生教务系统!
                </h1>
                <p>

                </p>
                <p>
                    <a class="btn btn-primary btn-large" href="index.jsp">Sign In </a>
                </p>
            </div>
        </div>
    </div>
</div>

</body>
</html>
