package jogo;

import Itens.ModuloCamuflagem;
import models.Inimigo;
import models.Inimigos.Guarda;
import models.Inimigos.GuardaDanificado;
import models.Inimigos.Marginal;
import models.Inventario;
import models.classesJogador.Bladerunner;
import models.classesJogador.Cybermancer;
import models.classesJogador.Panzer;
import models.personagem.Personagem;

import java.io.Console;
import java.util.Scanner;

import static jogo.Historia.*;

public class Jogo {
    static Scanner scanner = new Scanner(System.in);

    private byte atoAtual;
    private static Personagem personagem;


    public static void iniciarJogo() throws Exception {
        System.out.println(" Bem-vindo ao");
        System.out.println("                             .__           .__          __   \n" +
                "  ____   ____  ____   ____   |  |__   ____ |__| _______/  |_ \n" +
                " /    \\_/ __ \\/  _ \\ /    \\  |  |  \\_/ __ \\|  |/  ___/\\   __\\\n" +
                "|   |  \\  ___(  <_> )   |  \\ |   Y  \\  ___/|  |\\___ \\  |  |  \n" +
                "|___|  /\\___  >____/|___|  / |___|  /\\___  >__/____  > |__|  \n" +
                "     \\/     \\/           \\/       \\/     \\/        \\/        ");
        System.out.println("---------------------------------------------------------------");
        iniciarIntroducao();
        printClasses();
        escolherClasse();
        printAto1();
        aceitarTrampo();
        escolha1();
        printPreArmazem();
        escolhaArmazem();
        printAto2();
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
            break;
        }
    }

    public static void aceitarTrampo() throws Exception {
        while (true) {
            System.out.println("\n=== ACEITAR TRABALHO ===");
            System.out.println("1 - Aceitar");
            System.out.println("2 - Rejeitar");
            System.out.println("0 - Sair");

            System.out.print("Opção: ");
            String opcao = scanner.nextLine();

            Jogo.clearConsole();

            Jogo.clearConsole();
            switch (opcao) {
                case "1" -> Historia.aceitou();
                case "2" -> {
                    Historia.rejeitou();
                    Thread.sleep(2000);
                    System.exit(0);
                }
                case "0" -> {
                    System.out.println("Saindo do menu...");
                    return;
                }
                default -> System.out.println("❌ Opção inválida! Tente novamente.");
            }
            break;
        }
    }

    public static void escolha1() throws Exception {
        while (true) {
            System.out.println("\n=== ESCOLHA SEU CAMINHO ===");
            System.out.println("1 - Explorar beco");
            System.out.println("2 - Ir para o armazém");
            System.out.println("0 - Sair");

            System.out.print("Opção: ");
            String opcao = scanner.nextLine();

            Jogo.clearConsole();

            Jogo.clearConsole();
            switch (opcao) {
                case "1" -> {
                    Historia.beco1();
                    escolhaBeco();
                }
                case "2" -> Historia.printPreArmazem();

                case "0" -> {
                    System.out.println("Saindo do menu...");
                    return;
                }
                default -> System.out.println("❌ Opção inválida! Tente novamente.");
            }
            break;
        }
    }

    public static void escolhaBeco() throws Exception {
        while (true) {
            System.out.println("\n======================");
            System.out.println("1 - “Não enche o saco”");
            System.out.println("2 - “Pô mano, me ofereceram um trampo aí...carga da Monolith, tá sabendo de algo?”");
            System.out.println("0 - Sair");

            System.out.print("Opção: ");
            String opcao = scanner.nextLine();

            Jogo.clearConsole();

            Jogo.clearConsole();
            switch (opcao) {
                case "1" -> {
                    Historia.falaBeco1();
                    combate(new Marginal());
                }
                case "2" -> {
                    Historia.falaBeco2();
                    personagem.getInventario().adicionarItem(new ModuloCamuflagem());
                }

                case "0" -> {
                    System.out.println("Saindo do menu...");
                    return;
                }
                default -> System.out.println("❌ Opção inválida! Tente novamente.");
            }
            break;
        }
    }

    public static void escolhaArmazem() throws Exception {
        while (true) {
            System.out.println("\n=== Escolha como vai entrar ===");
            System.out.println("1 - “Tentar hacker o portão");
            System.out.println("2 - “Invadir à força");
            System.out.println("3 - “Entrar furtivamente");
            System.out.println("0 - Sair");

            System.out.print("Opção: ");
            String opcao = scanner.nextLine();

            Jogo.clearConsole();

            Jogo.clearConsole();
            switch (opcao) {
                case "1" -> {
                    Historia.printOpt1Start();
                    //ROLAR O DADO, SE FALHAR O HACKEAMENTO, COMBATE, SE NÃO, O PLAYER ENTRA DE BOA
                    combate(new Guarda());
                }
                case "2" -> {
                    Historia.printOpt2Start();
                    combate(new Guarda());
                    Historia.printOpt2End();
                }
                case "3" -> {
                    Historia.printOpt3Start();
                    combate(new GuardaDanificado());
                    Historia.printOpt3End();
                }
                case "0" -> {
                    System.out.println("Saindo do menu...");
                    return;
                }
                default -> System.out.println("❌ Opção inválida! Tente novamente.");
            }
            break;
        }
    }

    public static void escolhaAto2() throws Exception {
        while (true) {
            System.out.println("\n=== Escolha como vai chegar ao setor C-9 ===");
            System.out.println("1 - “Seguir pelo corredor principal (rota direta)");
            System.out.println("2 - “Subir pelas passarelas superiores (rota furtiva)");
            System.out.println("3 - “Investigar o escritório de controle (rota investigativa)");
            System.out.println("0 - Sair");

            System.out.print("Opção: ");
            String opcao = scanner.nextLine();

            Jogo.clearConsole();

            Jogo.clearConsole();
            switch (opcao) {
                case "1" -> {

                }
                case "2" -> {

                }
                case "3" -> {

                }
                case "0" -> {
                    System.out.println("Saindo do menu...");
                    return;
                }
                default -> System.out.println("❌ Opção inválida! Tente novamente.");
            }
            break;
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
        try {
            Thread.sleep(1000);
            System.out.println();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void printWithDelay(String text, int delayMillis) {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(delayMillis);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(); // pula linha no final
    }

    public static void clearConsole(){
        for(int i = 0; i < 100; i++){
            System.out.println();
        }
    }

    public static void combate(Inimigo inimigo) {

        do {
            clearConsole();
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1" -> {
                    byte dano = inimigo.atacarInimigo();
                    personagem.recebeuAtaque(dano);
                    if (!inimigo.estaVivo()) break;

                    dano = personagem.atacarInimigo();
                    inimigo.recebeuAtaque(dano);
                    if (!personagem.estaVivo()) break;
                }
                case "2" -> {

                }

                default -> {

                }
            }
        }while (personagem.estaVivo() && inimigo.estaVivo());
    }

    private static void escolherAcaoNoCombate() {
        System.out.println("Escolha sua ação!");

        System.out.println("1 - Lutar");
        System.out.println("2 - Usar item");
        System.out.println("3 - Fugir");

        System.out.print("Opção: ");

    }
}
