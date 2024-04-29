# Biblioteca do Carangueijo
## Sistema de Biblioteca

Este é um sistema de biblioteca que permite aos clientes e funcionários realizar diversas operações, como emprestar e devolver livros, adicionar e remover livros e clientes, entre outras funcionalidades.

## Funcionalidades

O sistema possui dois menus principais: `Menu Cliente` e `Menu Funcionário`.

### Menu Cliente

No Menu Cliente, os usuários podem realizar as seguintes operações:

1. `Listar Livros Disponíveis`: Exibe a lista de livros disponíveis para empréstimo.
2. `Emprestar Livro`: Permite ao cliente emprestar um livro, informando o ID do cliente e o ID do livro desejado.
3. `Devolver Livro`: Permite ao cliente devolver um livro que estava emprestado, informando o ID do cliente e o ID do livro a ser devolvido.

### Menu Funcionário

No `Menu Funcionário`, os funcionários da biblioteca podem realizar as seguintes operações:

1. `Adicionar Livro`: Permite adicionar um novo livro ao acervo da biblioteca, informando título, autor e ID do livro.
2. `Remover Livro`: Permite remover um livro do acervo da biblioteca, informando o ID do livro a ser removido.
3. `Adicionar Cliente`: Permite adicionar um novo cliente ao sistema, informando nome, endereço, telefone e ID do cliente.
4. `Remover Cliente`: Permite remover um cliente do sistema, informando o ID do cliente a ser removido.
5. `Listar Clientes`: Exibe a lista de todos os clientes cadastrados no sistema.
6. `Listar Livros`: Exibe a lista de todos os livros cadastrados no sistema, juntamente com seu status (disponível ou emprestado).

## Estrutura do Programa

### Main (Classe Principal):
O método main é o ponto de entrada do programa.<br>
Ele inicializa a biblioteca e exibe os menus para cliente e funcionário.<br>
A função `inicializarBiblioteca()` é chamada para adicionar alguns livros à biblioteca.<br>
Os menus são estruturados em um loop do-while que permite ao usuário escolher uma opção até optar por sair (opção 0).<br>

### Classe Pessoa
É uma classe genérica que representa uma pessoa.<br>
Ela serve de superclasse para a Classe `Cliente`.<br>
Essa classe foi criada para caso haja atualizações futuras, o código fique mais legível e a implementação se torne mais simples.<br>
Essa classe traz um método `imprimirDetalhes()` que imprime os dados de uma pessoa (nome, endereço e telefone).<br>

### Classe Cliente:
A classe Cliente herda os atributos e métodos da Classe `Pessoa`.<br>
Além disso, possui atributos específicos para clientes, como um ID de cliente único e uma lista de livros emprestados.<br>
Possui métodos para emprestar e devolver livros.<br>
Sobrescreve o método `imprimirDetalhes()` para imprimir detalhes do cliente, incluindo os livros emprestados.<br>

### Classe Livro:
A classe Livro representa um livro da biblioteca.<br>
Ela é usada para criar novos livros e adicioná-los à biblioteca.<br>
Quando o livro é criado é necessário especificar um ID para facilitar sua busca.<br>
Essa Classe também apresenta um método `imprimirDetalhes()`, que imprime os detalhes do livro, incluindo título, autor e ID.<br>

### Classe Biblioteca:
É a classe com a principal lógica das operações do programa.<br>
É aqui onde ficam aramzenadas a lista de clientes e a lista de livros.<br>
#### Métodos da classe:
1. `adicionarLivro()`: Adiciona um livro à lista de livros da biblioteca. <br>
2. `removerLivro()`: Remove um livro da lista de livros da biblioteca.<br>
3. `adicionarCliente()`: Adiciona um cliente à lista de clientes da biblioteca.<br>
4. `removerCliente()`: Remove um cliente da lista de clientes da biblioteca.<br>
5. `emprestarLivro()`: Permite emprestar um livro para um cliente, atualizando seu status para "Emprestado".<br>
6. `devolverLivro()`: Permite que um cliente devolva um livro, atualizando seu status para "Disponível".<br>
7. `encontrarClientePorID()`: Localiza um cliente na lista de clientes por meio do ID.<br>
8. `encontrarLivroPorID()`: Localiza um livro na lista de livros por meio do ID.<br>

## Interface e Utilização

![Menu Inicial](Imagens/203122.png)

![Menu Cliente](C:\Users\thico\OneDrive\Pictures\Screenshots\Captura de tela 2024-04-29 203145.png)

![Menu Funcionário](C:\Users\thico\OneDrive\Pictures\Screenshots\Captura de tela 2024-04-29 203209.png)
