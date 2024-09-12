package edu.victor.aula_05_map.Pesquisa.ContagemDePalavras;

import java.util.*;

public class ContagemPalavras {
    private Map<String, Integer> contagemPalavras;
    public ContagemPalavras() {
        this.contagemPalavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        this.contagemPalavras.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        this.contagemPalavras.remove(palavra);
    }

    public Map<String, Integer> exibirContagemPalavras(){
        return this.contagemPalavras;
    }

    public String encontrarPalavraMaisFrenquente(){
        String palavraFrequente = null;
        int maiorContagem = 0;
        for(Map.Entry<String, Integer> entry : contagemPalavras.entrySet()){
            if(entry.getValue() > maiorContagem){
                maiorContagem = entry.getValue();
                palavraFrequente = entry.getKey();
            }
        }

        return palavraFrequente;
    }
}
