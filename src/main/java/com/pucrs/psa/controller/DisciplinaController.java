package com.pucrs.psa.controller;

import com.pucrs.psa.entidate.Disciplina;
import com.pucrs.psa.entidate.Estudante;
import com.pucrs.psa.service.DisciplinaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequiredArgsConstructor
public class DisciplinaController {

    private final DisciplinaService disciplinaService;

    @GetMapping(value = "/cadastrarDisciplina")
    public Disciplina cadastrarDisciplina
            (@RequestParam int codicoDisciplina,
             @RequestParam String nome,
             @RequestParam String horario,
             @RequestParam int turma) {

        return disciplinaService.cadastrarDisciplina(codicoDisciplina, nome, horario, turma);
    }


    @GetMapping("/consultarDisciplina/{codicoDisciplina}/{turma}")
    public ArrayList<Estudante> consultarDisciplinaMatriculados(@PathVariable int codicoDisciplina,
                                                                @PathVariable int turma) {

        return disciplinaService.consultarDisciplinaMatriculados(codicoDisciplina, turma);
    }
}
