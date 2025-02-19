package com.example.demo.database;

import com.example.demo.model.Cliente;
import com.example.demo.model.Produto;

import java.util.ArrayList;
import java.util.List;

public class BancoCliente {
    private List<Cliente> cliente;

    public BancoCliente() {
        this.cliente = new ArrayList<>();
    }

    // Insere um novo cliente na lista
    public void insert(Cliente c) {
        cliente.add(c);
    }

    // Busca um cliente pelo ID
    public Cliente findOne(int id) {
        for (Cliente c : cliente) {
            if (c.getIdCliente() == id) {
                return c;
            }
        }
        return null; // Retorna null se não encontrar
    }

    // Retorna todos os cliente cadastrados
    public List<Cliente> findAll() {
        return new ArrayList<>(cliente);
    }

    // Atualiza um cliente existente na lista
    public boolean update(Cliente c) {
        for (int i = 0; i < cliente.size(); i++) {
            if (cliente.get(i).getIdCliente() == c.getIdCliente()) {
                cliente.set(i, c);
                return true; // Retorno indicando que a atualização foi feita
            }
        }
        return false; // Retorna falso se o cliente não foi encontrado
    }

    // Remove um cliente pelo ID
    public boolean delete(int id) {
        return cliente.removeIf(c -> c.getIdCliente() == id);
    }
}