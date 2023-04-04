package com.pucrs.psa.service;

import com.pucrs.psa.entidate.Disciplina;
import com.pucrs.psa.entidate.Funcionario;

import java.util.ArrayList;

public class FuncionarioService {

    ArrayList<Funcionario> listaFuncionarios;

    public ArrayList<Funcionario> cadastrarFuncionario(String nome, String email, String senha){


        Funcionario funcionario = new Funcionario(nome, email, senha);


        listaFuncionarios.add(funcionario);

        return listaFuncionarios;

    }
}
