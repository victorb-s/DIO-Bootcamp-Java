package edu.victor.aula_03_Operadores;

public class OperadoresUnários {
    public static void main(String[] args) {
        // Operadores Unários
        int numero = 5;
        System.out.println(- numero);

        numero = -numero;
        System.out.println(numero);

        numero = numero * -1;
        System.out.println(numero);

        // Adicionar e subtrair
        numero++;
        // numero = numero + 1
        System.out.println(numero);
        System.out.println(++numero);

        numero--;
        System.out.println(numero);

        // Negação
        boolean variavel = true;
        System.out.println(!variavel);
        System.out.println(variavel);

        variavel = !variavel;
        System.out.println(variavel);
    }
}
