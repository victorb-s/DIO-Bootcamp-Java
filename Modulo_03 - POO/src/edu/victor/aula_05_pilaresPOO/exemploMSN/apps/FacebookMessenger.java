package edu.victor.aula_05_pilaresPOO.exemploMSN.apps;

public class FacebookMessenger extends ServicoMensagemInstantanea {

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Facebook Messenger");
    }

    @Override
    public void receberMensagem() {
        validarConectadoInternet();
        System.out.println("Recebendo mensagem pelo Facebook Messenger");
    }
}
