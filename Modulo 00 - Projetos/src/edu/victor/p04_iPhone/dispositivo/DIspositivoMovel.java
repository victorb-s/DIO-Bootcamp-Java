package edu.victor.p04_iPhone.dispositivo;

public class DIspositivoMovel {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone();

        iPhone.ligar("4002-8922");
        iPhone.atender();
        iPhone.iniciarCorreioVoz();

        iPhone.selecionarMusica("Manuel Gomes");
        iPhone.tocar();
        iPhone.pausar();

        iPhone.adicionarNovaAba();
        iPhone.exibirPagina("www.google.com");
        iPhone.atualizarPagina();
    }
}
