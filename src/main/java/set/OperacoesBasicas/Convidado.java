package main.java.set.OperacoesBasicas;

import java.util.Objects;

public class Convidado {

    private String nome;

    private int codigoConvite;

    public Convidado(String nome, int codigoConvidado) {
        this.nome = nome;
        this.codigoConvite = codigoConvidado;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", codigoConvidado=" + codigoConvite +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Convidado convidado)) return false;
        return getCodigoConvite() == convidado.getCodigoConvite();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigoConvite());
    }
}
