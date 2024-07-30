package edu.victor.aula_05_SwitchCase;

import java.util.*;

public class SistemaMedida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Qual o tamanho do seu... boneco do ben10? (P, M ou G)");
        String sigla = scanner.next().toUpperCase();

        switch(sigla){
            case "P": {
                System.out.println("Que pena, é pequeno?");
                break;
            }

            case "M": {
                System.out.println("Boa, pelo menos é médio");
                break;
            }

            case "G": {
                System.out.println("Grande em, parabéns");
                break;
            }

            default: {
                System.out.println("Indefinido");
            }
        }
    }
}
