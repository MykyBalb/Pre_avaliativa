package com.example.demo.database;

import com.example.demo.model.Cliente;
import com.example.demo.model.Venda;

import java.util.ArrayList;
import java.util.List;

public class BancoVenda {
    private List<Venda>venda;

    public BancoVenda() {
        this.venda = new ArrayList<>();
    }

    // Insere uma nova VENDA na lista
    public void insert(Venda v) {
        venda.add(v);
    }

    // Busca uma VENDA pelo ID
    public Venda findOne(int id) {
        for (Venda v : venda) {
            if (v.getIdVenda() == id) {
                return v;
            }
        }
        return null;
        // Retorna null se não encontrar
    }

    // Retorna todas as vendas cadastradas
    public List<Venda> findAll() {
        return new ArrayList<>(venda);
    }

    // Atualiza uma venda existente na lista
    public boolean update(Venda v) {
        for (int i = 0; i < venda.size(); i++) {
            if (venda.get(i).getIdVenda() == v.getIdVenda()) {
                venda.set(i, v);
                return true; // Retorno indicando que a atualização foi feita
            }
        }
        return false; // Retorna falso se a venda não foi encontrada
    }

    // Remove uma venda pelo ID
    public boolean delete(int id) {
        return venda.removeIf(v -> v.getIdVenda() == id);
    }
}
