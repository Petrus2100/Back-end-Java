<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro</title>
<link rel="stylesheet" href="cadastro.css">
</head>
<body>
<header>

        <section>

            <a href="index.html" class="logo"><img src="imagens/carro.png" width="150"> </a>

            <nav class="navbar">
                <a href="index.html">Pagina inicial</a>
                <a href="index.html" id="menu">Carros</a>
                <a href="#oferta">Ofertas</a>
                <a href="#sobre">Sobre nós</a>
                <a href="#contatos">Contatos</a>
                <a href="pag-seguro.html">Seguros</a>
            </nav>

            <div class="icons">
                <a href=""><img width="30" height="30" src="https://img.icons8.com/office/30/search--v1.png" alt="search--v1" /></a>
            </div>
        </section>
    </header>
<section class="page">
<form action="cadastrar_usuario_controller" method="post">
    <h1>Realizar o cadastro</h1>

    <label for="nome">Nome:</label>
    <input type="text" id="nome" name="nome" required>

    <label for="email">Email:</label>
    <input type="text" id="email" name="email" required>

    <label for="telefone">Telefone:</label>
    <input type="tel" id="telefone" name="telefone" required>

    <label for="senha">Senha:</label>
    <input type="password" id="senha" name="senha" required>

    <a href="login.jsp">Fazer login</a>

    <input type="submit" value="Cadastrar" class="btn" />
</form>
</section>

</body>
</html>