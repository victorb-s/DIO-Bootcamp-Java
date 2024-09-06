package edu.victor.aula_03_list.Pesquisa.SomaDeNumeros;

import java.util.*;

public class SomaNumeros {
    private List<Integer> listaNumeros;

    public static void main(String[] args) {
        SomaNumeros listaN = new SomaNumeros();

        listaN.adicionarNumero(1);
        listaN.adicionarNumero(2);
        listaN.adicionarNumero(3);
        listaN.adicionarNumero(4);
        listaN.adicionarNumero(5);

        System.out.println("Números adicionados:");
        System.out.println(listaN.exibirNumeros());

        System.out.println(listaN.calcularSoma());

        System.out.println("Maior número: " + listaN.encontrarMaiorNumero());
        System.out.println("Menor número: " + listaN.encontrarMenorNumero());
    }

    public SomaNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        listaNumeros.add(numero);
    }

    public int calcularSoma(){
        int somaTotal = 0;
        for (Integer numero : listaNumeros) {
            somaTotal += numero;
        }

        return somaTotal;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = 0;
        if (!listaNumeros.isEmpty()){
            for (Integer numero : listaNumeros) {
                if (numero > maiorNumero) {
                    maiorNumero = numero;
                }
            }
        return maiorNumero;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }

    }

    public int encontrarMenorNumero(){
        int menorNumero = listaNumeros.getFirst();
        if (!listaNumeros.isEmpty()){
            for (Integer numero : listaNumeros) {
                if (numero < menorNumero) {
                    menorNumero = numero;
                }
            }

            return menorNumero;
        } else {
            throw new RuntimeException("A lista esta vazia!");
        }
    }

    public List<Integer> exibirNumeros(){
        return listaNumeros;
    }
}
