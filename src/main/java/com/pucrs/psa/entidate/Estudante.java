package com.pucrs.psa.entidate;

import java.util.concurrent.atomic.AtomicInteger;

public class Estudante {

    String nome;
    int documento;
    String endereco;

    int matricula;


    public Estudante(String nome, int documento, String endereco ) {
        this.nome = nome;
        this.documento = documento;
        this.endereco = endereco;
        this.matricula = getIncremento();
    }

    private int getIncremento() {
        AtomicInteger matricula = new AtomicInteger();
        matricula.addAndGet(1);
        return matricula.get();
    }

    public Estudante() {
    }

    public String getNome() {
        return nome;
    }

    public int getDocumento() {
        return documento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getMatricula() {
        return matricula;
    }
}
