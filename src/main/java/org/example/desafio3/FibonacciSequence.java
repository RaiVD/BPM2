package org.example.desafio3;

import org.example.InputUsers;

public class FibonacciSequence {
    public static void main(String[] args) {
        int valueN = InputUsers.readIntFromUser("Informe um valor inteiro: ");

        long result = calculateFibonacci(valueN);
        System.out.println("Fib: " + result);
    }

    public static long calculateFibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            long fib1 = 0;
            long fib2 = 1;
            long fibAtual = 0;

            for (int i = 2; i <= n; i++) {
                fibAtual = fib1 + fib2;
                fib1 = fib2;
                fib2 = fibAtual;
            }

            return fibAtual;
        }
    }
}
