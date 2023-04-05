package com.pucrs.psa.controller;

import com.pucrs.psa.entidate.Estudante;
import com.pucrs.psa.service.EstudanteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequiredArgsConstructor
public class EscolaController {

    private final EstudanteService estudanteService;

    @GetMapping(value= "/")
    public String home() {
        return "Olá";
    }

    @GetMapping(value = "/cadastrarEstudante")
    public ArrayList<Estudante> cadastrarEstudante(@RequestParam (value="nome") String nome,
                                                   @RequestParam (value="documento") int documento,
                                                   @RequestParam (value="endereco")String endereco) {

        return  estudanteService.cadastrarEstudante (nome, documento, endereco);
    }

    @ResponseBody
    @GetMapping(value="/consultar/{nome}")
    public Estudante consultarEstudante(@PathVariable String nome) {
        return estudanteService.consultarEstudante(nome);
    }

    @GetMapping(value="/consultarTodosEstudantes")
    public ArrayList<Estudante> consultarTodosEstudantes() {
        return estudanteService.consultarTodosEstudantes();
    }

    @GetMapping(value="/cadastrarDisciplina")
    public void cadastrarDisciplina
            (@RequestParam int codicoDisciplina,
             @RequestParam String nome,
             @RequestParam String horario,
             @RequestParam int turma) {
        //horario por codigo
    }

    @GetMapping("/matricularEsudanteDisciplina")
    public void matricularEstudanteDisciplina(@RequestParam String codicoDisciplina,
                                              @RequestParam int turma,
                                              @RequestParam String matricula){
        //retorna mensagem de matriculado ou nao

    }

    @GetMapping("/consultarMatricula/{id}")
    public void consultarDisciplinasMatriculado(){
        //listar Disciplinas do aluno
    }

    @GetMapping("/consultarDisciplina/{codicoDisciplina}/{turma}")
    public void consultarAlunosDisciplina(){
        //listar alunos matriculados em uma determinada disciplina e turma
    }

    @GetMapping("/cadastrarFuncionario/")
    public void cadastrarFuncionario(@RequestParam String nome,
                                     @RequestParam String email,
                                     @RequestParam String senha){

        //retorna mensagem de sucesso ou falha
    }

    @GetMapping(value= "/login")
    public void login(@RequestParam String email,
                      @RequestParam String senha){

    }

    @GetMapping(value="/logout")
    public void logout(@RequestParam String email){

    }
}
