package edu.victor.aula_01_CondicionalComposta;

import java.util.*;

public class ResultadoEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe sua nota:");
        int nota = scanner.nextInt();

        if (nota >= 7) {
            System.out.println("Aprovado");
        }

        else{
            System.out.println("Reprovado");
        }
    }
}
