package com.example.demo.view;

import com.example.demo.controller.ControllerCliente;
import com.example.demo.model.Cliente;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class ViewCliente {

    ControllerCliente cc = new ControllerCliente();

    @GetMapping("/cliente")
    public List<Cliente> getALLCliente() {
        return cc.pegarTodosClientes();
    }
    @PostMapping("/cliente")
    public String postNovoCliente(@RequestBody Cliente c) {
        cc.criarCliente(c);
        return "Sucesso";
    }
    @PutMapping("/cliente")
    public String putCliente(@RequestBody Cliente c) {
       if ( cc.atualizarCliente(c)){
           return "Sucesso";
       } else {
           return "Erro";
       }
    }
    @DeleteMapping("/cliente")
    public String deletCliente(@RequestBody int c)  {
        if (cc.deletarCliente(c)){
            return "Sucesso";
        } else {
            return "Erro";
        }
    }
}
