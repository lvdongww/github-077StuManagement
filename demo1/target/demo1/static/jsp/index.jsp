<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/9/26
  Time: 15:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="/static/js/jquery-3.4.1.min.js"></script>
</head>
<body>
<center>
    <h1 style="color: red">学员信息列表</h1>
    <table border="1px" width="700px"  id="mytable">
        <tr style="text-align: right">
            <td colspan="7"><a href="/zhong">添加学员</a></td>
        </tr>
        <tr>
            <td>编号</td>
            <td>姓名</td>
            <td>性别</td>
            <td>年龄</td>
            <td>电话</td>
            <td>email</td>
            <td>班级</td>
        </tr>
    </table>
</center>
</body>
</html>
<script type="text/javascript">
    $("tr:gt(0)").css("background-color","#CCBBAB");
    $("tr:odd").css("background-color","#CACDCA");
    function chushi(){
        var json;
        $.post("/chushi",json,function (result) {
            $.each(result.data,function (index,Stduent) {
                var tr=$("<tr><td>"+Stduent.id+"</td><td>"+Stduent.name+"</td><td>"+Stduent.age+"</td><td>"+Stduent.gender+"</td><td>"+Stduent.telephone+"</td><td>"+Stduent.email+"</td><td>"+Stduent.classes.name+"</td></tr>");
                $("#mytable").append(tr);
            })
        },"json")
    }
    $(function () {
        chushi();
    })
</script>
