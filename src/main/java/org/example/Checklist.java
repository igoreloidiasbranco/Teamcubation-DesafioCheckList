package org.example;


import java.util.*;

public class Checklist extends Tarefa{

    private List<Tarefa> listaTarefas = new ArrayList<>();

    public void addTarefa(Tarefa tarefa) {
        this.listaTarefas.add(tarefa);
    }

    public List<Tarefa> getTodasAsTarefas() {
        return this.listaTarefas;
    }

    public List<Tarefa> getTodasAsTarefasConcluidas(){
        return this.listaTarefas;
    }

    public List<Tarefa> getTodasAsTarefasPendentes() {

        // preciso corrigir, preferencia usar o Stream
        return this.listaTarefas;
    }

    public List<Tarefa> getTodasAsTarefasOrdenadasPorConclusao() {
        // preciso corrigir, preferencia usar o Stream
        return this.listaTarefas;
    }

    public List<String> getTodasAsDescricoes() {

        // preciso corrigir
        List<String> listaString = new ArrayList<String>();
         return listaString;


    }

}
