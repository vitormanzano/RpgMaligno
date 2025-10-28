package jogo;

import Itens.*;
import models.Inimigo;
import models.Inimigos.*;
import models.Item;
import models.classesJogador.Bladerunner;
import models.classesJogador.Cybermancer;
import models.classesJogador.Panzer;
import models.personagem.Personagem;
import java.util.Scanner;
import static jogo.Historia.*;
import static models.personagem.Personagem.rolarDado;

public class Jogo {
    static Scanner scanner = new Scanner(System.in);
    private Personagem savePoint;

    private  byte atoAtual = 1;
    private Personagem personagem;
    public Jogo() { }

    public void iniciarJogo() throws Exception {
        System.out.println(" Bem-vindo ao");
        System.out.println("                             .__           .__          __   \n" +
                "  ____   ____  ____   ____   |  |__   ____ |__| _______/  |_ \n" +
                " /    \\_/ __ \\/  _ \\ /    \\  |  |  \\_/ __ \\|  |/  ___/\\   __\\\n" +
                "|   |  \\  ___(  <_> )   |  \\ |   Y  \\  ___/|  |\\___ \\  |  |  \n" +
                "|___|  /\\___  >____/|___|  / |___|  /\\___  >__/____  > |__|  \n" +
                "     \\/     \\/           \\/       \\/     \\/        \\/        ");
        System.out.println("---------------------------------------------------------------");
        iniciarIntroducao();
        ato1();
        ato2();
        ato3();
    }

    public void iniciarIntroducao() throws Exception {
        Historia.printIntroducao();
        printClasses();
        escolherClasse();
    }

    public void ato1() throws Exception {
        savePoint();
        printAto1();
        aceitarTrampo();
        escolha1();
        escolhaArmazem();
        personagem.aumentarNivel();
        System.out.println("Parabéns! Você acabou de subir de nível!");
        System.out.println(personagem);
    }

    public void ato2() throws Exception {
        this.atoAtual = 2;
        savePoint();
        printAto2();
        escolhaAto2();
        personagem.aumentarNivel();
        System.out.println("Parabéns! Você acabou de subir de nível!");
    }

    public void ato3() throws Exception {
        this.atoAtual = 3;
        savePoint();
        printCarga();
        combate(new Falco());
    }

    public void savePoint() throws Exception {
        if (personagem instanceof Bladerunner) {
            savePoint = new Bladerunner(personagem.getNome());
        } else if (personagem instanceof Cybermancer) {
            savePoint = new Cybermancer(personagem.getNome());
        } else if (personagem instanceof Panzer) {
            savePoint = new Panzer(personagem.getNome());
        }
    }

