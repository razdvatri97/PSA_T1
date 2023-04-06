package com.pucrs.psa.service;

import com.pucrs.psa.entidate.Estudante;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class EstudanteService {

    ArrayList<Estudante> listaEstudantes;


     public EstudanteService(ArrayList<Estudante> listaEstudantes) {
        this.listaEstudantes = listaEstudantes;
    }

    public Estudante cadastrarEstudante(String nome, int documento, String endereco){

         Estudante estudante = new Estudante(nome.toLowerCase(), documento, endereco.toLowerCase());
         listaEstudantes.add(estudante);

        return estudante;
    }

    public Estudante consultarEstudante(String nome) {

            for (Estudante estudante : listaEstudantes) {
                if (estudante.getNome().equals(nome.toLowerCase()))
                    return estudante;
            }
        return null;
    }

    public ArrayList<Estudante> consultarTodosEstudantes() {
         return listaEstudantes;
    }

    public Estudante encontraAlunoMatricula(int matricula) {
         for (Estudante estudante: listaEstudantes){
             if (matricula == estudante.getMatricula())
                 return estudante;
         }
         return null;
    }
}
