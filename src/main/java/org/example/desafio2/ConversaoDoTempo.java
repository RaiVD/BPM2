package org.example.desafio2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class ConversaoDoTempo {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            System.out.print("Informe um valor para conversão (segundos): ");
            long segundos = scanner.nextLong();

            Date data = new Date(segundos * 1000);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy HH:mm:ss");
            sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
            String dataFormatada = sdf.format(data);

            System.out.println("Data e hora em UTC: " + dataFormatada);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Entrada inválida. Certifique-se de inserir um valor numérico.");
        }
    }
}


