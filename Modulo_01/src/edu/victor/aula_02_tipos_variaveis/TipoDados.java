package edu.victor.aula_02_tipos_variaveis;

public class TipoDados {
    public static void main(String[] args){
        // Númericos
        byte idade = 123;
        short ano = 2024;
        int cep = 54368880; // Se começar com zero, pode ser outro tipo
        long cpf = 98765432109L; // Se começar com zero, pode ser outro tipo
        float pi = 3.14F;
        double salarioMinimo = 2500.50;

        // Variável
        int numero = 5;
        System.out.println("O número é: " + numero);

        numero = 10;
        System.out.println("O número é: " + numero);

        // Constante
        final double VALOR_PI = 3.14;


    }
}
