package edu.victor.aula_03_construtores;

public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa marcos = new Pessoa(
                "123",
                "Marcos"
        );

        marcos.setEndereco("Rua das Marias");

        System.out.println(marcos.getNome() + "-" + marcos.getCpf());
    }
}
