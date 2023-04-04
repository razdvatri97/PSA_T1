package com.pucrs.psa.service;

import com.pucrs.psa.entidate.Disciplina;
import com.pucrs.psa.entidate.Estudante;

import java.util.ArrayList;

public class DisciplinaService {

    ArrayList<Disciplina> listaDisciplinas;

    public ArrayList<Disciplina> cadastrarDisciplina(int codigoDisciplina, String nome, String horario, int turma){



        Disciplina disciplina = new Disciplina(codigoDisciplina, nome, horario, turma);


        listaDisciplinas.add(disciplina);

        return listaDisciplinas;

    }
}
