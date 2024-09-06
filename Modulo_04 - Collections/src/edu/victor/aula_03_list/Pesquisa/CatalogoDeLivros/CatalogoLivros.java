package edu.victor.aula_03_list.Pesquisa.CatalogoDeLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> listaLivros;

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2021);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 1994);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));
        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 4"));

        System.out.println("\n---------------------\n");

        System.out.println(catalogoLivros.pesquisarPorIntervaloAno(2020, 2022));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));

    }

    public CatalogoLivros() {
        this.listaLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int ano){
        listaLivros.add(new Livro(titulo, autor, ano));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!listaLivros.isEmpty()){
            for(Livro livro : listaLivros){
                if(livro.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(livro);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAno(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!listaLivros.isEmpty()){
            for(Livro livro : listaLivros){
                if(livro.getAno() >= anoInicial && livro.getAno() <= anoFinal){
                    livrosPorIntervaloAnos.add(livro);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!listaLivros.isEmpty()){
            for(Livro livro : listaLivros){
                if(livro.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = livro;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }
}
