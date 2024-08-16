package edu.victor.aula_00_introducao;

import java.awt.*;

public class Escola {
    public static void main(String[] args) throws Exception{
        Estudante estudante1 = new Estudante();
        estudante1.nome = "Victor";
        estudante1.idade = 18;
        estudante1.color = Color.BLACK;
//      estudante1.sex = Sex.MALE;

        Estudante estudante2 = new Estudante();
        estudante2.nome = "Isabel";
        estudante2.idade = 17;
        estudante2.color = Color.black;
//      estudante1.sex = Sex.FEMALE;

        Estudante estudante3 = new Estudante();
        estudante3.nome = "Pedro";
        estudante3.idade = 17;
        estudante3.color = Color.BLACK;
//      estudante1.sex = Sex.MALE;
    }
}
