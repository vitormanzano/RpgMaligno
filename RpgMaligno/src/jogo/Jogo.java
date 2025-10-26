package jogo;

import models.classesJogador.Bladerunner;
import models.classesJogador.Cybermancer;
import models.classesJogador.Panzer;
import models.personagem.Personagem;

import java.io.Console;
import java.util.Scanner;

public class Jogo {
    static Scanner scanner = new Scanner(System.in);

    private byte atoAtual;


    public static void iniciarJogo() 
    {
        System.out.println("Bem vindo ao seu Rpg maligno...");

    }
    public static void iniciarIntroducao(){
        Historia.printIntroducao();
    }

    public static void escolherClasse() throws Exception {
        while (true) {
            System.out.println("\n=== ESCOLHA SUA CLASSE ===");
            System.out.println("1 - Bladerunner");
            System.out.println("2 - Cybermancer");
            System.out.println("3 - Panzer");
            System.out.println("0 - Sair");

            System.out.print("Opção: ");
            String opcao = scanner.nextLine();

            Jogo.clearConsole();

            System.out.print("Digite seu nome: ");
            String nome = scanner.nextLine();

            Jogo.clearConsole();
            switch (opcao) {
                case "1" -> mostrarClasse(new Bladerunner(nome));
                case "2" -> mostrarClasse(new Cybermancer(nome));
                case "3" -> mostrarClasse(new Panzer(nome));
                case "0" -> {
                    System.out.println("Saindo da seleção de classes...");
                    return;
                }
                default -> System.out.println("❌ Opção inválida! Tente novamente.");
            }
        }
    }

    private static void mostrarClasse(Personagem personagem) {
        while (true) {
            Jogo.clearConsole();
            System.out.println("\n=== INFORMAÇÕES DA CLASSE ===");
            System.out.println(personagem); // usa o toString() da classe Personagem
            System.out.println("\nInventário:");
            System.out.println(personagem.getInventario()); // usa o toString() do Inventario

            System.out.println("\nO que deseja fazer?");
            System.out.println("1 - Escolher esta classe");
            System.out.println("2 - Voltar para o menu");

            System.out.print("Opção: ");
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1" -> {
                    System.out.println("✅ Classe escolhida com sucesso!");
                    return;
                }
                case "2" -> {
                    System.out.println("↩ Voltando para o menu de seleção...");
                    return;
                }
                default -> System.out.println("❌ Opção inválida! Tente novamente.");
            }
        }
    }

    public static void pressAnythingToContinue() {
        System.out.println("Pressione qualquer coisa para continuar...");
        scanner.nextLine();
    }

    public static void clearConsole(){
        for(int i = 0; i < 100; i++){
            System.out.println();
        }
    }
}
