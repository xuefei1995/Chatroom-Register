function checkname() {
  var username=document.getElementById('username').value;
  var nameTip=document.getElementById('nameTip');
  var reg=/^[\u4e00-\u9fa5]{2,6}$/;
  if (reg.test(username)) {
    nameTip.innerHTML="该用户名可用".fontcolor("green");
    return true;
  }else{
    nameTip.innerHTML="用户名格式错误".fontcolor("red");
    return false;
  }
}

function checkpassword(){
  var userpassword=document.getElementById('userpassword').value;
  var passTip=document.getElementById('passTip');
  var reg=/^[a-zA-Z0-9]{6,12}$/;
  if (reg.test(userpassword)) {
    passTip.innerHTML="该密码可用".fontcolor("green");
    return true;
  }else{
    passTip.innerHTML="密码格式错误".fontcolor("red");
     return false;
  }
}

function checkage() {
  var userage=document.getElementById('userage').value;
  var ageTip=document.getElementById('ageTip');
  var reg=/^[0-9][1-9]{0,2}$/;
  if (reg.test(userage)) {
    ageTip.innerHTML="年龄格式正确".fontcolor("green");
    return true;
  }else{
    ageTip.innerHTML="年龄格式错误".fontcolor("red");
     return false;
  }
}

function checkphone() {
  var userphone=document.getElementById('userphone').value;
  var phoneTip=document.getElementById('phoneTip');
  var reg=/^[1][0-9]{10}$/;
  if (reg.test(userphone)) {
    phoneTip.innerHTML="该手机号可用".fontcolor("green");
    return true;
  }else{
    phoneTip.innerHTML="手机号格式错误".fontcolor("red");
     return false;
  }
}

function checkemail() {
  var useremail=document.getElementById('useremail').value;
  var emailTip=document.getElementById('emailTip');
  var reg=/^[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\.[a-zA-Z]+)+$/;
  if (reg.test(useremail)) {
    emailTip.innerHTML="该邮箱可用".fontcolor("green");
    return true;
  }else{
    emailTip.innerHTML="邮箱格式错误".fontcolor("red");
     return false;
  }
}

function checkAll(){
  if (checkname() && checkpassword() && checkage() && checkphone() && checkemail()) {
    return true;
  } else{
    return false;
  }
}

function demandname(){
  var nameTip=document.getElementById('nameTip');
  nameTip.innerHTML="2-6个中文汉字";
}

function demandpass(){
  var passTip=document.getElementById('passTip');
  passTip.innerHTML="6-12位字母或数字";
}

function demandage(){
  var ageTip=document.getElementById('ageTip');
  ageTip.innerHTML="1-3位有效数字";
}

function demandphone(){
  var phoneTip=document.getElementById('phoneTip');
  phoneTip.innerHTML="11位有效数字";
}

function demandemail(){
  var emailTip=document.getElementById('emailTip');
  emailTip.innerHTML="有效的邮箱地址";
}
