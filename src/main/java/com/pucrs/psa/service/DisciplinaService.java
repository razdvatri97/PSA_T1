package com.pucrs.psa.service;

import com.pucrs.psa.entidate.Disciplina;
import com.pucrs.psa.entidate.Estudante;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class DisciplinaService {

    ArrayList<Disciplina> listaDisciplinas;

    EstudanteService estudanteService;

    public Disciplina cadastrarDisciplina(int codigoDisciplina, String nome, String horario, int turma) {

        Disciplina disciplina = new Disciplina(codigoDisciplina, nome, horario, turma);
        listaDisciplinas.add(disciplina);

        return disciplina;
    }

    public ArrayList<Estudante> consultarDisciplinaMatriculados(int codicoDisciplina, int turma) {

        for (Disciplina disciplina : listaDisciplinas) {
            if (disciplina.getTurma() == turma && disciplina.getCodigoDisciplina() == codicoDisciplina)
                return disciplina.getMatriculados();
        }

        return null;
    }

    public String matricularAluno(int codicoDisciplina, int turma, int matricula) {

        for (Disciplina disciplina : listaDisciplinas) {
            if (disciplina.getTurma() == turma && disciplina.getCodigoDisciplina() == codicoDisciplina)
                disciplina.setMatriculados(estudanteService.encontraAlunoMatricula(matricula));
            return "Aluno: "+ estudanteService.encontraAlunoMatricula(matricula).getNome()+
                    " matriculado na disciplina: "+disciplina.getNome()+
                    " no horário: "+disciplina.getHorario()+
                    " na turma: "+disciplina.getTurma()+".";
        }
        return null;
    }
}
