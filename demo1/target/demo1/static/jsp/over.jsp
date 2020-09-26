<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<script src="/static/js/jquery-3.4.1.min.js" type="text/javascript"></script>
<body>
<form action="/doadd" method="post" id="form1">
    <table align="center" border="1px">
        <tr>
            <td colspan="2" align="center">学员信息添加</td>
        </tr>
        <tr>
            <td>姓名</td>
            <td><input type="text" name="name"/></td>
        </tr>
        <tr>
            <td>性别</td>
            <td><input type="text" name="gender"/></td>
        </tr>
        <tr>
            <td>年龄</td>
            <td><input type="text" name="age"/></td>
        </tr>
        <tr>
            <td>电话</td>
            <td><input type="text" name="telephone"/></td>
        </tr>
        <tr>
            <td>email</td>
            <td><input type="text" name="email"/></td>
        </tr>
        <tr>
            <td>班级</td>
            <td>
                <select name="classid" id="classid">
                    <option value="0">请选择</option>
                </select>
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="button" onclick="subadd()" value="保存"/>
                <input type="reset" value="返回">
            </td>
        </tr>
    </table>
</form>
</body>
<script type="text/javascript">
    function select() {
      $.post("/dozhong",function (result) {
         $.each(result.data,function (index,Classes) {
             var option=$("<option value='"+Classes.id+"'>"+Classes.name+"</option>")
             $("#classid").append(option);
         })
      },"json")
    }
    $(function () {
        select();
    })
    function subadd() {
        var form1 = $("#form1");
        var classid = $("#classid").val();
        if (classid == "0") {
            alert("请选择班级");
            return;
        }
        form1.submit();
    }
</script>
</html>
