package edu.victor.aula_00_Anatomia;

public class Main {
    public static void main(String[] args){
        final String BR = "Brasil";

        System.out.print("O começo de toda linguagem é: ");
        System.out.println("Olá mundo, meu nome é Victor Barbosa");
        System.out.printf("O país aonde moro é o: " + BR + "\n");

        String primeiroNome = "Victor";
        String segundoNome = "Barbosa";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto + " É o meu nome completo.");
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return primeiroNome.concat(" "). concat(segundoNome);
    }
}