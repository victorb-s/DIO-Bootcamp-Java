package edu.victor.projeto_SmartTV;

public class SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 20;

    public void ligar(){
        ligada = true;
        System.out.println("TV Ligada");
    }

    public void desligar(){
        ligada = false;
        System.out.println("TV Desligada");
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando volume para: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo volume para: " + volume);
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Canal trocado para: " + canal);
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("Canal trocado para: " + canal);
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("Canal trocado para: " + canal);
    }
}

