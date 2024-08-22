package edu.victor.aula_05_pilaresPOO.exemploMSN;

import edu.victor.aula_05_pilaresPOO.exemploMSN.apps.FacebookMessenger;
import edu.victor.aula_05_pilaresPOO.exemploMSN.apps.MSNMessenger;
import edu.victor.aula_05_pilaresPOO.exemploMSN.apps.ServicoMensagemInstantanea;
import edu.victor.aula_05_pilaresPOO.exemploMSN.apps.Telegram;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;
        /* NÃO SE SABE QUAL APP
           MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
         */
        String appEscolhido = "msn";

        // Polimorfismo
        if(appEscolhido.equals("msn")){
            smi = new MSNMessenger();
        }
        else if(appEscolhido.equals("fbm")){
            smi = new FacebookMessenger();
        }
        else if(appEscolhido.equals("tlg")){
            smi = new Telegram();
        }

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
