package edu.victor.aula_01_generics;

import java.util.*;

public class GenericsExampleList {
    public static void main(String[] args) {
        // Exemplo sem Generics
        List listaSemGenerics = new ArrayList();
        listaSemGenerics.add("Elemento 1");
        listaSemGenerics.add(10); // Permite qualquer tipo de objeto

        // Exemplo com Generics
        List<String> listaGenerics = new ArrayList<>();
        listaGenerics.add("Elemento 1");
        listaGenerics.add("Elemento 2");

        // Iterando sobre a lista com Generics
        for (String elemento : listaGenerics){
            System.out.println(elemento);
        }

        // Iterando sobre a lista sem Generics (necessário fazer cast)
        for (Object elemento : listaSemGenerics){
            String str = (String) elemento;
            System.out.println(str);
        }
    }
}
