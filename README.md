# Biblioteca do carangueijo
## Sistema de Biblioteca

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

### Main (Classe Principal):
O método main é o ponto de entrada do programa. Ele inicializa a biblioteca e exibe os menus para cliente e funcionário.
A função inicializarBiblioteca é chamada para adicionar alguns livros à biblioteca.
Os menus são estruturados em um loop do-while que permite ao usuário escolher uma opção até optar por sair (opção 0).

### Biblioteca (Classe que representa a biblioteca):
Mantém listas de livros e clientes.
#### Métodos principais:
#### adicionarLivro:
Adiciona um livro à lista de livros da biblioteca.
#### removerLivro:
Remove um livro da lista de livros da biblioteca.
#### adicionarCliente:
Adiciona um cliente à lista de clientes da biblioteca.
#### removerCliente:
Remove um cliente da lista de clientes da biblioteca.
#### emprestarLivro:
Permite emprestar um livro para um cliente, atualizando seu status para "Emprestado".
#### devolverLivro: 
Permite que um cliente devolva um livro, atualizando seu status para "Disponível".
#### encontrarClientePorID:
Localiza um cliente na lista de clientes por meio do ID.
#### encontrarLivroPorID:
Localiza um livro na lista de livros por meio do ID.

### Cliente (Classe que representa um cliente):
Mantém informações sobre o cliente, como nome, endereço, telefone e ID.
Possui métodos para emprestar e devolver livros.
Sobrescreve o método imprimirDetalhes para imprimir detalhes do cliente, incluindo os livros emprestados.
## Utilização

Para utilizar o sistema, execute o método `main` da classe `Main`. Isso iniciará o sistema e exibirá os menus para cliente e funcionário, onde as operações podem ser realizadas conforme descrito acima.


