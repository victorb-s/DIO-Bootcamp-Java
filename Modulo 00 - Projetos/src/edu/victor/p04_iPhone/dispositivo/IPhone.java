package edu.victor.p04_iPhone.dispositivo;

import edu.victor.p04_iPhone.telefone.AparelhoTelefonico;
import edu.victor.p04_iPhone.navegador.NavegadorNaInternet;
import edu.victor.p04_iPhone.musica.ReprodutorMusical;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet {
    public static void main(String[] args) {

    }

    @Override
    public void ligar(String numero) {
        System.out.printf("LIGANDO ATRAVÉS DO TELEFONE PARA O NÚMERO %s\n", numero);
    }

    @Override
    public void atender() {
        System.out.println("ATENDENDO TELEFONE");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO MENSAGEM DO CORREIO DE VOZ");
    }


    @Override
    public void tocar() {
        System.out.println("TOCANDO MÚSICA");
    }

    @Override
    public void pausar() {
        System.out.println("PAUSANDO MÚSICA");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.printf("SELECIONANDO MÚSICA %s\n", musica);
    }

    @Override
    public void exibirPagina(String url) {
        System.out.printf("EXIBINDO PÁGINA %s\n", url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("CRIANDO NOVA ABA");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO A PÁGINA");
    }
}
