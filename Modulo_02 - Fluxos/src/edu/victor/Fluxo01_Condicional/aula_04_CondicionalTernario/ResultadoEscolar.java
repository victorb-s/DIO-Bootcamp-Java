package edu.victor.Fluxo01_Condicional.aula_04_CondicionalTernario;

public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;

        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
    }
}