    public void escolherClasse() throws Exception {
        while (true) {
            System.out.println("\n=== ESCOLHA SUA CLASSE ===");
            System.out.println("1 - Bladerunner");
            System.out.println("2 - Cybermancer");
            System.out.println("3 - Panzer");


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

                default -> {
                    System.out.println("Opção inválida! Tente novamente.");
                    continue;
                }
            }
            break;
        }
    }

    public void aceitarTrampo() throws Exception {
        atoAtual = 1;
        while (true) {
            System.out.println("\n=== ACEITAR TRABALHO ===");
            System.out.println("1 - Aceitar");
            System.out.println("2 - Rejeitar");

            System.out.print("Opção: ");
            String opcao = scanner.nextLine();
            Jogo.clearConsole();

            Jogo.clearConsole();
            switch (opcao) {
                case "1" -> Historia.aceitou();
                case "2" -> {
                    Historia.rejeitou();
                    Thread.sleep(2000);
                }
                default -> {
                    System.out.println("Opção inválida! Tente novamente.");
                    continue;
                }
            }
            break;
        }
    }

    public void escolha1() throws Exception {
        while (true) {
            System.out.println("\n=== ESCOLHA SEU CAMINHO ===");
            System.out.println("1 - Explorar beco");
            System.out.println("2 - Ir para o armazém");

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

                default -> {
                    System.out.println("Opção inválida! Tente novamente.");
                    continue;
                }
            }
            break;
        }
    }

    public void escolhaBeco() throws Exception {
        while (true) {
            System.out.println("\n======================");
            System.out.println("1 - “Não enche o saco”");
            System.out.println("2 - “Pô mano, me ofereceram um trampo aí...carga da Monolith, tá sabendo de algo?”");

            System.out.print("Opção: ");
            String opcao = scanner.nextLine();
            Jogo.clearConsole();

            switch (opcao) {
                case "1" -> {
                    Historia.falaBeco1();
                    combate(new Marginal("Marginal"));
                    personagem.getInventario().adicionarItem(new ModuloCamuflagem());
                    printPreArmazem();
                }
                case "2" -> {
                    Historia.falaBeco2();
                    personagem.getInventario().adicionarItem(new ModuloCamuflagem());
                    printPreArmazem();
                }
                default -> {
                    System.out.println("Opção inválida! Tente novamente.");
                    continue;
                }
            }
            break;
        }
    }

    public void escolhaArmazem() throws Exception {
        while (true) {
            System.out.println("\n=== Escolha como vai entrar ===");
            System.out.println("1 - “Tentar hacker o portão");
            System.out.println("2 - “Invadir à força");
            System.out.println("3 - “Entrar furtivamente");


            System.out.print("Opção: ");
            String opcao = scanner.nextLine();

            Jogo.clearConsole();

            Jogo.clearConsole();
            switch (opcao) {
                case "1" -> {
                    Historia.printOpt1Start();
                    byte resultadoDado=rolarDado();
                    if (resultadoDado<=10){
                        printFalhaHack();
                        combate(new Guarda("Guarda"));
                        printOpt1End();
                        personagem.getInventario().removerItem(new CartaoDeAcesso());
                    }
                    else{
                        printSucessoHack();
                        escolhaOpt1();
                    }
                }
                case "2" -> {
                    Historia.printOpt2Start();
                    combate(new Guarda("Guarda"));
                    Historia.printOpt2End();
                }
                case "3" -> {
                    Historia.printOpt3Start();
                    combate(new GuardaDanificado("Guarda Danificado"));
                    Historia.printOpt3End();
                }
                default -> {
                    System.out.println("Opção inválida! Tente novamente.");
                    continue;
                }
            }
            break;
        }
    }

    public void escolhaOpt1() throws Exception {
        while (true) {
            System.out.println("\n=== O que você faz? ===");
            System.out.println("1 - “Procurar outra entrada");
            System.out.println("2 - “Tentar hackear o painel do portão");


            System.out.print("Opção: ");
            String opcao = scanner.nextLine();
            Jogo.clearConsole();

            switch (opcao) {
                case "1" -> {
                    Historia.printOpt3Start();
                    personagem.getInventario().removerItem(new ModuloCamuflagem());
                    combate(new GuardaDanificado("Guarda Danificado"));
                    Historia.printOpt3End();
                }
                case "2" -> {
                    Historia.printOpt1Start();
                    byte resultadoDado=rolarDado();
                    if (resultadoDado<=10){
                        printFalhaHack();
                        combate(new Guarda("Guarda"));
                        printHack2();
                    }
                    else{
                        printSucessoHack2();
                    }
                }

                default -> {
                    System.out.println("Opção inválida! Tente novamente.");
                    continue;
                }
            }
            break;
        }
    }

    public void escolhaAto2() throws Exception {
        while (true) {
            System.out.println("\n=== Escolha como vai chegar ao setor C-9 ===");
            System.out.println("1 - “Seguir pelo corredor principal (rota direta)");
            System.out.println("2 - “Subir pelas passarelas superiores (rota furtiva)");
            System.out.println("3 - “Investigar o escritório de controle (rota investigativa)");


            System.out.print("Opção: ");
            String opcao = scanner.nextLine();
            Jogo.clearConsole();

            switch (opcao) {
                case "1" -> {
                    Historia.printCorredor1();
                    combate(new Drone("Drone"));
                    Historia.printCorredor2();
                    MiniWordle.jogarWordle();
                }
                case "2" -> {
                    Historia.printPassarelas();
                    byte resultadoDado=rolarDado();
                    if (resultadoDado<=10){
                        printFalhaStealth();
                        combate(new Drone("Drone"));
                        printFalhaStealth2();
                        printSucessoStealth();
                        escolhaEscritorio();

                    }
                    else{
                        printSucessoStealth();
                        escolhaEscritorio();

                    }
                }
                case "3" -> {
                    Historia.printEscritorio();
                    escolhaEscritorio();

                }

                default -> {
                    System.out.println("Opção inválida! Tente novamente.");
                    continue;
                }
            }
            break;
        }
    }

    public void escolhaEscritorio() throws Exception {
        while (true) {
            System.out.println("\n=== O que você faz? ===");
            System.out.println("1 - “Partir pra cima.");
            System.out.println("2 - “Usar núcleo instável.");

            System.out.print("Opção: ");
            String opcao = scanner.nextLine();
            Jogo.clearConsole();

            switch (opcao) {
                case "1" -> {
                    Historia.printLuta();
                    combate(new ChromeSkull("Chrome Skull"));
                    Historia.printLutaEnd();
                    Historia.printCorredor2();
                    MiniWordle.jogarWordle();
                }
                case "2" -> {
                    Item item =  personagem.getInventario().verificarSeItemJaExisteNoInventario(new NucleoInstavel());
                    if (item == null){
                        System.out.println("Você não tem um Núcleo Instável no inventário. Tente explorar mais o mapa da próxima vez!");
                        System.out.println("Não restam opções, você precisa lutar.");
                        continue;
                    }
                    else {
                        Historia.printPEM();
                        personagem.getInventario().removerItem(new NucleoInstavel());
                        Historia.printLutaEnd();
                        Historia.printCorredor2();
                        MiniWordle.jogarWordle();
                    }
                }
                default -> {
                    System.out.println("Opção inválida! Tente novamente.");
                    continue;
                }
            }
            break;
        }
    }

    private void mostrarClasse(Personagem personagem) {
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
                    this.personagem = personagem;
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

    public void combate(Inimigo inimigo) throws Exception {

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
            Jogo.clearConsole();
            printarDadosBatalha(personagem, inimigo);
        } while (personagem.estaVivo() && inimigo.estaVivo());
        if(inimigo.getClass() == Falco.class) {
            if (!personagem.estaVivo()) {
                printFinal2();
            } else {
                printFinal1();
            }
        }
        if (!personagem.estaVivo()) {
            printMorte();
            System.exit(0);
        }
        else {
            adicionarItemInimigoNoInventario(personagem, inimigo);
            System.out.println("Inimigo derrotado! Olhe os itens adicionado no seu inventário!");
            System.out.println(inimigo.getInventario());
        }
    }

    public void adicionarItemInimigoNoInventario(Personagem personagem, Inimigo inimigo) {
        for (Item item : inimigo.getInventario().getItens()) {
            personagem.getInventario().adicionarItem(item);
        }
    }

    public void usarItem(Personagem personagem, Inimigo inimigo) {
        escolherItem(personagem, inimigo);
    }

    private void aplicarEfeitosItem(Item item, Personagem personagem, Inimigo inimigo) {
        if (item.getClass() == Nanogel.class)
            personagem.setPontosVida((byte)(personagem.getPontosVida() + 25));
        if (item.getClass() == NanogelPrime.class)
            personagem.setPontosVida((byte)(personagem.getPontosVida() + 50));
        if (item.getClass() == NucleoInstavel.class)
            inimigo.setPontosVida((byte) (inimigo.getPontosVida() - 100));
    }

    public void voltarNoSavePoint(byte ato) throws Exception {
        switch (ato) {
            case 1 -> {
                atoAtual = 1;
                ato1();
            }
            case 2 -> {
                atoAtual = 2;
                ato2();
            }
        }
    }

    private static void escolherAcaoNoCombate() {
        System.out.println("Escolha sua ação!");

        System.out.println("1 - Lutar");
        System.out.println("2 - Usar item");

        System.out.print("Opção: ");
    }

    private void escolherItem(Personagem personagem, Inimigo inimigo) {
        System.out.println("Escolha o item que deseja usar!");
        personagem.getInventario().listarItens();

        System.out.print("Número do item: ");
        String opcao = scanner.nextLine();

        try {
            int index = Integer.parseInt(opcao);
            Item item = personagem.getInventario().getItem(index);
            aplicarEfeitosItem(item, personagem, inimigo);
            System.out.println("Item usado com sucesso!");

            personagem.getInventario().removerItem(item);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void printarDadosBatalha(Personagem personagem, Inimigo inimigo) {
        System.out.println(inimigo);
        System.out.println(personagem);
    }
}
