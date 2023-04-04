package com.pucrs.psa.service;

import com.pucrs.psa.entidate.Estudante;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class EstudanteService {

    ArrayList<Estudante> listaEstudantes;

    public ArrayList<Estudante> cadastrarEstudante(String nome, int documento, String endereco){

        Estudante estudante = new Estudante(nome, documento, endereco);

        listaEstudantes.add(estudante);

        return listaEstudantes;
    }
}
