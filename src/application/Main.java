package application;

import entities.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Conta conta = new Conta();
        Biblioteca biblioteca = new Biblioteca();

        boolean encerrarPrograma = false;
        while (!encerrarPrograma) {
            // precisa implementar coisas a mais
            System.out.println("BEM VINDO A BIBLIOTECA (pode adicionar algum nome pra biblioteca): ");
            System.out.print("1- sou funcionario \n2- sou cliente \n0- encerrar programa \nescolha uma opção: ");
            int opcao1 = scan.nextInt();
            switch (opcao1) {
                case 0:
                    encerrarPrograma = true;
                    break;
                case 1:
                    //referente ao funcionario func a adicionar
                    System.out.println("1- adicionar livro \n2- remover livro \n 3- adicionar cliente \n4- remover cliente \n5- emprestar livro \n6- devolver livro");
                    int opcao3 = scan.nextInt();
                    switch (opcao3) {
                        case 1:

                            System.out.println("digite o titulo do livro: ");
                            scan.nextLine();
                            String titulo = scan.nextLine();
                            System.out.println("digite o autor do livro: ");
                            String autor = scan.nextLine();
                            System.out.println("digite o id do livro: ");
                            int idLivro = scan.nextInt();

                            boolean possuiLivro = false;
                            boolean entradaValida = false;

                            while (!entradaValida) {
                                System.out.println("digite o status do livro: (possui / nao possui)");
                                scan.nextLine(); // Limpar o buffer
                                String status = scan.nextLine();

                                if (status.equals("possui")) {
                                    possuiLivro = true;
                                    entradaValida = true;
                                } else if (status.equals("nao possui")) {
                                    possuiLivro = false;
                                    entradaValida = true;
                                } else {
                                    System.out.println("Opção de status inválida. Digite 'possui' ou 'nao possui'.");
                                }
                            }

                            Livro livro = new Livro(titulo, autor, idLivro, possuiLivro);
                            biblioteca.adicionarLivro(livro);
                            // Aqui você pode fazer o que precisar com o objeto "livro"
                            break;
                        case 2:
                            System.out.println("livros disponiveis:");
                            ArrayList<String> livrosDisponiveis = biblioteca.livrosDisponiveis();
                            for (String titulos : livrosDisponiveis) {
                                System.out.println("- " + titulo);
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
                    //adicionei algumas funcionalidades falta a dicionar a parte de menu de opcoes
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
