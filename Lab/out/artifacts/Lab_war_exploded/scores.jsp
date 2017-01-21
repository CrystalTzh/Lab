<%@ page import="com.example.dao.user.UserDao" %>
<%@ page import="com.example.dao.user.UserDaoImpl" %>
<%@ page import="com.example.listener.SessionListener" %>
<%@ page import="com.example.pojo.user.SelectedClasses" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%--
  Created by IntelliJ IDEA.
  User: taozihan
  Date: 2016/12/21
  Time: 下午4:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="MyTag" uri="/WEB-INF/tlds/MyTag.tld" %>

<html>
<head>
    <title>Scores</title>

    <link href="dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="dist/css/bootstrap.css" rel="stylesheet">

    <script type="text/javascript" src="dist/js/jQuery-2.1.4.min.js"></script>
    <%--<script type="text/javascript" src="dist/js/jquery.dataTables.min.js"></script>--%>
    <script type="text/javascript" src="dist/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="dist/js/bootstrap.js"></script>

    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">

</head>

<body>

<MyTag:checkSession>

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
                    </button> <a class="navbar-brand" href="#">学生教务系统</a>
                </div>

                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li >
                            <a href="#">首页</a>
                        </li>
                        <li>
                            <a href="#">成绩查看</a>
                        </li>
                        <li>
                            <a href="result.jsp">人数统计</a>
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

    <%--<%--%>
        <%--String Login = (String)session.getAttribute("username");--%>
        <%--if (Login != null && Login.equals("OK")) {--%>
            <%--out.println("欢迎进入");--%>
            <%--session.invalidate();--%>
        <%--}   else {--%>
            <%--out.println("请先登录，谢谢") ;--%>
            <%--out.println("<br>经过五秒之后，网页会自动返回登录界面");--%>
            <%--response.setHeader("Refresh","5;URL=index.jsp");--%>
        <%--}--%>
    <%--%>--%>



    <div class="row clearfix">
        <div class="col-md-2 column">
            <div class="btn-group btn-group-vertical">
                <button class="btn btn-default" type="button">
                    <em class="glyphicon glyphicon-align-left"></em> 2016-2017学年</button>
                <button class="btn btn-default" type="button">
                    <em class="glyphicon glyphicon-align-center"></em> 2015-2016学年</button>
                <button class="btn btn-default" type="button">
                    <em class="glyphicon glyphicon-align-right"></em> 2014-2015学年</button>
            </div>
        </div>
        <div class="col-md-10 column">
            <table class="table">
                <thead>
                <tr>
                    <th>
                        课程编号
                    </th>
                    <th>
                        课程名字
                    </th>
                    <th>
                        学分
                    </th>
                    <th>
                        成绩
                    </th>
                </tr>
                </thead>

                <tbody>
                <tr class="info">

                <%
                    UserDao dao=new UserDaoImpl();
                    List<SelectedClasses> list =dao.getStudentSelectCourse(2016, request.getParameter("userId"));

                    for(SelectedClasses selectedClasse:list)
                    {%>
                <tr>
                    <td><%=selectedClasse.getCid() %></td>
                    <td><%=selectedClasse.getCourseName() %></td>
                    <td><%=selectedClasse.getCourseCredit() %></td>
                    <td><%=selectedClasse.getGrade() %></td>
                    </tr>
                <%}
                    %>

                </tr>
                </tbody>

            </table>

            </MyTag:checkSession>
            <%--<%--%>
                <%--int userNum = ((Integer)application.getAttribute("userNum")).intValue();--%>
                <%--int custNum = ((Integer)application.getAttribute("custNum")).intValue();--%>
                <%--int totalNum = userNum+custNum;--%>
            <%--%>--%>
            <%--<p>用户人数：<%=userNum %>人</p>--%>
            <%--<p>游客人数：<%=custNum %>人</p>--%>
            <%--<p>总人数：<%=totalNum %>人</p>--%>

            <%--<%--%>
                <%--request.setCharacterEncoding("UTF-8");--%>
                <%--// 取得登录的用户名--%>
                <%--String userId = request.getParameter("userId");--%>
                <%--// 把用户名保存进session--%>
                <%--System.out.println("jspsession:" + session.getId());--%>
                <%--session.setAttribute("userId", userId);--%>
                <%--session.setAttribute("onlineUserList", new SessionListener(userId));--%>

                <%--System.out.println("用户："+userId+" 登陆成功");--%>
                <%--// 把用户名放入在线列表--%>
                <%--List onlineUserList = (List) application.getAttribute("onlineUserList");--%>
                <%--// 第一次使用前，需要初始化--%>
                <%--if (onlineUserList == null) {--%>
                    <%--onlineUserList = new ArrayList();--%>
                    <%--application.setAttribute("onlineUserList", onlineUserList);--%>
                <%--}--%>
                <%--onlineUserList.add(userId);--%>

                <%--// 成功--%>
                <%--response.sendRedirect("result.jsp");--%>
            <%--%>--%>


        </div>
    </div>
</div>

</body>
</html>
