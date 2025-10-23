package jogo;

import java.util.Scanner;

public class Jogo {
    static Scanner scanner = new Scanner(System.in);

    private byte atoAtual;


    public static void iniciarJogo() 
    {
        System.out.println("Bem vindo ao seu Rpg maligno...");

    }


    public static void pressAnythingToContinue() {
        System.out.println("Pressione qualquer coisa para continuar...");
        scanner.nextLine();
    }
}
