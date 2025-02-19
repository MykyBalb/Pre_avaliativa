package com.example.demo.controller;

import com.example.demo.model.Cliente;
import com.example.demo.model.Venda;

import java.util.List;

public class ControllerVenda {
    BancoVenda bcVenda = new BancoVenda();

    public void criarVenda(Venda v) {
        bcVenda.insert(v);
    }

    public List<Cliente> pegarTodosClientes() {
        return bcVenda.findAll();
    }

    public boolean atualizarVenda(Venda v) {
        return bcVenda.update(v);
    }

    public boolean deletarCliente(int idVenda) {
        return bcVenda.delete(idVenda);
    }
}
