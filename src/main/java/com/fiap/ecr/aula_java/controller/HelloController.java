package com.fiap.ecr.aula_java.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController// Indica que a classe é um controlador REST e que os métodos dentro dela retornarão dados diretamente no corpo da resposta HTTP (JSON ou texto).
@RequestMapping("/hello")//Define um caminho base como /hellopara os endpoints dentro do controlador. Se aplicada na classe, todos os endpoints dentro dela herdam esse caminho.
public class HelloController {
    @GetMapping
    public String sayHello() {
        return "Olá, Spring Boot!";
    }

}
