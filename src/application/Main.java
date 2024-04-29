package application;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Biblioteca;
import entities.Cliente;
import entities.Conta;
import entities.Livro;

public class Main {
    public static void main(String[] args) {
    	
    	Livro livro1 = new Livro("Os Códigos do Milhão", "Pablo Marçal", 1, true);
        Livro livro2 = new Livro("O homem mais rico da Babilônia", "George Samuel Clason", 2, false);
        Livro livro3 = new Livro("Do Mil ao Milhão. Sem Cortar o Cafezinho", "Thiago Nigro", 3, true);
        Livro livro4 = new Livro("A arte da negociação", "Donald J. Trump", 4, false);

        // info dos livros
        System.out.println("Informações do Livro 1:");
        livro1.exibirInformacoes();

        System.out.println("\nInformações do Livro 2:");
        livro2.exibirInformacoes();

        System.out.println("\nInformações do Livro 3:");
        livro3.exibirInformacoes();

        System.out.println("\nInformações do Livro 4:");
        livro4.exibirInformacoes();

        // botando livro 2 para disponivel
        livro2.setStatus(true);
        System.out.println("\nStatus do Livro 2 atualizado para disponível.");
        System.out.println("Novo status do Livro 2: " + (livro2.getStatus() ? "Disponível" : "Indisponível"));
      

    	Scanner scan = new Scanner(System.in);
    	Conta conta = new Conta();
    	Biblioteca biblioteca = new Biblioteca();

    	boolean encerrarPrograma = false;
    	while (!encerrarPrograma) {
    	System.out.println("BEM VINDO A BIBLIOTECA DO CARANGUEJO\n");
        System.out.print("\n1- Sou funcionario \n2- Sou cliente \n0- Encerrar programa \nEscolha uma opção: ");
            int opcao1 = scan.nextInt();
            switch (opcao1) {
                case 0:
                    encerrarPrograma = true;
                    break;
                case 1:
                    System.out.println("\n1- Adicionar livro \n2- Remover livro \n3- Adicionar cliente \n4- Remover cliente ");
                    int opcao3 = scan.nextInt();
                    switch (opcao3) {
                        case 1:
                            System.out.println("Digite o titulo do livro: ");
                            scan.nextLine();
                            String titulo = scan.nextLine();
                            System.out.println("digite o autor do livro: ");
                            String autor = scan.nextLine();
                            System.out.println("digite o id do livro: ");
                            int idLivro = scan.nextInt();
                            Livro livro = new Livro(titulo, autor, idLivro, false);
                            biblioteca.adicionarLivro(livro);
                            break;
                        case 2:
                            System.out.println("livros disponiveis:");
                            ArrayList<String> livrosDisponiveis = biblioteca.livrosDisponiveis();
                            for (String titulos : livrosDisponiveis) {
                                System.out.println("- " + titulos);
                            }
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("opção esta invalida. verifique e tente novamente");
                    }
                    break;
                    
                case 2:
                    boolean voltarMenuPrincipal = false;
                    while (!voltarMenuPrincipal) {
                        System.out.println("bem vindo a parte do cliente:");
                        System.out.print("1- login \n2- criar conta \n3- voltar \nescolha uma opção:");
                        int opcao2 = scan.nextInt();
                        switch (opcao2) {
                            case 1:
                                fazerLogin(scan, conta);
                                break;
                            case 2:
                                criarNovoLogin(scan, conta);
                                break;
                            case 3:
                                voltarMenuPrincipal = true;
                                break;
                            default:
                                System.out.println("opção esta invalida. verifique e tente novamente");
                        }
                    }
                    break;
                default:
                    System.out.println("opção esta invalida. verifique e tente novamente");
            }
        }
    }

    private static void fazerLogin(Scanner scan, Conta conta) {
        System.out.print("Usuário: ");
        scan.nextLine();
        String usuario = scan.nextLine();
        System.out.print("Senha: ");
        String senha = scan.nextLine();
        Cliente usuarioLogado = conta.fazerLogin(usuario, senha);
        if (usuarioLogado != null) {
            exibirOperacoesCliente(scan, usuarioLogado, conta);
        } else {
            System.out.println("Usuário ou senha incorretos. Verifique e Tente novamente");
        }
    }

    private static void exibirOperacoesCliente(Scanner scan, Cliente usuarioLogado, Conta conta) {

    }
    private static void criarNovoLogin(Scanner scan, Conta conta) {
        System.out.print("Digite o novo nome de usuário: ");
        scan.nextLine();
        String novoUsuario = scan.nextLine();
        System.out.print("Digite a nova senha: ");
        String novaSenha = scan.nextLine();
        if (conta.adicionarUsuario(novoUsuario, novaSenha)) {
            System.out.println("Sua conta foi criada com sucesso");
        } else {
            System.out.println("Esse Usuário já existe. Escolha outro nome de usuário.");
        }
    }
}
