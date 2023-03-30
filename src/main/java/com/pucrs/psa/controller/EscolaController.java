package com.pucrs.psa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EscolaController {

    @GetMapping("/")
    public String home() {
        return "Olá";
    }

    @PostMapping("/login")
    public void login(@RequestParam String email,
                      @RequestParam String senha){

    }

    @PostMapping("/logout")
    public void logout(@RequestParam String email){

    }


    @PostMapping("/cadastrarEstudante")
    public void cadastrarEstudante(@RequestParam String nome,
                                   @RequestParam int documento,
                                   @RequestParam String endereco) {
        //criar matricula unica
        //retornar matricula

    }

    @GetMapping("/consultar/{id}")
    public void consultarEstudante() {
        //ou por matricula ou por nome
    }

    @GetMapping("/consultarTodos")
    public void listarTodosEstudante() {
    }

    @PostMapping("/cadastrarDisciplina")
    public void cadastrarDisciplina
            (@RequestParam int codicoDisciplina,
             @RequestParam String nome,
             @RequestParam String horario,
             @RequestParam int turma) {
        //horario por codigo
    }

    @PostMapping("/matricularEsudanteDisciplina")
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

    @PostMapping("/cadastrarFuncionario/")
    public void cadastrarFuncionario(@RequestParam String nome,
                                     @RequestParam String email,
                                     @RequestParam String senha){

        //retorna mensagem de sucesso ou falha
    }
}
