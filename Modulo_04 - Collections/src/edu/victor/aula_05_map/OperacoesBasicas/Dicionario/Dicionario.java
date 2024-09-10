package edu.victor.aula_05_map.OperacoesBasicas.Dicionario;

import java.util.*;

public class Dicionario {
    private Map<String, String> dicionario;

    public Dicionario() {
        this.dicionario = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicionario.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if(!dicionario.isEmpty()){
            dicionario.remove(palavra);
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public void exibirPalavras(){
        System.out.println(dicionario);
    }

    public String pesquisarPorPalavra(String palavra){
        String nomePorPalavra = null;
        if(!dicionario.isEmpty()){
            nomePorPalavra = dicionario.get(palavra);
        }
        return nomePorPalavra;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();
        dicionario.adicionarPalavra("Foda", "Algo foda");
        dicionario.adicionarPalavra("Cavalo", "Montaria antiga");
        dicionario.adicionarPalavra("Sela", "Usada para montar (lá ele) no cavalo");

        dicionario.exibirPalavras();

        System.out.println(dicionario.pesquisarPorPalavra("Sela"));

        dicionario.removerPalavra("Foda");
        dicionario.exibirPalavras();
    }
}
