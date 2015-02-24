<%--
  Created by IntelliJ IDEA.
  User: Владислав
  Date: 27.12.2014
  Time: 4:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
  <meta charset="utf-8"/>
    <title></title>
  <script language="javascript">
    function updateList() {
      var xhr = new XMLHttpRequest();
      var doc = document.getElementById('loadingG').innerHTML;
      xhr.open("POST", "/?updateList=get", true);
      xhr.onreadystatechange = function() {
        if (xhr.readyState < 4){
          document.getElementById('loadingG').innerHTML = '<img src="res/img/loader.gif" > ';
        }else if (xhr.readyState == 4) {
          if(xhr.status == 200) {
            document.getElementById('loadingG').innerHTML = doc;
            var data = JSON.parse(xhr.responseText);
            console.log(data.length);
            var inf = document.getElementById('myView');
            for(var i =0;i<data.length;i++){
              var newOption = document.createElement('option');
              newOption.value = data[i];
              newOption.innerHTML = data[i];
//                        console.log(newOption)
              inf.appendChild(newOption);
            }
          }

        }
      };
      xhr.send(null);
    }
  </script>
</head>
<body>


<div class="control-box">
  <div class="controls">
    <select id="myView" name="performer" class="input-large">
      <option value="0">All Performers</option>

    </select>
  </div>
</div>


</body>
</html>
