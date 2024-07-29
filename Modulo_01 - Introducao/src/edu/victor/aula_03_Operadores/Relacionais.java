package edu.victor.aula_03_Operadores;

public class Relacionais {
    public static void main(String[] args) {
        // Operadores relacionais
        String nome1 = "VICTOR";
        String nome2 = new String("VICTOR");

        System.out.println(nome1 == nome2);
        System.out.println(nome1.equals(nome2)); // Compara o conteúdo

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        System.out.println("Número um é igual a número dois? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("Número um é diferente de número dois? " + simNao);

        simNao = numero1 > numero2;
        System.out.println("Número um é maior que número dois? " + simNao);

        if(numero1 < numero2){
            System.out.println("A condição é verdadeira.");
        }
    }
}
