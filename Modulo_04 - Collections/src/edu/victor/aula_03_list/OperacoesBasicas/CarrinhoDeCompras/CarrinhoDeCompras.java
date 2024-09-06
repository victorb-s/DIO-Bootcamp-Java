package edu.victor.aula_03_list.OperacoesBasicas.CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class CarrinhoDeCompras {
    private List<Item> carrinhoCompras;
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("Leite em pó", 4.50, 2);
        carrinho.adicionarItem("Mistura", 10, 4);
        carrinho.adicionarItem("Biscoito", 2.69, 10);
        carrinho.exibirItens();

        System.out.println("O valor total do carrinho é de: R$" + carrinho.calcularValorTotal());
        carrinho.removerItem("Biscoito");
        carrinho.exibirItens();
        System.out.println("O valor total do carrinho é de: R$" + carrinho.calcularValorTotal());
    }

    public CarrinhoDeCompras(){
        this.carrinhoCompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinhoCompras.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensRemovidos = new ArrayList<>();
        for (Item item : carrinhoCompras) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                itensRemovidos.add(item);
            }
        }

        carrinhoCompras.removeAll(itensRemovidos);
    }

    public double calcularValorTotal(){
        double valorTotal = 0;
        for (Item item : carrinhoCompras) {
            double valorItem = item.getPreco() * item.getQuantidade();
            valorTotal += valorItem;
        }
        return valorTotal;
    }

    public void exibirItens(){
        System.out.println(carrinhoCompras);
    }
}
