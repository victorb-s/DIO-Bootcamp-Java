package edu.victor.aula_05_pilaresPOO.exemploAutodromo;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("897897");
        jeep.ligar();

        Moto yamaha = new Moto();
        yamaha.setChassi("46774");
        yamaha.ligar();

        // Polimorfismo = Classe funciona de acordo com as especificações a quais ela é atribuida
        Veiculo coringa = yamaha;
        coringa.ligar();

    }
}
