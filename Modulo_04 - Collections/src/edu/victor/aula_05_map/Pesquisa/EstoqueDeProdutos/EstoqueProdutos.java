package edu.victor.aula_05_map.Pesquisa.EstoqueDeProdutos;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutoMap;

    public EstoqueProdutos() {
        this.estoqueProdutoMap = new HashMap<>();
    }

    public void adicionarProduto(long codigo, String nome, int quantidade, double preco) {
        estoqueProdutoMap.put(codigo, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutoMap);
    }

    public double calcularValorTotalEstoque(){
        double valorTotal = 0d;
        if(!estoqueProdutoMap.isEmpty()){
            for(Produto p : estoqueProdutoMap.values()){
                valorTotal += p.getQuantidade() * p.getPreco();
            }
        } else {
            throw new RuntimeException("A lista está vazia!");
        }

        return valorTotal;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;

        if(!estoqueProdutoMap.isEmpty()){
            for(Produto p : estoqueProdutoMap.values()){
                if(p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                }
            }
        }

        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;

        if(!estoqueProdutoMap.isEmpty()){
            for(Produto p : estoqueProdutoMap.values()){
                if(p.getPreco() < menorPreco){
                    produtoMaisBarato = p;
                }
            }
        }

        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto produtoMaiorQuantidadeValorTotalNoEstoque = null;
        double maiorValorTotalProdutoEstoque = 0d;
        if(!estoqueProdutoMap.isEmpty()){
            for(Map.Entry<Long, Produto> entry : estoqueProdutoMap.entrySet()){
                double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
                if (valorProdutoEmEstoque > maiorValorTotalProdutoEstoque){
                    maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
                    produtoMaiorQuantidadeValorTotalNoEstoque = entry.getValue();
                }
            }
        }

        return produtoMaiorQuantidadeValorTotalNoEstoque;
    }

    public static void main(String[] args) {

    }
}
