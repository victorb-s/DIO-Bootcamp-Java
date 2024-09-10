package edu.victor.aula_04_set.Pesquisa.ListaDeTarefas;

import java.util.Objects;

public class Tarefa {
    private String descricao;
    private boolean estadoTarefa;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.estadoTarefa = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isEstadoTarefa() {
        return estadoTarefa;
    }

    public void setEstadoTarefa(boolean estadoTarefa) {
        this.estadoTarefa = estadoTarefa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tarefa tarefa = (Tarefa) o;
        return Objects.equals(getDescricao(), tarefa.getDescricao());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getDescricao());
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", estadoTarefa=" + estadoTarefa +
                '}';
    }
}
