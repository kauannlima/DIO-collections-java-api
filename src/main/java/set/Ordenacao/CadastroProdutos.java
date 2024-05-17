package main.java.set.Ordenacao;

import main.java.set.Pesquisa.Contato;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(Long codigo, String nome, double preco, int qtd){
        produtoSet.add(new Produto(codigo,nome,preco, qtd));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtoPorNome = new TreeSet<>(produtoSet);
        return produtoPorNome;

    }


    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
       produtoPorPreco.addAll(produtoSet);
       return  produtoPorPreco;

    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1L, "Produto 5", 15d, 5);
        cadastroProdutos.adicionarProduto(2L, "Produto 0", 20d, 10);
        cadastroProdutos.adicionarProduto(3L, "Produto 3", 10d, 2);
        cadastroProdutos.adicionarProduto(4L, "Produto 9", 2d, 2);

        System.out.println(cadastroProdutos.produtoSet+"\n");

        System.out.println(cadastroProdutos.exibirProdutosPorNome()+"\n");

        System.out.println(cadastroProdutos.exibirProdutosPorPreco()+"\n");
    }


}
