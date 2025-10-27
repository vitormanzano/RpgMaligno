package jogo;

import java.util.Scanner;

import static jogo.Historia.printMorte;
import static jogo.Jogo.pressAnythingToContinue;
import static jogo.Jogo.printWithDelay;

public class MiniWordle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String senha = "4321";
        int tentativas = 6;

        System.out.println("=== PUZZLE: ADIVINHE A SENHA ===");
        System.out.println("A senha tem " + senha.length() + " números");
        System.out.println("Você tem 6 chances para acertar.");
        System.out.println("X = Dígito não faz parte da senha.");
        System.out.println("⚠ = Dígito faz parte da senha, mas em outra posição.");
        System.out.println("✔ = Dígito faz parte da senha e está na posição correto");

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
            System.out.println("\nSenha não aceita. Sistema de segurança ativado.");
            printWithDelay("Um alarme estridente corta o ar, fazendo seus tímpanos pulsarem.", 35);
            pressAnythingToContinue();
            printWithDelay("As luzes vermelhas piscam freneticamente enquanto drones e guardas cercam você, armas apontadas.", 35);
            pressAnythingToContinue();
            printWithDelay("Você sente o calor das balas passando perto. Não há saída.", 35);
            pressAnythingToContinue();
            printWithDelay("Um disparo final ecoa. Sua visão se apaga. Fim.", 35);
            pressAnythingToContinue();
            printMorte();
            System.exit(0);
        }

        sc.close();
    }
}