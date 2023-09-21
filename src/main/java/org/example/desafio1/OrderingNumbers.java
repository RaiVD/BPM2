package org.example.desafio1;

import org.example.InputUsers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrderingNumbers {
    private static List<Integer> pairs = new ArrayList<>();
    private static List<Integer> oddNumbers = new ArrayList<>();

    public static void main(String[] args) {
        int quantityNumbers = InputUsers.readIntFromUser("Quantos números você deseja listar: ");

        if (quantityNumbers > 0 && quantityNumbers < 10000) {
            readAndClassifyNumbers(quantityNumbers);

            printOrderedNumbers("Números Pares (Ordem Crescente):", pairs);
            printOrderedNumbers("Números Ímpares (Ordem Decrescente):", oddNumbers);
        } else {
            System.out.println("A quantidade deve ser entre 0 e 10000");
        }
    }

    private static void readAndClassifyNumbers(int quantityNumbers) {
        for (int i = 0; i < quantityNumbers; i++) {
            int valor = InputUsers.readIntFromUser("Digite o número " + (i + 1) + ": ");

            if (valor % 2 == 0) {
                pairs.add(valor);
            } else {
                oddNumbers.add(valor);
            }
        }

        Collections.sort(pairs);
        oddNumbers.sort(Collections.reverseOrder());
    }

    private static void printOrderedNumbers(String titulo, List<Integer> numbers) {
        System.out.println("\n" + titulo);
        for (int numero : numbers) {
            System.out.println(numero);
        }
    }
}

