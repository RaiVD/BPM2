package org.example;

import java.util.Scanner;

public class InputUsers {
    private static Scanner scanner = new Scanner(System.in);

    public static int readIntFromUser(String mensagem) {
        while (true) {
            System.out.print(mensagem);
            String input = scanner.nextLine();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro válido.");
            }
        }
    }
    public static long readLongFromUser(String mensagem) {
        while (true) {
            System.out.print(mensagem);
            String input = scanner.nextLine();
            try {
                return Long.parseLong(input);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, digite um número long válido.");
            }
        }
    }
}
