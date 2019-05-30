<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
    
    <title>My JSP for test ajax page</title>

    <script>
       var ab = [{"name":"张三","sex":"男"},{"name":"李四","sex":"男"}];
       var cd = {"person":JSON.stringify(ab)};
       function TestAjax(){
           var xmlHttp;
           if (window.XMLHttpRequest) {
               xmlHttp = new XMLHttpRequest();
               
           } else {
               xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
           }
           xmlHttp.onreadystatechange = function(){
               if (xmlHttp.readyState==4 && xmlHttp.status==200) {
            	   var ja = JSON.parse(xmlHttp.responseText);
                  document.getElementById("sp1").innerHTML = ja[0].name; 
                  document.getElementById("sp2").innerHTML = ja[0].sex;
                  document.getElementById("sp3").innerHTML = ja[1].name;
                  document.getElementById("sp4").innerHTML = ja[1].sex;
               }
           }
           
           xmlHttp.open("POST", "Ajax", true);
           xmlHttp.setRequestHeader("Content-type","application/json;charset=UTF-8");
           xmlHttp.send(cd);
       }
    </script>

  </head>
  
  <body>
    <button onclick="TestAjax()">利用Ajax获取数据</button> <br>
    <span id = "sp"></span><br/>
    <span id = "sp1"></span><br/>
    <span id = "sp2"></span><br/>
    <span id = "sp3"></span><br/>
    <span id = "sp4"></span><br/>
    
  </body>
</html>