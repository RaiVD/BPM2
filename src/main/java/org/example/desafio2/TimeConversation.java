package org.example.desafio2;

import org.example.InputUsers;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class TimeConversation {
    public static void main(String[] args) {
        boolean entradaValida = false;
        while (!entradaValida) {
            long seconds = InputUsers.readLongFromUser("Informe um valor para conversão (segundos): ");

            Date date = new Date(seconds * 1000);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy HH:mm:ss");
            sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
            String formatDate = sdf.format(date);

            System.out.println("Data e hora em UTC: " + formatDate);

            entradaValida = true;
        }
    }
}


