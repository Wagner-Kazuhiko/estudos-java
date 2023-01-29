package objetos.composicao.desafio;

import objetos.composicao.desafio.cliente.Cliente;
import objetos.composicao.desafio.utilidades.Compra;
import objetos.composicao.desafio.utilidades.Produto;

public class Sistema {

    public static void main(String[] args) {


        Compra compra1 = new Compra();
        compra1.adicionarItem("Caneta", 9.67, 100);
        compra1.adicionarItem(new Produto("Notebook", 1897.88), 2);

        Compra compra2 = new Compra();
        compra2.adicionarItem("Caderno", 10.00, 10);
        compra2.adicionarItem(new Produto("Impressora", 998.88), 1);

        Cliente cliente = new Cliente("Maria Julia Morgana");
        cliente.compras.add(compra1);
        cliente.compras.add(compra2);

        System.out.println(cliente.obterValorTotal());
    }
}
