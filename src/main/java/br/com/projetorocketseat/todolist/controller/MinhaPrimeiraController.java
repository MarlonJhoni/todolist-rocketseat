package br.com.projetorocketseat.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;;


@RestController//api - criar uma rota
@RequestMapping("/primeiraRota") // estruturar a rota
public class MinhaPrimeiraController {
    
    /* Métodos de aceso da HTTP
     * GET - Buscar uma informação
     * POST - Adicionar um dado/informação
     * PUT - Alterar um dado/informação
     * DELETE - Remover um dado
     * PATCH - Alterar somente uma parte da info/dado
     */


    // Método de uma classe
    @GetMapping("/primeiroMetodo")
    public String primeiraMensagem () {
        return "Funcionou";
    }
}
