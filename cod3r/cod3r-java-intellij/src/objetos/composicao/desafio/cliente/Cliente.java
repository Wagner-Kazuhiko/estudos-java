package objetos.composicao.desafio.cliente;

import objetos.composicao.desafio.utilidades.Compra;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    public String nome;
    public List<Compra> compras = new ArrayList<>();

    public Cliente(String nome){
        this.nome = nome;
    }

    public double obterValorTotal(){
        double total = 0;

        for (Compra compra : compras){
            total += compra.obterValorTotal();
        }

        return total;
    }


    
}
