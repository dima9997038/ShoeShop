<!DOCTYPE html>
<html>
<head>
</head>
<title>Обувной интернет магазин</title>
<body>
<h1>Обувной интернет магазин</h1><hr>
<h4>Информация о товаре</h4>
<b>Категория  </b>${product.category}<br>
<b>Описание  </b>${product.description}<br>
<b>Производитель  </b>${product.manufacturer}<br>
<b>Цена  </b>${product.price}<br>
<b>Размер  </b>${product.size}<br>
<hr>
<h3>Удалить товар</h3>
<form action="delete/${product.id}" method="post">
    <input type="submit" value="Удалить товар">
</form>
</body>
</html>
