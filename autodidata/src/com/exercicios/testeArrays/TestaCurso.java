package com.exercicios.testeArrays;

public class TestaCurso {
    public static void main(String[] args) {

        Curso c1 = new Curso("Ciencia da Computacao");
        c1.addDisciplina("AlgProgII");
        c1.addDisciplina("SO");
        c1.addDisciplina("Grafos");
        System.out.println(c1);
    }
}
