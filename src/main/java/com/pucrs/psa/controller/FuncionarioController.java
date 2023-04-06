package com.pucrs.psa.controller;

import com.pucrs.psa.entidate.Estudante;
import com.pucrs.psa.entidate.Funcionario;
import com.pucrs.psa.service.DisciplinaService;
import com.pucrs.psa.service.EstudanteService;
import com.pucrs.psa.service.FuncionarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class FuncionarioController {

    DisciplinaService disciplinaService;
    EstudanteService estudanteService;

    FuncionarioService funcionarioService;

    @GetMapping("/matricularEsudanteDisciplina/{codicoDisciplina}/{turma}/{matricula}")
    public String matricularEstudanteDisciplina(@PathVariable int codicoDisciplina,
                                                @PathVariable int turma,
                                                @PathVariable int matricula) {

        return disciplinaService.matricularAluno(codicoDisciplina, turma, matricula);
    }

    @GetMapping("/consultarMatricula/{matricula}")
    public Estudante consultarDisciplinasMatriculado(@PathVariable int matricula) {
        return estudanteService.encontraAlunoMatricula(matricula);
    }


    @GetMapping("/cadastrarFuncionario/")
    public Funcionario cadastrarFuncionario(@RequestParam String nome,
                                            @RequestParam String email,
                                            @RequestParam String senha) {

        return funcionarioService.cadastrarFuncionario(nome, email, senha);
    }

}
