package edu.victor.Fluxo01_Condicional.aula_02_CondicionalSimples;

public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if(valorSolicitado < saldo){
            saldo -= valorSolicitado;
        }

        System.out.println("O saldo atual é: R$" + saldo);
    }
}
