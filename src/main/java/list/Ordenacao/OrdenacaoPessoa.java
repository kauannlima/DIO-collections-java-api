package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {

    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura) );
    }

    public List<Pessoa> ordenadoPorIdade(){
        List<Pessoa> pessoaPorIdade =new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorIdade);
        return pessoaPorIdade;
    }

    public List<Pessoa> ordenadoPorAltura(){
        List<Pessoa> pessoaPorAltura =new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
        return pessoaPorAltura;
    }

    public static void main(String[] args) {
       OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
       ordenacaoPessoa.adicionarPessoa("Kauan", 20, 1.56);
       ordenacaoPessoa.adicionarPessoa("Juliana", 30, 1.80);
       ordenacaoPessoa.adicionarPessoa("Malu", 25, 1.70);
       ordenacaoPessoa.adicionarPessoa("Pedro", 17, 1.56);

        System.out.println(ordenacaoPessoa.ordenadoPorIdade());
       System.out.println(ordenacaoPessoa.ordenadoPorAltura());

    }
}
