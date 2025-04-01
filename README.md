Parte 1 - Configuração do Ambiente de Desenvolvimento

Exercício 1 Instalando e configurando o ambiente Java

Enunciado: 

Você foi contratado como desenvolvedor júnior em uma startup e precisa configurar seu ambiente de desenvolvimento.

Instale o JDK mais recente e configure as variáveis de ambiente.
Instale a IDE IntelliJ IDEA e crie um projeto Java chamado MinhaPrimeiraApp.
Dentro do projeto, crie uma classe chamada OlaMundo e escreva um programa que imprime "Olá, meu nome é [Seu Nome] e estou aprendendo Java!".
Faça o build do projeto e execute o programa pelo console da IDE.
Entrega:

Capture prints de tela mostrando:
O terminal com o comando java -version.
A configuração do JDK na IntelliJ IDEA.
A execução do programa no console da IDE.
Parte 2 - Conceitos Básicos da Linguagem

Exercício 2 Validação de Senha Segura

Contexto: Sua empresa precisa de um sistema que valide senhas fortes antes do cadastro de novos usuários.

Enunciado:
Crie um programa que:

Solicite ao usuário seu nome e uma senha.
A senha deve:
Ter no mínimo 8 caracteres.
Conter pelo menos uma letra maiúscula, um número e um caractere especial (@, #, $, etc.).
Caso a senha seja inválida, o programa deve informar o erro específico e solicitar uma nova tentativa.
Exercício 3 Calculadora de Impostos

Contexto: Você precisa calcular o imposto de renda de uma pessoa com base no seu salário anual.

Enunciado:

Crie um programa que:

Peça ao usuário seu nome e seu salário mensal.
Aplique a seguinte tabela:
Até R$ 22.847,76 → Isento
De R$ 22.847,77 a R$ 33.919,80 → 7,5%
De R$ 33.919,81 a R$ 45.012,60 → 15%
Acima de R$ 45.012,61 → 27,5%
O programa deve calcular e exibir o valor do imposto e o salário líquido.
Exercício 4 Simulador de Empréstimo Bancário

Contexto: Um banco deseja automatizar a simulação de empréstimos para clientes.

Enunciado:
Solicite o nome do cliente e o valor do empréstimo.
✔ Pergunte em quantas parcelas ele deseja pagar (mínimo 6, máximo 48).
✔ Calcule o juros mensal fixo de 3% e mostre:

O valor total pago.
O valor da parcela mensal.
Exercício 5 Criando um Programa CGI em Java

Contexto:Antes do surgimento de tecnologias como Servlets e frameworks web modernos, os servidores HTTP utilizavam o CGI (Common Gateway Interface) para gerar conteúdo dinâmico. CGI permite que programas externos sejam executados pelo servidor e retornem uma resposta HTTP.

Uma resposta HTTP gerada via CGI deve conter headers obrigatórios, seguidos pelo conteúdo da resposta. O header mais básico que deve ser incluído é o Content-Type, que informa ao navegador qual é o formato da resposta.

Enunciado:

Crie um programa em Java que simule um script CGI, imprimindo os headers HTTP necessários e uma saudação personalizada no corpo da resposta. O programa não precisa rodar em um servidor, apenas ser executado diretamente na linha de comando.

Requisitos do programa:

O programa deve imprimir os headers necessários para uma resposta HTTP válida.
O header obrigatório Content-Type: text/html deve ser incluído.
Deve haver uma linha em branco entre os headers e o corpo da resposta.
No corpo da resposta, o programa deve exibir a mensagem:
Olá, Terráqueos!
O código deve ser executado via linha de comando e imprimir a resposta simulando a saída de um CGI.
Saída esperada do programa (quando executado na linha de comando):

Content-Type: text/html

<html>
<head><title>Saudação CGI</title></head>
<body>
<h1>Olá, Terráqueos!</h1>
</body>
</html>
Dicas para Implementação:

Utilize System.out.println() para imprimir os headers HTTP antes de qualquer outro conteúdo.
Lembre-se de incluir uma linha em branco entre os headers e o conteúdo da página.
O corpo da resposta deve estar formatado em HTML para que o navegador consiga interpretá-lo corretamente.
Parte 3 - Classes e Objetos

Exercício 6 Cadastro de Veículos

Contexto: Você está desenvolvendo um sistema para gerenciar veículos em uma locadora.

Enunciado:

Crie uma classe Veiculo com os seguintes atributos:

Placa (String)
Modelo (String)
Ano de fabricação (int)
Quilometragem (double)
Implemente os seguintes métodos:

exibirDetalhes() - Exibe os dados do veículo.
registrarViagem(double km) - Adiciona km ao total.
No main(), crie dois veículos com dados fictícios e registre viagens para testar o sistema.
Exercício 7 Gerenciador de Alunos

Contexto: Você está criando um sistema acadêmico para armazenar notas dos alunos.

Enunciado: 

Crie a classe Aluno com os atributos: nome, matrícula e três notas. Implemente os métodos:

calcularMedia() → Retorna a média das notas.
verificarAprovacao() → Exibe se o aluno foi aprovado (média >= 7) ou reprovado.
No main(), peça os dados do aluno e exiba sua situação final.
Parte 4 - Orientação a Objetos Avançada

Exercício 8 Sistema de Funcionários

Contexto: Uma empresa precisa de um sistema para calcular salários de diferentes tipos de funcionários.

Enunciado:

Crie a classe Funcionario com: nome, salário base e crie duas subclasses:

Gerente: Salário recebe um bônus de 20%.
Estagiario: Salário tem um desconto de 10%.
No main(), crie um gerente e um estagiário, e exiba os salários finais.

Exercício 9 Conta Bancária com Encapsulamento

Contexto: Um banco quer proteger os dados das contas dos clientes.

Enunciado:

Crie a classe ContaBancaria com:

titular (String)
saldo (double, privado)
Métodos:

depositar(double valor)
sacar(double valor) (somente se houver saldo suficiente)
exibirSaldo() 
Teste no main() criando uma conta e realizando operações.

Parte 5 - Manipulação de Arquivos e Estruturas Avançadas

Exercício 10 Registro de Compras em Arquivo

Contexto: Uma loja quer armazenar registros de compras.

Enunciado: 

Peça ao usuário para cadastrar 3 compras com: produto, quantidade e preço unitário.

Salve os dados em um arquivo compras.txt.
Leia o arquivo e exiba as compras registradas.
Exercício 11 Simulação de Loteria

Contexto: Você foi contratado para desenvolver um jogo de loteria simples.

Enunciado:

Gere 6 números aleatórios entre 1 e 60.
Peça ao usuário para inserir 6 números.
Compare os números e informe quantos acertos ele teve.
Exercício 12 Sistema de Chat Simples com Arrays

Contexto: Você está desenvolvendo um sistema simples de troca de mensagens que será utilizado em um terminal de linha de comando. Dois usuários poderão enviar mensagens alternadamente e visualizar as mensagens enviadas. O objetivo é permitir a comunicação entre os usuários de forma interativa, sem interface gráfica.

Enunciado: 

Crie um programa em Java que permita que dois usuários troquem mensagens alternadamente através da linha de comando.

Regras do Programa:

O programa deve iniciar solicitando os nomes dos dois usuários.
Cada usuário poderá enviar até 5 mensagens cada (total de 10 mensagens no sistema).
As mensagens devem ser armazenadas em um Array de Strings.
O envio das mensagens deve ser feito alternadamente, ou seja, um usuário envia, depois o outro.
Após as 5 mensagens de cada usuário, o programa deve exibir todas as mensagens trocadas e encerrar com uma mensagem de despedida.
Fluxo esperado da execução:

Solicitação dos nomes dos usuários:

Digite o nome do primeiro usuário: Alice 
Digite o nome do segundo usuário: Bob

Troca de mensagens alternada na linha de comando:
Alice, digite sua mensagem: Olá Bob, como você está? 
Bob, digite sua mensagem: Oi Alice! Estou bem, e você? 
Alice, digite sua mensagem: Estou ótima, obrigada por perguntar.
Bob, digite
        sua mensagem: Que bom! O que tem feito ultimamente?
... (continua até 5 mensagens por usuário)


Exibição do histórico de mensagens:

===== Histórico de Mensagens =====
Alice: Olá Bob, como você está? 
Bob: Oi Alice! Estou bem, e você? 
Alice: Estou ótima, obrigada por perguntar. 
Bob: Que bom! O que tem feito ultimamente? 
…

Mensagem final antes de encerrar o programa:
Obrigado por utilizarem o sistema! Boa sorte para vocês! 🚀
Considerações:

O programa solicita os nomes dos usuários corretamente.
As mensagens são armazenadas e exibidas corretamente.
O programa alterna corretamente entre os usuários a cada mensagem.
O programa finaliza após 10 mensagens trocadas, exibindo o histórico e a mensagem de despedida.
Dicas para Implementação:

Utilize um array de Strings de tamanho 10 para armazenar as mensagens.
Use um loop para alternar os envios entre os usuários.
Utilize a classe Scanner para capturar as mensagens digitadas.
Certifique-se de exibir corretamente as mensagens ao final da execução.
