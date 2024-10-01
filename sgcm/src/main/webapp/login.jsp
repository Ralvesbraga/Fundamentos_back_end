<%@page pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, user-scalable=no">
        <link rel="icon" href="imagens/logo_azul.png">
        <title>SGCM - Login</title>
        <link rel="stylesheet" href="./css/estilo.css">
        <script src="./js/script.js" defer></script>
    </head>
    <body>
        <header>
            <div id="logo_header">
                <img src="imagens/logo_branco.png" alt="Logo SGCM">
                <p>SGCM - Sistema de Gerenciamento de Consultas Médicas</p>
            </div>
        </header>
        <main>
            <form method="post" action="login">
                <div>
                    <label for="email">Email</label>
                    <input/ type="text" name="email" id="email">
                    <label for="senha">Senha</label>
                    <input for="senha" name="senha" id="senha" type="password"/>
                    <input class="botao_verde" type="submit" name="submit" value="Login"/>
                </div>
            </form>
        </main>
        <footer>
            <p>Telefone para contato: <span><a href="tel:+556832233030">+556832233030</a></span> | Email: <a
                href="mailto:suporte.sgcm@ufac.br">suporte.sgcm@ufac.br</a></p>
        </footer>
    </body>
</html>
