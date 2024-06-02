package org.example;


import java.util.*;
import java.util.stream.Collectors;

public class Checklist extends Tarefa {

    private List<Tarefa> listaTarefas = new ArrayList<>();


    public void addTarefa(Tarefa tarefa) {
        this.listaTarefas.add(tarefa);
    }

    public List<Tarefa> getTodasAsTarefas() {
        return this.listaTarefas;
    }

    public List<Tarefa> getTodasAsTarefasConcluidas() {

        List<Tarefa> tarefasConcluidas = listaTarefas.stream().filter(Tarefa::isConcluida)
                .collect(Collectors.toList());

        return tarefasConcluidas;

    }

    public List<Tarefa> getTodasAsTarefasPendentes() {

        List<Tarefa> tarefasPendentes = listaTarefas.stream().filter(tarefa -> !tarefa.isConcluida())
                .collect(Collectors.toList());
        return tarefasPendentes;
    }

    public void alterarStatusTarefa(int id, boolean status) {
        listaTarefas = listaTarefas.stream().map(tarefa -> {
            if (tarefa.getId() == id) {
                tarefa.setConcluida(status);
            }
            return tarefa;
        }).toList();
    }

    public List<Tarefa> getTodasAsTarefasOrdenadasPorConclusao() {


        List<Tarefa> listaOrdenada = new ArrayList<>();
        listaOrdenada.addAll(getTodasAsTarefasConcluidas());
        listaOrdenada.addAll(getTodasAsTarefasPendentes());
        listaOrdenada = listaOrdenada.stream().sorted(Comparator.comparing(Tarefa::getDescricao)).collect(Collectors.toList());
        return listaOrdenada;
    }

    public List<String> getTodasAsDescricoes() {
        String descricao;
        List<String> listDescricoes = new ArrayList<>();
        for (int i = 0; i <= listaTarefas.size() - 1; i++) {
            descricao = listaTarefas.get(i).getDescricao();
            listDescricoes.add(descricao);
        }

        return listDescricoes;
    }

}
