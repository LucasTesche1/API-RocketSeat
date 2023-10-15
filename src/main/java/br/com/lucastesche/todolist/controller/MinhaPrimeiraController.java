package br.com.lucastesche.todolist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraRota")
//http://localhost:8080/ -----
public class MinhaPrimeiraController {
    
    /**
     * Métodos de acesso do HTTP
     * GET - Buscar Info
     * POST - Add dado/info
     * PUT - Alterar mais de um dado/info
     * DELETE - Remover um dado
     * PATCH - Alterar somente uma parte da info/dado
     */

    //Método (funcionalidade) de uma classe
    @GetMapping("/primeiroMetodo")
    public String primeiraMensagem(){
        return "Funcionou";
    }
}
