package com.example.demo.model;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Cliente extends Venda{

    int idCliente;
    String nome;
    String cpf;

    public Cliente() {
    }

    public Cliente(int idVenda, LocalDateTime dataVenda, ArrayList<Produto> produtos, Cliente cliente, int idCliente, String nome, String cpf) {
        super(idVenda, dataVenda, produtos, cliente);
        this.idCliente = idCliente;
        this.nome = nome;
        this.cpf = cpf;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
