Biblioteca do carangueijo
# Sistema de Biblioteca

Este é um sistema de biblioteca que permite aos usuários realizar diversas operações, como emprestar e devolver livros, adicionar e remover livros e clientes, entre outras funcionalidades.

## Funcionalidades

O sistema possui dois menus principais: Menu Cliente e Menu Funcionário.

### Menu Cliente

No Menu Cliente, os usuários podem realizar as seguintes operações:

1. **Listar Livros Disponíveis:** Exibe a lista de livros disponíveis para empréstimo.
2. **Emprestar Livro:** Permite ao cliente emprestar um livro, informando o ID do cliente e o ID do livro desejado.
3. **Devolver Livro:** Permite ao cliente devolver um livro que estava emprestado, informando o ID do cliente e o ID do livro a ser devolvido.
0. **Voltar:** Retorna ao menu principal.

### Menu Funcionário

No Menu Funcionário, os funcionários da biblioteca podem realizar as seguintes operações:

1. **Adicionar Livro:** Permite adicionar um novo livro ao acervo da biblioteca, informando título, autor e ID do livro.
2. **Remover Livro:** Permite remover um livro do acervo da biblioteca, informando o ID do livro a ser removido.
3. **Adicionar Cliente:** Permite adicionar um novo cliente ao sistema, informando nome, endereço, telefone e ID do cliente.
4. **Remover Cliente:** Permite remover um cliente do sistema, informando o ID do cliente a ser removido.
5. **Listar Clientes:** Exibe a lista de todos os clientes cadastrados no sistema.
6. **Listar Livros:** Exibe a lista de todos os livros cadastrados no sistema, juntamente com seu status (disponível ou emprestado).
0. **Voltar:** Retorna ao menu principal.

## Estrutura do Código

O código está dividido em três classes principais:

1. **Main:** Classe principal que contém o método `main` e os menus para cliente e funcionário.
2. **Biblioteca:** Classe que representa a biblioteca, contendo métodos para adicionar, remover livros e clientes, emprestar e devolver livros, e localizar clientes e livros por ID.
3. **Cliente:** Classe que representa um cliente da biblioteca, com métodos para emprestar e devolver livros, além de imprimir detalhes do cliente e dos livros emprestados.

Além disso, há outras classes auxiliares como `Livro`, `Pessoa` e `Conta` (não utilizado no sistema de biblioteca).

## Utilização

Para utilizar o sistema, execute o método `main` da classe `Main`. Isso iniciará o sistema e exibirá os menus para cliente e funcionário, onde as operações podem ser realizadas conforme descrito acima.


