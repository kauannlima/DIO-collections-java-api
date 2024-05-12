package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Itens> carrinhoDeCompras;

    public CarrinhoDeCompras() {
        this.carrinhoDeCompras = new ArrayList<>();
    }

    public void adicionarItens(String nome, double preco, int qtd) {
        carrinhoDeCompras.add(new Itens(nome, preco, qtd ));
    }

    public void removeItens(String nome){
        List<Itens> itensParaRomover = new ArrayList<>();
        for (Itens i: carrinhoDeCompras) {
            if (i.getNome().equalsIgnoreCase(nome)){
                itensParaRomover.add(i);
            }
        }
        carrinhoDeCompras.removeAll(itensParaRomover);
    }

    public void calcularValorTotal(){
      double total = 0;
      for (Itens i: carrinhoDeCompras){
          double preco = i.getPreco();
          int quantidade = i.getQuantidade();
          total += (preco * quantidade);
      }

    System.out.println("O valor total do carrinho de compras é: "+ total);
    }

    public void obterItensNoCarrinho(){
        System.out.println(carrinhoDeCompras);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.obterItensNoCarrinho();
        carrinhoDeCompras.adicionarItens("Notebook", 1,1);
        carrinhoDeCompras.adicionarItens("Smartphone", 2,2);
        carrinhoDeCompras.adicionarItens("Ipad", 3,4);
        carrinhoDeCompras.adicionarItens("Mouse", 2,10);
        carrinhoDeCompras.adicionarItens("Keyboard", 3,10);
        carrinhoDeCompras.obterItensNoCarrinho();
        carrinhoDeCompras.removeItens("Ipad");
        carrinhoDeCompras.obterItensNoCarrinho();
        carrinhoDeCompras.calcularValorTotal();
    }
}
