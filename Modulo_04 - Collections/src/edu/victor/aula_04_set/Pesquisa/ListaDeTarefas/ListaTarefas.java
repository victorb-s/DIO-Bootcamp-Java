package edu.victor.aula_04_set.Pesquisa.ListaDeTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        if(!tarefaSet.isEmpty()){
            for(Tarefa tarefa : tarefaSet){
                if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                    tarefaSet.remove(tarefa);
                    break;
                }
            }
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirTarefas(){
        System.out.println(tarefaSet);
    }

    public int contarTarefas(){
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        if(!tarefaSet.isEmpty()){
            for(Tarefa tarefa : tarefaSet){
                if(tarefa.isEstadoTarefa()){
                    tarefasConcluidas.add(tarefa);
                }
            }
        } else {
            throw new RuntimeException("A lista esta vazia!");
        }

        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        if(!tarefaSet.isEmpty()){
            for(Tarefa tarefa : tarefaSet){
                if(!tarefa.isEstadoTarefa()){
                    tarefasPendentes.add(tarefa);
                }
            }
        } else {
            throw new RuntimeException("A lista esta vazia!");
        }

        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        Tarefa tarefaParaConcluir = null;
        if(!tarefaSet.isEmpty()){
            for(Tarefa tarefa : tarefaSet){
                if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                    tarefaParaConcluir = tarefa;
                    tarefaParaConcluir.setEstadoTarefa(true);
                    break;
                }
            }
        } else {
            throw new RuntimeException("A lista esta vazia!");
        }
    }

    public void marcarTarefaPendente(String descricao){
        Tarefa tarefaParaPendente = null;
        if(!tarefaSet.isEmpty()) {
            for (Tarefa tarefa : tarefaSet) {
                if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                    if (tarefa.isEstadoTarefa()) {
                        tarefaParaPendente = tarefa;
                        tarefaParaPendente.setEstadoTarefa(false);
                        break;
                    }
                }
            }
        } else {
            throw new RuntimeException("A lista esta vazia!");
        }
    }

    public void limparListaTarefas(){
        if(!tarefaSet.isEmpty()){
            tarefaSet.clear();
        } else {
            throw new RuntimeException("A lista esta vazia!");
        }
    }

public static void main(String[] args) {
    ListaTarefas listaTarefa = new ListaTarefas();
    listaTarefa.adicionarTarefa("Fazer um bolo");
    listaTarefa.adicionarTarefa("Criar um CRUD");

    listaTarefa.exibirTarefas();

    System.out.println(listaTarefa.contarTarefas());

    listaTarefa.marcarTarefaConcluida("criar um crud");
    System.out.println(listaTarefa.obterTarefasConcluidas());
    System.out.println(listaTarefa.obterTarefasPendentes());

    listaTarefa.limparListaTarefas();
    listaTarefa.exibirTarefas();
    }
}
