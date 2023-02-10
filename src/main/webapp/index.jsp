<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Product Discount Calculator" %>
</h1>
<form action="/convert" method="post">
    <label>Product Description: </label>
    <br>
    <input type = "text" name = "ProductDescription" /><br/>
    <label>List Price: </label><br/>
    <input type="number" name="ListPrice" placeholder="Enter your word: "/><br/>
    <label>Discount Percent %: </label><br/>
    <input type="number" name="DiscountPercent" placeholder="Enter your word: "/>
    <input type="submit" value="convert"/>
</form>
</body>
</html>