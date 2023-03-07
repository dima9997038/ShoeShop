<!DOCTYPE html>
<html>
<head>
</head>
    <title>Обувной интернет магазин</title>
<body>
    <h1>Обувной интернет магазин</h1><hr>
    <h4>Товары</h4>
    <#list products as product>
    <div>
        <p><b>${product.category}</b> ${product.price} <a href="/product/${product.id}">Details</a></p>

    </div>
    </#list>
    <hr>
    <h3>Создать новый товар</h3>
    <form action="product/create" method="post">
     Категория <input type="text" name="category"/><br>
     Описание <input type="text" name="description"/><br>
     Производитель <input type="text" name="manufacturer"/><br>
     Цена <input type="number" name="price"/><br>
     Размер <input type="number" name="size"/><br>
        <input type="submit" value="Добавить товар">
    </form>
</body>
</html>
