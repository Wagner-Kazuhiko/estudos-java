package objetos.composicao.desafio.utilidades;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    List<Item> itens = new ArrayList<>();

    public void adicionarItem(Produto p, int qtde){
        this.itens.add(new Item(p, qtde));
    }

    public void adicionarItem(String nome, double preco, int qtde){
        this.itens.add(new Item(new Produto(nome, preco), qtde));
    }

    public double obterValorTotal(){
        double total = 0;

        for (Item item : itens){
            total += item.quantidade * item.produto.preco;
        }
        return total;
    }

}
