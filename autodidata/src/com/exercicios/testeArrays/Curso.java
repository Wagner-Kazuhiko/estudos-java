package com.exercicios.testeArrays;

import java.util.ArrayList;

public class Curso {

    private String nome;
    private ArrayList disciplinas;

    public Curso(String nome){
        this.nome = nome;
        this.disciplinas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void addDisciplina(String disciplina){
        disciplinas.add(disciplina);
    }

    public String toString(){
        return "Curso: " + this.nome + "\nDisciplinas: " + disciplinas;
    }


}
