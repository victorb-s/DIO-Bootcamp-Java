package edu.victor.aula_03_Operadores;

public class Concatenacao {
    public static void main(String[] args) {
        // Concatenação
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println("Nome: " + nomeCompleto);

        String concatenacao ="?";
        System.out.println(concatenacao);

        // Quando o depurador lê o caracter primeiro, ele impede as seguintes operações, a não ser que esteja em evidência
        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);
    }
}
