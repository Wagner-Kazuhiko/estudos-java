package com.testesArrays;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private String nome;
    private ArrayList disciplinas;

    public Curso(String nome){
        this.nome = nome;
        this.disciplinas = new ArrayList<>();
    }

    public String getNome(){
        return this.nome;
    }

    public void addDisciplina(String nomeDisc){
        disciplinas.add(nomeDisc);
    }

    public String toString(){
        return "Curso: " + this.nome + "\n" + " Disciplinas:" + disciplinas;
    }
}
