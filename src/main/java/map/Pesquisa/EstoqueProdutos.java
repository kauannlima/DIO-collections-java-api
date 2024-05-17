package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int qtd, double preco) {
        estoqueProdutosMap.put(cod, new Produto(nome, qtd, preco));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                valorTotalEstoque += p.getQtd() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() < menorPreco){
                    produtoMaisBarato = p;
                    menorPreco = produtoMaisBarato.getPreco();
                }
            }
        }
        return produtoMaisBarato;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.exibirProdutos();

        estoqueProdutos.adicionarProduto(1L, "Produtoa A", 10, 5.0);
        estoqueProdutos.adicionarProduto(2L, "Produtoa B", 5, 10.0);
        estoqueProdutos.adicionarProduto(3L, "Produtoa C", 2, 15.0);

        estoqueProdutos.exibirProdutos();

        System.out.println("Valor total do estoque R$ "+ estoqueProdutos.calcularValorTotalEstoque());
        System.out.println("Produto mais caro:  "+ estoqueProdutos.obterProdutoMaisCaro());
        System.out.println("Produto mais barato:  "+ estoqueProdutos.obterProdutoMaisBarato());
    }
}
