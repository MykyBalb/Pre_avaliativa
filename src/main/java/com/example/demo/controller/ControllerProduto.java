package com.example.demo.controller;

import com.example.demo.database.BancoProduto;
import com.example.demo.model.Produto;

import java.util.List;

public class ControllerProduto {
    BancoProduto bcProduto = new BancoProduto();

    public void criarProduto(Produto p) {
        bcProduto.insert(p);
    }

    public List<Produto> pegarTodosProdutos(){
        return bcProduto.findAll();
    }

    public boolean atualizarProduto(Produto p) {
        return bcProduto.update(p);
    }

    public boolean deletarProduto(int idProduto) {
        return bcProduto.delete(idProduto);
    }
}
