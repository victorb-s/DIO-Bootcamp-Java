package edu.victor.aula_04_set.Pesquisa;

import java.util.*;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        if(!contatoSet.isEmpty()){
            for(Contato c : contatoSet){
                if(c.getNome().startsWith(nome)){
                    contatosPorNome.add(c);
                }
            }

            return contatosPorNome;
        } else {
            throw new RuntimeException("Não existem contatos com este nome");
        }
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        if(!contatoSet.isEmpty()){
            for(Contato c : contatoSet){
                if(c.getNome().equalsIgnoreCase(nome)){
                    contatoAtualizado = c;
                    c.setNumero(novoNumero);
                    break;
                }
            }

            return contatoAtualizado;
        } else {
            throw new RuntimeException("Não existe este contato");
        }
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

//        agenda.exibirContatos();

        agenda.adicionarContato("Camila", 123456);
        agenda.adicionarContato("Camila", 789);
        agenda.adicionarContato("Camila Cavalcante", 987654321);
        agenda.adicionarContato("Camila DIO", 3123);
        agenda.adicionarContato("Maria Silva", 111111111);

        agenda.exibirContatos();

        System.out.println(agenda.pesquisarPorNome("Camila"));
        System.out.println("Contato atualizado: " + agenda.atualizarNumeroContato("Camila", 123));

        agenda.exibirContatos();
    }
}
