<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8" isELIgnored="false"%>
  
<%@page isELIgnored="false" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
  
<html>
<body>
 
<form action="upload" method="post" enctype="multipart/form-data">
 
  上传文件 : <input type="file" name="doc" /> <br>
  <input type="submit" value="上传">
</form>
 
</body>
</html>