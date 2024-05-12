package main.java.list.OperacoesBasicas;

public class Tarefa implements Comparable<Tarefa>{
    //atributo
    private String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }


    @Override
    public int compareTo(Tarefa o) {
        return 0;
    }

    @Override
    public String toString() {
        return descricao ;
    }
}
