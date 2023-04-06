package com.pucrs.psa.controller;

import com.pucrs.psa.entidate.Estudante;
import com.pucrs.psa.service.EstudanteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequiredArgsConstructor
public class EstudanteController {

    private final EstudanteService estudanteService;

    @GetMapping(value = "/")
    public String home() {
        return "Olá, para acessar o swagger: http://localhost:8080/swagger-ui.html";
    }


    @GetMapping(value = "/consultar/{nome}")
    public Estudante consultarEstudante(@PathVariable String nome) {
        return estudanteService.consultarEstudante(nome);
    }

    @GetMapping(value = "/consultarTodosEstudantes")
    public ArrayList<Estudante> consultarTodosEstudantes() {
        return estudanteService.consultarTodosEstudantes();
    }

    @GetMapping(value = "/cadastrarEstudante")
    public Estudante cadastrarEstudante(@RequestParam(value = "nome") String nome,
                                                   @RequestParam(value = "documento") int documento,
                                                   @RequestParam(value = "endereco") String endereco) {

        return estudanteService.cadastrarEstudante(nome, documento, endereco);
    }
}
