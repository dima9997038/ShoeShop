<!DOCTYPE html>
<html>
<head>
</head>
    <title>Обувной интернет магазин</title>
<body>
    <h1>Обувной интернет магазин</h1><hr>
    <h4>Товары</h4>
    <form action="/" method="get">
        Поиск по категории:  <input type="text" name="category"><br>
        <input type="submit" value="Поиск">
    </form>
    <#list products as product>
    <div>
        <p><b>${product.category}&nbsp;</b>${product.description} &nbsp; Производитель:  ${product.manufacturer} &nbsp; Цена:  ${product.price} руб. &nbsp; Размер:  ${product.size} <a href="/product/${product.id}">Подробно</a></p>

    </div>
    </#list>
    <hr>
    <h3>Создать новый товар</h3>
    <form action="product/create" method="post">
     Категория <input type="text" name="category"/><br>
     Описание <input type="text" name="description"/><br>
     Производитель <input type="text" name="manufacturer"/><br>
     Цена <input type="number step=0.01" name="price"/><br>
     Размер <input type="number step=0.5" name="size"/><br>
        <input type="submit" value="Добавить товар">
    </form>
</body>
</html>
