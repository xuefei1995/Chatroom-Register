<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
  <head>   
    <meta http-equiv="content-type" content="text/html;charset=utf-8"/>
    <title>用户注册</title>
    <link rel="stylesheet" type="text/css" href="./css/adduser.css">
    <script type="text/javascript" src="./js/adduser.js"></script>   
  </head>
  
  <body id="backbody">
  <div id="back_total">
      <div id="header">
          <div id="mylogo_left"><img src="/RegisterServer/images/logo.png" width="80px" height="80px"></div>
          <div id="mylogo_right">欢迎注册</div>
      </div>
      <div id="fromstyle">
          <form action="${pageContext.request.contextPath }/Adduser" method="post" onsubmit="return checkAll()"> 
              <div class="my_list"><span class="my_word">用户名</span>
                <input class="my_input1" type="text" name="name" id="username" onblur="checkname()" onfocus="demandname()">
                <span class="my_tip" id="nameTip"></span>
              </div>
              <div class="my_list"><span class="my_word">密码</span>
                <input class="my_input1" type="password" name="password" id="userpassword" onblur="checkpassword()" onfocus="demandpass()">
                <span class="my_tip" id="passTip"></span>
              </div>
              <div class="my_list"><span class="my_word">年龄</span>
                <input class="my_input1" type="text" name="age" id="userage" onblur="checkage()" onfocus="demandage()">
                <span class="my_tip" id="ageTip"></span>
              </div>
                <div class="my_list"><span class="my_word">性别</span>
                    <input class="my_input2" type="radio" name="gender" value="男">男
                    <input class="my_input2" type="radio" name="gender" value="女">女  
                </div>
                <div class="my_list"><span class="my_word">手机号</span>
                    <input class="my_input1" type="text" name="telphone" id="userphone" onblur="checkphone()" onfocus="demandphone()">
                    <span class="my_tip" id="phoneTip"></span>
                </div>
                <div class="my_list"><span class="my_word">邮箱</span>
                    <input class="my_input1" type="text" name="email" id="useremail" onblur="checkemail()" onfocus="demandemail()"> 
                    <span class="my_tip" id="emailTip"></span>
                </div>
                <div class="my_list"><input id="my_button" type="submit" value="立即注册"></div>
         </form>
      </div>
  </div>
  </body>
</html>

