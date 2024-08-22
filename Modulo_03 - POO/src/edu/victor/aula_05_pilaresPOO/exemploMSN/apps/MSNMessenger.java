package edu.victor.aula_05_pilaresPOO.exemploMSN.apps;

// Herança
public class MSNMessenger extends ServicoMensagemInstantanea {
    // Abstração
    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo MSN Messenger");
    }

    @Override
    public void receberMensagem() {
        validarConectadoInternet();
        System.out.println("Recebendo mensagem pelo MSN Messenger");
    }
}
