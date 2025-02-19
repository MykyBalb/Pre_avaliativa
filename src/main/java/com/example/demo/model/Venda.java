package com.example.demo.model;

import lombok.Getter;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Venda {
    int idVenda;
    LocalDateTime dataVenda;
    ArrayList<Produto> produtos = new ArrayList<Produto>();
    Cliente cliente;

    public Venda(){
    }

    public Venda(int idVenda, LocalDateTime dataVenda, ArrayList<Produto> produtos, Cliente cliente) {
        this.idVenda = idVenda;
        this.dataVenda = dataVenda;
        this.produtos = produtos;
        this.cliente = cliente;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public LocalDateTime getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDateTime dataVenda) {
        this.dataVenda = dataVenda;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
