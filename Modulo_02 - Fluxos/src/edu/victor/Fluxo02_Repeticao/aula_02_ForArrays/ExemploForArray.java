package edu.victor.Fluxo02_Repeticao.aula_02_ForArrays;

public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = {"VICTOR", "ISABEL", "PEDRO"};

        for(int i=0; i < alunos.length; i++){
            System.out.println("O aluno no índice " + i + " é: " + alunos[i]);
        }

        // ForEach

        for(String aluno : alunos){
            System.out.println("Nome do aluno é: " + aluno);
        }
    }
}
