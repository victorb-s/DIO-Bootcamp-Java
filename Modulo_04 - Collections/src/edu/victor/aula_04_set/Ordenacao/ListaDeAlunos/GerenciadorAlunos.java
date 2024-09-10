package edu.victor.aula_04_set.Ordenacao.ListaDeAlunos;

import java.util.*;

public class GerenciadorAlunos {
    private Set<Aluno> gerenciadorSet;

    public GerenciadorAlunos() {
        this.gerenciadorSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double media) {
        gerenciadorSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula){
        Aluno alunoParaRemover = null;
        if(!gerenciadorSet.isEmpty()){
            for(Aluno aluno : gerenciadorSet){
                if(aluno.getMatricula() == matricula){
                    alunoParaRemover = aluno;
                    gerenciadorSet.remove(alunoParaRemover);
                    break;
                }
            }
        } else {
            throw new RuntimeException("Esse aluno não está na lista");
        }
    }

    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(gerenciadorSet);
        if(!gerenciadorSet.isEmpty()){
            return alunosPorNome;
        } else {
            throw new RuntimeException("Nenhum aluno foi encontrado");
        }
    }

    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(new CompararPorNota());
        alunosPorNota.addAll(gerenciadorSet);
        if(!gerenciadorSet.isEmpty()){
            return alunosPorNota;
        } else {
            throw new RuntimeException("Nenhum aluno foi encontrado");
        }
    }

    public void exibirAlunos(){
        if(!gerenciadorSet.isEmpty()){
            System.out.println(gerenciadorSet);
        } else {
            throw new RuntimeException("Nenhum aluno foi encontrado");
        }
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Aluno 1", 123L, 5);
        gerenciadorAlunos.adicionarAluno("Aluno 2", 456L, 9.5);
        gerenciadorAlunos.adicionarAluno("Aluno 3", 123L, 10);
        gerenciadorAlunos.adicionarAluno("Aluno 0", 789L, 9);
        gerenciadorAlunos.adicionarAluno("Aluno 10", 321L, 3);
        gerenciadorAlunos.adicionarAluno("Aluno 12", 654L, 10);

        gerenciadorAlunos.exibirAlunos();
        gerenciadorAlunos.removerAluno(456L);
        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());
    }
}
