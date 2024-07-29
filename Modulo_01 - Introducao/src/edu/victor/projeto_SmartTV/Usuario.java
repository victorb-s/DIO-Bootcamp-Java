package edu.victor.projeto_SmartTV;

public class Usuario {
    public static void main(String[] args) {
        SmartTV smartTV = new SmartTV();

        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.aumentarVolume();

        System.out.println("A televisão está ligada? " + smartTV.ligada);
        System.out.println("O canal atual é: " + smartTV.canal);
        System.out.println("O volume da televisão está em: " + smartTV.volume);

        System.out.println("\n--------------\n");
        smartTV.ligar();
        System.out.println("A televisão está ligada? " + smartTV.ligada);

        System.out.println("\n--------------\n");
        smartTV.desligar();
        smartTV.mudarCanal(13);
        System.out.println("O canal atual é: " + smartTV.canal);
        System.out.println("A televisão está ligada? " + smartTV.ligada);


    }
}
