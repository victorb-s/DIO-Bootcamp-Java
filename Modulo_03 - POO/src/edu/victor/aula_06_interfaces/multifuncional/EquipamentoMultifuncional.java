package edu.victor.aula_06_interfaces.multifuncional;

import edu.victor.aula_06_interfaces.copiadora.Copiadora;
import edu.victor.aula_06_interfaces.digitalizadora.Digitalizadora;
import edu.victor.aula_06_interfaces.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {
    public void copiar() {
        System.out.println("COPIANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }

    public void digitalizar() {
        System.out.println("DIGITALIZANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }

    public void imprimir() {
        System.out.println("IMPRIMINDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }
}
