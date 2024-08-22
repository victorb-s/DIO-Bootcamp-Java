package edu.victor.aula_05_pilaresPOO.exemploAutodromo;

// Classe pai na herança
public abstract class Veiculo {
    private String chassi;

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public abstract void ligar();
}
