package com.pucrs.psa.service;

import com.pucrs.psa.entidate.Estudante;

import java.util.ArrayList;
import java.util.Random;

public class EstudanteService {

    ArrayList<Estudante> listaEstudantes;

    public ArrayList<Estudante> cadastrarEstudante(String nome, int documento, String endereco){

        String matricula ="randomizar";


        Estudante estudante = new Estudante(nome, documento, endereco, matricula);


        listaEstudantes.add(estudante);

        return listaEstudantes;

    }
}
