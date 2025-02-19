package com.example.demo.model;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Produto extends Venda{

    int idProduto;
    String nome;
    Double preco;
    Integer quantidade;

    public Produto() {
    }

    public Produto(int idVenda, LocalDateTime dataVenda, ArrayList<Produto> produtos, Cliente cliente, int idProduto, String nome, Double preco, Integer quantidade) {
        super(idVenda, dataVenda, produtos, cliente);
        this.idProduto = idProduto;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
