package com.pucrs.psa.service;

import com.pucrs.psa.entidate.Disciplina;
import com.pucrs.psa.entidate.Funcionario;

import java.util.ArrayList;

public class FuncionarioService {

    ArrayList<Funcionario> listaFuncionarios;

    public Funcionario cadastrarFuncionario(String nome, String email, String senha){

        Funcionario funcionario = new Funcionario(nome.toLowerCase(), email.toLowerCase(), senha.toLowerCase());
        listaFuncionarios.add(funcionario);

        return funcionario;
    }
}
