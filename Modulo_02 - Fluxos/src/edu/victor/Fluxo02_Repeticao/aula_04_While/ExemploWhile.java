package edu.victor.Fluxo02_Repeticao.aula_04_While;
import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        while(mesada > 0){
            Double valorDoce = valorAleatorio();

            if(valorDoce > mesada){
                valorDoce = mesada;
            }

            System.out.println("Doce do valor: R$" + valorDoce + " Adicionado no carrinho, o saldo atual é: R$" + mesada);
            mesada -= valorDoce;
        }
    }

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
