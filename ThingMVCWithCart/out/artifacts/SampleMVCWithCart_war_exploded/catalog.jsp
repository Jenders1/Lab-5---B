<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="us.Jack.model.Item" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Things and Stuff - Catalog</title>
    <link rel="stylesheet" href="./css/theStyle.css">
</head>
<body>
<div id="container">
    <div id="rcornerstop">
        <h2>Things for sale</h2>
        <div class="topnav">
            <a href="index.jsp">Home</a>
            <a href="cat.go">Catalog</a>
            <a href="cart.go">Shopping Cart</a>
        </div>
        <br>
    </div>
    <div id="rcorners">
        <h3>Catalog</h3>
        <form action="cartplace.go">
            <table>
                <%
                    List recs = (List) request.getAttribute("catalog");
                    Iterator it = recs.iterator();
                    while (it.hasNext()) {
                        Item item = (Item) it.next();
                        out.print("<tr><td><img src='" + item.getImage() + "' height='100'></td><td>" + item.getName() + "</td><td>$" + item.getPrice() + "</td><td>Add to Cart<input type='checkbox' name='cartItem' value=" + item.getProductNumer()+ "></td></tr>");
                    }
                %>
            </table>
            <input type="submit" value="Purchase">
        </form>
    </div>
</div>
</body>
</html>
