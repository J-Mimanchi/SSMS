<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html class="x-admin-sm">
<head>
    <meta charset="UTF-8">
    <title>欢迎页面-X-admin2.2</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <link rel="stylesheet" href="./css/font.css">
    <link rel="stylesheet" href="./css/xadmin.css">
    <script src="./lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="./js/xadmin.js"></script>

</head>
<body>
<div class="layui-fluid">
    <div class="layui-row layui-col-space15">
        <div class="layui-col-md12">
            <div class="layui-card">
                <div class="layui-card-body ">
                    <blockquote class="layui-elem-quote" style="font-size: 25px;">
                        欢迎使用学生管理系统：当前时间:<span id="datetime"></span>
                        <script>
                            setInterval(
                                "document.getElementById('datetime').innerHTML=new Date().toLocaleString();",
                                1000);
                        </script>
                    </blockquote>
                </div>
            </div>
        </div>
        <div class="layui-col-md12">
            <div class="layui-card">
                <div class="layui-card-header">系统信息</div>
                <div class="layui-card-body ">
                    <table class="layui-table">
                        <tbody>
                        <tr>
                            <th>系统名称</th>
                            <td>学生信息管理系统</td>
                        </tr>
                        <tr>
                            <th>系统版本</th>
                            <td>1.0</td>
                        </tr>
                        <tr>
                            <th>服务器地址</th>
                            <td>http://localhost:8080/SSMS/login.jsp</td>
                        </tr>
                        <tr>
                            <th>操作系统</th>
                            <td>Windows</td>
                        </tr>
                        <tr>
                            <th>运行环境</th>
                            <td>ApacheTomCat9.0.81/JDK17/</td>
                        </tr>
                        <tr>
                            <th>运用技术</th>
                            <td>Servlet+JSP+JSTL</td>
                        </tr>
                        <tr>
                            <th>MYSQL版本</th>
                            <td>8.0.23</td>
                        </tr>
                        <!-- 示例: JSP 表达式 -->
                        <tr>
                            <th>当前日期</th>
                            <td><%= new java.util.Date() %></td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>

    </div>
</div>

</body>
</html>
