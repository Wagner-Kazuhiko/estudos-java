package com.estruturadedados.pilha;

public class Pilha {

    private int[] elementos;
    private int topo;

    public Pilha(int tamanho){
        this.elementos = new int[tamanho];
        this.topo = -1;
    }

    public void push(int n){
        if(isFull()){
            throw new RuntimeException("A pilha está cheia");
        }
        topo++;
        elementos[topo] = n;
    }

    public int pop(){
        if(isEmpty()){
            throw new java.util.EmptyStackException();
        }
        int n = elementos[topo];
        topo--;
        return n;
    }

    public int peek(){
        if(isEmpty()){
            throw new java.util.EmptyStackException();
        }
        return elementos[topo];
    }

    public boolean isEmpty(){
        return topo == -1;
    }

    public boolean isFull() {
        return  topo == elementos.length -1;
    }

    public int size(){
        return topo + 1;
    }

    public static void main(String[] args) {
        Pilha pilha = new Pilha(10);
        for (int i = 1; i <= 10; i++){
            pilha.push(i);
        }
        while (!pilha.isEmpty()){
            System.out.println(pilha.pop());
        }
        System.out.println("Tamanho da pilha: " + pilha.size());
    }
}
