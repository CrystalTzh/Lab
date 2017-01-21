<%@ page import="com.example.listener.SessionListener" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: taozihan
  Date: 2016/12/19
  Time: 下午9:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<html>
  <head>
    <title>Index</title>

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

  <div class="row clearfix">
    <div class="col-md-12 column">

        <form class="form-signin" action="login.do" method="post" >
          <h2 class="form-signin-heading" align="center">登录</h2>
          <label for="inputUsername" class="sr-only">学号: </label>

          <input type="text" id="inputUsername" name="userId" class="form-control" placeholder="学号: " required autofocus>

          <label for="inputPassword" class="sr-only">密码: </label>

          <input type="password" id="inputPassword" name="password" class="form-control" placeholder="密码: " required>

          <input type="submit"  value="login">
          <input type="reset" value="cancel"/>
        </form>

      <%--<%--%>
        <%--if(session==null || session.getAttribute("type")=="user"){--%>
          <%--response.sendRedirect(request.getContextPath()+"/LoginServlet");--%>
        <%--}--%>
        <%--int userNum = ((Integer)application.getAttribute("username")).intValue();--%>
        <%--int custNum = ((Integer)application.getAttribute("custNum")).intValue();--%>
        <%--int totalNum = userNum+custNum;--%>
      <%--%>--%>
      <%--<p>用户人数：<%=userNum %>人</p>--%>
      <%--<p>游客人数：<%=custNum %>人</p>--%>
      <%--<p>总人数：<%=totalNum %>人</p>--%>


    </div>
  </div>


  </body>
</html>
