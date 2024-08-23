package edu.victor.aula_06_interfaces.estabelecimento;

import edu.victor.aula_06_interfaces.copiadora.Copiadora;
import edu.victor.aula_06_interfaces.digitalizadora.Digitalizadora;
import edu.victor.aula_06_interfaces.digitalizadora.Scanner;
import edu.victor.aula_06_interfaces.impressora.Deskjet;
import edu.victor.aula_06_interfaces.impressora.Impressora;
import edu.victor.aula_06_interfaces.impressora.Laserjet;
import edu.victor.aula_06_interfaces.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        Impressora impressora = new Deskjet();
        impressora.imprimir();

        Impressora impressora2 = new Laserjet();
        impressora2.imprimir();

        Impressora impressora3 = new EquipamentoMultifuncional();
        impressora3.imprimir();

        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        Impressora impressoraEM = em;
        Digitalizadora digitalizadoraEM = em;
        Copiadora copiadoraEM = em;

        impressoraEM.imprimir();
        digitalizadoraEM.digitalizar();
        copiadoraEM.copiar();

        Scanner scanner = new Scanner();
        // Scanner máquina, não do java util. Cuidado com as importações.
    }
}
