package edu.victor.p03_DesafioControleFluxo;

import java.util.*;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Digite o primeiro parâmetro: ");
        int primeiroParametro = scanner.nextInt();

        System.out.printf("Digite o segundo parâmetro: ");
        int segundoParametro = scanner.nextInt();

        try{
            contar(primeiroParametro, segundoParametro);
        } catch (ParametrosInvalidosException e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {
        if (primeiroParametro > segundoParametro) {
            throw new ParametrosInvalidosException();
        }

        int iteracoes = segundoParametro - primeiroParametro;

        for (int i = 1; i <= iteracoes; i++) {
            System.out.printf("Imprimindo o número: %d%n", i);
        }
    }
}
