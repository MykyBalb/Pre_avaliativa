package com.example.demo.view;

import com.example.demo.controller.ControllerVenda;
import com.example.demo.model.Venda;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ViewVenda {
    ControllerVenda cv = new ControllerVenda();

    @GetMapping("/venda")
    public List<Venda> getAllVendas() {
        return cv.pegarTodasVendas();
    }

    @PostMapping("/venda")
    public String postNovaVenda(@RequestBody Venda v) {
        cv.criarVenda(v);
        return "Sucesso";
    }

    @PutMapping("/venda")
    public String putVenda(@RequestBody Venda v) {
        if (cv.atualizarVenda(v)) {
            return "Atualização sucedida";
        } else {
            return "Erro ao atualizar";
        }
    }

    @DeleteMapping("/venda")
    public String deleteVenda(@RequestBody int id) {
        if (cv.deletarCliente(id)) {
            return "Deletado com sucesso";
        } else {
            return "Erro ao deletar venda";
        }
    }
}
