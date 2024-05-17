package main.java.set.OperacoesBasicas;

import main.java.list.OperacoesBasicas.CarrinhoDeCompras;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidado() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado convidado : convidadoSet) {
            if (convidado.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = convidado;

                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibeConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidado conjuntoConvidado = new ConjuntoConvidado();

        System.out.println("Existe "+ conjuntoConvidado.contarConvidados() + " dentro do Set de Convidados");

        conjuntoConvidado.adicionarConvidado("Convidado 1", 1234);
        conjuntoConvidado.adicionarConvidado("Convidado 2", 1235);
        conjuntoConvidado.adicionarConvidado("Convidado 3", 1236);
        conjuntoConvidado.adicionarConvidado("Convidado 4", 1237);

        System.out.println("Existe "+ conjuntoConvidado.contarConvidados() + " dentro do Set de Convidados");

        conjuntoConvidado.exibeConvidados();
        conjuntoConvidado.removerConidadoPorCodigoConvite(1234);
        conjuntoConvidado.exibeConvidados();
    }

}
