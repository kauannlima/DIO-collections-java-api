package main.java.list.Pesquisa;

import main.java.list.OperacoesBasicas.Tarefa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {
       livroList = new ArrayList<>();
    }

    public void adicionarLivros(String titulo, String author, int anoPublicacao){
        livroList.add(new Livro(titulo,author,anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String author){
       List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro l: livroList){
                if (l.getAuthor().equalsIgnoreCase(author)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAno = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro l: livroList){
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAno.add(l);
                }
            }
        }
        return livrosPorIntervaloAno;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()){
            for (Livro l: livroList){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo =  l;
                    break;
                }
            }

    }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivros("Livro 1", "Autor 1", 2020);
        catalogoLivros.adicionarLivros("Livro 1", "Autor 2", 2021);
        catalogoLivros.adicionarLivros("Livro 2", "Autor 2", 2022);
        catalogoLivros.adicionarLivros("Livro 3", "Autor 3", 2023);
        catalogoLivros.adicionarLivros("Livro 4", "Autor 4", 1994);
        System.out.println(   catalogoLivros.pesquisarPorAutor("Autor 4"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020, 2021));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));

    }
}
