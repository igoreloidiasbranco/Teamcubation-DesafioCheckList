package org.example;

public class Tarefa {

    private int id;
    private String descricao;
    private boolean concluida;

    public void alterarStatusTarefa(int id, boolean status) {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }


    public boolean isConcluida() {
        return this.concluida;
    }
}