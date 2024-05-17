package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatoPorNome = new HashSet<>();
        for (Contato contato : contatoSet
        ) {
            if (contato.getNome().startsWith(nome)) {
                contatoPorNome.add(contato);
            }
        }
        return contatoPorNome;
    }

    public Contato AtualizaNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato contato : contatoSet
        ) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contato.setNumero(novoNumero);
                contatoAtualizado = contato;
                break;

            }
        }
        return contatoAtualizado;

    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Kauan", 988377936);
        agendaContatos.adicionarContato("Juliana", 988375436);
        agendaContatos.adicionarContato("Pedro Martins", 988376436);
        agendaContatos.adicionarContato("Pedro", 988236936);

        agendaContatos.exibirContato();
        System.out.println(agendaContatos.pesquisarPorNome("Pedro"));
        agendaContatos.AtualizaNumeroContato("Pedro", 999999999);
        agendaContatos.exibirContato();
    }
}
