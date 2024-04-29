package application;

import java.util.Scanner;

import entities.Biblioteca;
import entities.Cliente;
import entities.Livro;


public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        inicializarBiblioteca(biblioteca);

        Scanner scanner = new Scanner(System.in);

        System.out.println("BEM-VINDO(A) A BIBLIOTECA DO CARANGUEIJO!!");

        int opcao;
        do {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Menu Cliente");
            System.out.println("2. Menu Funcionário");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    menuCliente(biblioteca);
                    break;
                case 2:
                    menuFuncionario(biblioteca);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    // Método para inicializar a biblioteca com 4 livros
    public static void inicializarBiblioteca(Biblioteca biblioteca) {
        biblioteca.adicionarLivro(new Livro("Os Códigos do Milhão", "Pablo Marçal", 1));
        biblioteca.adicionarLivro(new Livro("O homem mais rico da Babilônia", "George Samuel Clason", 2));
        biblioteca.adicionarLivro(new Livro("Do Mil ao Milhão. Sem Cortar o Cafezinho", "Thiago Nigro", 3));
        biblioteca.adicionarLivro(new Livro("A arte da negociação", "Donald J. Trump", 4));
    }

    // Método para o menu do cliente
    public static void menuCliente(Biblioteca biblioteca) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n=== Menu Cliente ===");
        System.out.println("1. Lista de Livros Disponíveis");
        System.out.println("2. Pegar livro emprestado");
        System.out.println("3. Devolver Livro");
        System.out.println("0. Voltar");

        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("\nLivros Disponíveis:");
                for (Livro livro : biblioteca.getListaLivros()) {
                    if (livro.getStatus().equals("Disponível")) {
                        livro.imprimirDetalhes();
                    }
                }
                break;
            case 2:
                System.out.print("Digite o ID do Cliente: ");
                int idClienteEmprestimo = scanner.nextInt();
                Cliente clienteEmprestimo = biblioteca.encontrarClientePorID(idClienteEmprestimo);
                if (clienteEmprestimo != null) {
                    System.out.print("Digite o ID do Livro que deseja pegar emprestado: ");
                    int idLivroEmprestimo = scanner.nextInt();
                    Livro livroEmprestimo = biblioteca.encontrarLivroPorID(idLivroEmprestimo);
                    if (livroEmprestimo != null) {
                        biblioteca.emprestarLivro(clienteEmprestimo, livroEmprestimo);
                    } else {
                        System.out.println("Livro não encontrado.");
                    }
                } else {
                    System.out.println("Cliente não encontrado.");
                }
                break;
            case 3:
                System.out.print("Digite o ID do Cliente: ");
                int idClienteDevolucao = scanner.nextInt();
                Cliente clienteDevolucao = biblioteca.encontrarClientePorID(idClienteDevolucao);
                if (clienteDevolucao != null) {
                    System.out.print("Digite o ID do Livro que deseja devolver: ");
                    int idLivroDevolucao = scanner.nextInt();
                    Livro livroDevolucao = biblioteca.encontrarLivroPorID(idLivroDevolucao);
                    if (livroDevolucao != null) {
                        biblioteca.devolverLivro(clienteDevolucao, livroDevolucao);
                    } else {
                        System.out.println("Livro não encontrado.");
                    }
                } else {
                    System.out.println("Cliente não encontrado.");
                }
                break;
            case 0:
                System.out.println("Voltando ao menu principal...");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    // Método para o menu do funcionário
    public static void menuFuncionario(Biblioteca biblioteca) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n=== Menu Funcionário ===");
        System.out.println("1. Adicionar Livro");
        System.out.println("2. Remover Livro");
        System.out.println("3. Adicionar Cliente");
        System.out.println("4. Remover Cliente");
        System.out.println("5. Lista de Clientes");
        System.out.println("6. Lista dos Livros");
        System.out.println("0. Voltar");

        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                // Lógica para adicionar livro
                System.out.print("Digite o título do livro: ");
                String tituloLivro = scanner.nextLine();
                System.out.print("Digite o autor do livro: ");
                scanner.nextLine();
                String autorLivro = scanner.nextLine();
                System.out.print("Digite o ID do livro: ");
                int idLivro = scanner.nextInt();
                biblioteca.adicionarLivro(new Livro(tituloLivro, autorLivro, idLivro));
                System.out.println("Livro adicionado com sucesso!");
                break;
            case 2:
                // Lógica para remover livro
                System.out.print("Digite o ID do livro que deseja remover: ");
                int idLivroRemover = scanner.nextInt();
                Livro livroRemover = biblioteca.encontrarLivroPorID(idLivroRemover);
                if (livroRemover != null) {
                    biblioteca.removerLivro(livroRemover);
                    System.out.println("Livro removido com sucesso!");
                } else {
                    System.out.println("Livro não encontrado.");
                }
                break;
            case 3:
                // Lógica para adicionar cliente
                System.out.print("Digite o nome do cliente: ");
                String nomeCliente = scanner.next();
                System.out.print("Digite o endereço do cliente: ");
                scanner.nextLine();
                String enderecoCliente = scanner.nextLine();
                System.out.print("Digite o telefone do cliente: ");
                String telefoneCliente = scanner.next();
                System.out.print("Digite o ID do cliente: ");
                int idCliente = scanner.nextInt();
                biblioteca.adicionarCliente(new Cliente(nomeCliente, enderecoCliente, telefoneCliente, idCliente));
                System.out.println("Cliente adicionado com sucesso!");
                break;
            case 4:
                // Lógica para remover cliente
                System.out.print("Digite o ID do cliente que deseja remover: ");
                int idClienteRemover = scanner.nextInt();
                Cliente clienteRemover = biblioteca.encontrarClientePorID(idClienteRemover);
                if (clienteRemover != null) {
                    biblioteca.removerCliente(clienteRemover);
                    System.out.println("Cliente removido com sucesso!");
                } else {
                    System.out.println("Cliente não encontrado.");
                }
                break;
            case 5:
                // Listar todos os clientes
                System.out.println("\nLista de Clientes:");
                for (Cliente cliente : biblioteca.getListaClientes()) {
                    cliente.imprimirDetalhes();
                    System.out.println();
                }
                break;
            case 6:
                // Imprimir todos os livros
                System.out.println("\nTodos os Livros:");
                for (Livro livro : biblioteca.getListaLivros()) {
                    livro.imprimirDetalhes();
                    System.out.println("Status: " + livro.getStatus());
                }
                break;
            case 0:
                System.out.println("Voltando ao menu principal...");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}
