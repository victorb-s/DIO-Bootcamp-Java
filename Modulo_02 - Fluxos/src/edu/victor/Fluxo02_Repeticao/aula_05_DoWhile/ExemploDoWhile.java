package edu.victor.Fluxo02_Repeticao.aula_05_DoWhile;
import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {
        do{
            System.out.println("Discando...");
        }
        while(tocando());

        System.out.println("Alô!");
    }

    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu? " + atendeu);
        return !atendeu;
    }
}
