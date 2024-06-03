package programa;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        try {
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();

            contar(parametroUm, parametroDois);
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        } finally {
            terminal.close();
        }
    }

    static void contar(int parametroUm, int parametroDois) {
        if (parametroUm >= parametroDois) {
            throw new IllegalArgumentException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
