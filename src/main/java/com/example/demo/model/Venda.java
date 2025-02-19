package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;

@NoArgsConstructor
@AllArgsConstructor
public class Venda {
    int idVenda;
    LocalDateTime dataVenda;
    ArrayList<Produto> produtos = new ArrayList<Produto>();
    Cliente cliente;
}
