package jogo;

import Itens.ModuloCamuflagem;
import Itens.Nanogel;
import Itens.NucleoInstavel;
import models.Inimigo;
import models.Inimigos.*;
import models.Inventario;
import models.Item;
import models.classesJogador.Bladerunner;
import models.classesJogador.Cybermancer;
import models.classesJogador.Panzer;
import models.personagem.Personagem;
import java.util.Scanner;
import static jogo.Historia.*;
import java.util.Scanner;

public class Jogo {
    static Scanner scanner = new Scanner(System.in);

    private static byte atoAtual;
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
        escolhaAto2();
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
        atoAtual = 1;
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
                    if (Personagem.rolarDado()>=10){
                        printFalhaHack();
                        combate(new Guarda());
                        printOpt1End();
                    }
                    else{
                        printSucessoHack();
                        escolhaOpt1();
                    }
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

    public static void escolhaOpt1() throws Exception {
        while (true) {
            System.out.println("\n=== O que você faz? ===");
            System.out.println("1 - “Procurar outra entrada");
            System.out.println("2 - “Tentar hackear o painel do portão");
            System.out.println("0 - Sair");

            System.out.print("Opção: ");
            String opcao = scanner.nextLine();
            Jogo.clearConsole();

            switch (opcao) {
                case "1" -> {
                    Historia.printOpt3Start();
                    combate(new GuardaDanificado());
                    Historia.printOpt3End();
                }
                case "2" -> {
                    Historia.printOpt1Start();
                    if (Personagem.rolarDado()>=10){
                        printFalhaHack();
                        combate(new Guarda());
                        printHack2();
                    }
                    else{
                        printSucessoHack2();
                    }
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

            switch (opcao) {
                case "1" -> {
                    Historia.printCorredor1();
                    combate(new Drone());
                    Historia.printCorredor2();
                    new MiniWordle();
                }
                case "2" -> {
                    Historia.printPassarelas();
                    if (Personagem.rolarDado()>=10){
                        printFalhaHack();
                        combate(new Drone());
                        printHack2();
                    }
                    else{
                        printSucessoStealth();

                    }

                }
                case "3" -> {
                    Historia.printEscritorio();
                }
                case "0" -> {
                    System.out.println("Saindo do menu...");
                    return;
                }
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
            break;
        }
    }

    public static void escolhaEscritorio() throws Exception {
        while (true) {
            System.out.println("\n=== O que você faz? ===");
            System.out.println("1 - “Partir pra cima.");
            System.out.println("2 - “Usar núcleo instável.");
            System.out.println("0 - Sair");

            System.out.print("Opção: ");
            String opcao = scanner.nextLine();
            Jogo.clearConsole();

            switch (opcao) {
                case "1" -> {
                    Historia.printLuta();
                    combate(new ChromeSkull());
                    Historia.printLutaEnd();
                }
                case "2" -> {
                    Historia.printPEM();

                }
                case "0" -> {
                    System.out.println("Saindo do menu...");
                    return;
                }
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
            break;
        }
    }

    public static class MiniWordle {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String senha = "6769";
            int tentativas = 6;

            System.out.println("=== PUZZLE: ADIVINHE A SENHA ===");
            System.out.println("A senha tem " + senha.length() + " números");
            System.out.println("Você tem 6 chances para acertar.");
            System.out.println("X = Dígito não existe na senha.");
            System.out.println("⚠ = Dígito correto, porém no lugar errado.");
            System.out.println("✔ = Dígito correto no lugar correto.");

            while (tentativas > 0) {
                System.out.print("\nDigite sua tentativa: ");
                String tentativa = sc.nextLine().toUpperCase();

                if (tentativa.length() != senha.length()) {
                    System.out.println("A senha deve ter " + senha.length() + " números");
                    continue;
                }

                // Mostrar resultado
                StringBuilder resultado = new StringBuilder();
                boolean[] usadas = new boolean[senha.length()];

                // Primeira passada: letras certas
                for (int i = 0; i < senha.length(); i++) {
                    if (tentativa.charAt(i) == senha.charAt(i)) {
                        resultado.append("✔ ");
                        usadas[i] = true;
                    } else {
                        resultado.append("_ ");
                    }
                }

                // Segunda passada: letras certas no lugar errado
                for (int i = 0; i < tentativa.length(); i++) {
                    if (tentativa.charAt(i) != senha.charAt(i)) {
                        boolean achou = false;
                        for (int j = 0; j < senha.length(); j++) {
                            if (!usadas[j] && tentativa.charAt(i) == senha.charAt(j)) {
                                achou = true;
                                usadas[j] = true;
                                break;
                            }
                        }
                        if (achou) resultado.setCharAt(i * 2, '⚠');
                        else resultado.setCharAt(i * 2, 'X');
                    }
                }

                System.out.println(resultado.toString());

                if (tentativa.equals(senha)) {
                    System.out.println("\n Senha aceita. Cofre abrindo.");
                    break;
                }

                tentativas--;
                System.out.println("Tentativas restantes: " + tentativas);
            }

            if (tentativas == 0) {
                System.out.println("\nSenha não aceita. Tentativa de invasão detectada.");
                printWithDelay("O som ensurdecedor do alarme soa.",35);
                pressAnythingToContinue();
                printWithDelay("Você se vê cercado por um grande número de drones e guardas, prontos para te eliminar.",35);
                pressAnythingToContinue();
                printWithDelay("Eles abrem fogo. Você morre.",35);
                pressAnythingToContinue();
                printMorte();
                System.exit(0);
            }

            sc.close();
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
                    Jogo.personagem = personagem;
                    System.out.println("Classe escolhida com sucesso!");
                    return;
                }
                case "2" -> {
                    System.out.println("↩ Voltando para o menu de seleção...");
                    return;
                }
                default -> System.out.println("Opção inválida! Tente novamente.");
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
            escolherAcaoNoCombate();
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1" -> {
                    byte dano = inimigo.atacarInimigo();
                    personagem.recebeuAtaque(dano);
                    if (!inimigo.estaVivo()) break;

                    dano = personagem.atacarInimigo();
                    inimigo.recebeuAtaque(dano);
                    if (!personagem.estaVivo());
                }
                case "2" -> {
                    usarItem(personagem, inimigo);
                }
                case "3" -> {
                    System.out.println("Saindo do menu...");
                    return;
                }

                default -> {
                    System.out.println("Escolha um número válido!");
                }
            }
        } while (personagem.estaVivo() && inimigo.estaVivo());

        if (!personagem.estaVivo())
            printMorte();
        else {
            inimigo.getInventario().listarItens();

        }
    }

    public static void usarItem(Personagem personagem, Inimigo inimigo) {
        escolherItem(personagem, inimigo);
    }

    private static void aplicarEfeitosItem(Item item, Personagem personagem, Inimigo inimigo) {
        if (item.getClass() == Nanogel.class)
            personagem.setPontosVida((byte) (personagem.getPontosVida() + 15));
        if (item.getClass() == NucleoInstavel.class)
            inimigo.setPontosVida((byte) (inimigo.getPontosVida() - 100));
    }

    private static void escolherAcaoNoCombate() {
        System.out.println("Escolha sua ação!");

        System.out.println("1 - Lutar");
        System.out.println("2 - Usar item");
        System.out.println("3 - Fugir");

        System.out.print("Opção: ");
    }

    private static void escolherItem(Personagem personagem, Inimigo inimigo) {
        System.out.println("Escolha o item que deseja usar!");
        personagem.getInventario().listarItens();

        System.out.print("Número do item: ");
        String opcao = scanner.nextLine();

        try {
            int index = Integer.parseInt(opcao);
            Item item = personagem.getInventario().getItem(index);
            aplicarEfeitosItem(item, personagem, inimigo);

            personagem.getInventario().removerItem(item);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
