package org.example.desafio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OrdenandoNumeros {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Integer> pares = new ArrayList<>();
    private static List<Integer> impares = new ArrayList<>();

    public static void main(String[] args) {
        System.out.print("Quantos números você deseja listar: ");
        int quantidadeNumeros = scanner.nextInt();

        if (quantidadeNumeros > 0 && quantidadeNumeros < 10000) {
            lerEClassificarNumeros(quantidadeNumeros);

            imprimirNumerosOrdenados("Números Pares (Ordem Crescente):", pares);
            imprimirNumerosOrdenados("Números Ímpares (Ordem Decrescente):", impares);
        } else {
            System.out.println("A quantidade deve ser entre 0 e 10000");
        }
    }

    private static void lerEClassificarNumeros(int quantidadeNumeros) {
        for (int i = 0; i < quantidadeNumeros; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");

            int valor = scanner.nextInt();
            if (valor % 2 == 0) {
                pares.add(valor);
            } else {
                impares.add(valor);
            }
        }

        // Ordena os pares em ordem crescente
        Collections.sort(pares);

        // Ordena os ímpares em ordem decrescente
        impares.sort(Collections.reverseOrder());
    }

    private static void imprimirNumerosOrdenados(String titulo, List<Integer> numeros) {
        System.out.println("\n" + titulo);
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}

