package com.pucrs.psa.entidate;

public class Estudante {

    String nome;
    int documento;
    String endereco;

    String matricula;


    public Estudante(String nome, int documento, String endereco, String matricula) {
        this.nome = nome;
        this.documento = documento;
        this.endereco = endereco;
        this.matricula = matricula;
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
}
