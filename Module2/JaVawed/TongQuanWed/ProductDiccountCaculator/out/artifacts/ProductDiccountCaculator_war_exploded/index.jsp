<%--
Created by IntelliJ IDEA.
User: Admin
Date: 2/7/2020
Time: 3:52 PM
To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style type="text/css">
  h2 {
    color: blue;
    font-family: verdana;
    font-size: 150%;
  }
  .desc{
    margin-left: 20px;
    padding-bottom: 5px;
    color: red;
    background-color: aquamarine;
  }
  .discount{
    margin-left: 43px;
    padding-bottom: 5px;
    color: red;
    background-color: aquamarine;
  }
  .price{
    margin-left: 91px;
    padding-bottom: 5px;
    color: red;
    background-color: aquamarine;
  }
  .disamount{
    height: 50px;
    weight: 50px;
    background-color: red;
  }
</style>
<body>
<h2>DiscountAmount</h2>
<form action="/display-discount" method="post">
  <label>ProductDescripTion</label>
  <input class="desc" type="text" name="description" placeholder="enter ProductDescription"><br>
  <label>ListPrice</label>
  <input class="price" type="text" name="listprice" placeholder="enter ListPrice"><br>
  <label>DiscountPercent</label>
  <input class="discount" type="text" name="discount" placeholder="enter DiscountPercent"><br>
  <input class="disamount" type="submit" value="DiscountAmount">
</form>
</body>
</html>
