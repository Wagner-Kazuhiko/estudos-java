package com.testesArrays;

public class testaCurso {
    public static void main(String[] args) {

        Curso c1 = new Curso ("Ciência da Computação");
        c1.addDisciplina("AlgProgII");
        c1.addDisciplina("SO");
        c1.addDisciplina("Grafos");
        System.out.println(c1);
    }
}
