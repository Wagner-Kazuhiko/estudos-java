package com.loiane.exercicios.aula25.classesmetodos.exer01;

public class Lampada {

    String modelo;
    String tensao;
    int potencial;
    String cor;
    String tipoLuz;
    int garantiaMeses;
    String[] tipos;
    boolean abajur;

    boolean ligada;

    void ligar(){
        ligada = true;
    }

    void desligar(){
        ligada = false;
    }

    void mostrarEstado(){

        if (ligada){
            System.out.println("Lâmpada está ligada");
        }
        else {

            System.out.println("Lâmpada está desligada");
        }
    }

    void mudarEstado(){
        if (ligada){
            desligar();
        }
        else {
            ligar();
        }
    }
}
