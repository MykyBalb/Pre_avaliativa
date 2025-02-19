package com.example.demo.view;

import com.example.demo.controller.ControllerProduto;
import com.example.demo.model.Produto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class ViewProduto {
    ControllerProduto cp = new ControllerProduto();

    @GetMapping("/produto")
    public List<Produto> getALLProduto() {
        return cp.pegarTodosProdutos();
    }
    @PostMapping("/produto")
    public String postNovoProduto(@RequestBody Produto p) {
        cp.criarProduto(p);
        return "Sucesso";
    }
    @PutMapping("/produto")
    public String putproduto(@RequestBody Produto p) {
        if ( cp.atualizarProduto(p)){
            return "Sucesso";
        } else {
            return "Erro";
        }
    }
    @DeleteMapping("/produto")
    public String deletProduto(@RequestBody int p)  {
        if (cp.deletarProduto(p)){
            return "Sucesso";
        } else {
            return "Erro";
        }
    }
}
