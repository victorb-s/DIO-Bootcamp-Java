package edu.victor.aula_05_pilaresPOO;

// Herança = classes filhas estendendo da classe pai
public class Carro extends Veiculo{
    public void ligar(){
        // Encapsulamento = "esconder" ações do usuário final
        confereCambio();
        confereCombustivel();
        System.out.println("CARRO LIGADO");
    }

    private void confereCombustivel(){
        System.out.println("CONFERINDO COMBUSTIVEL");
    }

    private void confereCambio(){
        System.out.println("CONFERINDO CAMBIO EM P");
    }
}
