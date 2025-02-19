package com.example.demo.controller;

import com.example.demo.database.BancoCliente;
import com.example.demo.model.Cliente;

import java.util.List;

public class ControllerCliente {

    BancoCliente bcCliente = new BancoCliente();

    public void criarCliente(Cliente c) {
        bcCliente.insert(c);
    }
    public List<Cliente> pegarTodosClientes(){
        return bcCliente.findAll();
    }
    public boolean atualizarCliente(Cliente c) {
        return bcCliente.update(c);
    }

    public boolean deletarCliente(int idCliente){
        return bcCliente.delete(idCliente);
    }
}
