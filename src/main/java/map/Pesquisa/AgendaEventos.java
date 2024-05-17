package main.java.map.Pesquisa;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate date, String nome, String atracao) {
        // Evento evento = new Evento(nome, atracao);
        eventoMap.put(date, new Evento(nome, atracao));
    }

    public void exibirAgendas() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento() {
//     Set<LocalDate> dateSet =  eventoMap.keySet();
//     Collection<Evento> values = eventoMap.values();

        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);

        for (Map.Entry<LocalDate, Evento> entry : eventoMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual)|| entry.getKey().isAfter(dataAtual));
            System.out.println("O proximo evento: "+ entry.getValue().getNome() + " será: "+ entry.getKey());
            break;
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JULY, 15), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 7, 9), "Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 5, 17), "Evento 3", "Atração 3");

        agendaEventos.exibirAgendas();

        agendaEventos.obterProximoEvento();
    }
}
