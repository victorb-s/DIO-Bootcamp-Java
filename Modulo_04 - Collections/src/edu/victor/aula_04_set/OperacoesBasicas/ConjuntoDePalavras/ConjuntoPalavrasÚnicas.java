package edu.victor.aula_04_set.OperacoesBasicas.ConjuntoDePalavras;

import java.util.*;

public class ConjuntoPalavrasÚnicas {
    private Set<String> conjuntoPalavras;

    public ConjuntoPalavrasÚnicas() {
        this.conjuntoPalavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        this.conjuntoPalavras.add(palavra);
    }

    public void removerPalavra(String palavra){
        if(conjuntoPalavras.contains(palavra)){
            conjuntoPalavras.remove(palavra);
        } else {
            throw new RuntimeException("Esta palavra não existe!");
        }
    }

    public boolean verificarPalavra(String palavra){
        if(conjuntoPalavras.contains(palavra)){
            return true;
        } else {
            return false;
        }
    }

    public Set<String> exibirPalavrasUnicas() {
        return this.conjuntoPalavras;
    }

    public static void main(String[] args) {
        ConjuntoPalavrasÚnicas conjuntoPalavras = new ConjuntoPalavrasÚnicas();

        conjuntoPalavras.adicionarPalavra("Break");
        conjuntoPalavras.adicionarPalavra("Try");
        conjuntoPalavras.adicionarPalavra("Cavalo");
        conjuntoPalavras.adicionarPalavra("Break");

        System.out.println(conjuntoPalavras.exibirPalavrasUnicas());

        conjuntoPalavras.removerPalavra("Break");

        System.out.println(conjuntoPalavras.exibirPalavrasUnicas());

        System.out.println(conjuntoPalavras.verificarPalavra("Cavalo"));
    }
}
