package br.com.estoque.model;

import java.time.LocalDate;

public class Estoque{

    private int idMov;
    private int qtdEntrada;
    private int qtdSaida;
    private LocalDate dataMovimentacao;
    private String tipoMovimentacao; 
    private int idUsuario; 

    // Relacionamento: Uma movimentação pertence a um  produto
    private Produto produto;

    public void registrarMovimentacao(){
        System.out.println("Registrando movimentação para o produto: " + produto.getNome());
    }

    public int getIdMov(){
        return idMov;
    }

    public void setIdMov(int idMov){
        this.idMov = idMov;
    }

    public int getQtdEntrada(){
        return qtdEntrada;
    }

    public void setQtdEntrada(int qtdEntrada){
        this.qtdEntrada = qtdEntrada;
    }

    public int getQtdSaida(){
        return qtdSaida;
    }

    public void setQtdSaida(int qtdSaida){
        this.qtdSaida = qtdSaida;
    }

    public LocalDate getDataMovimentacao(){
        return dataMovimentacao;
    }

    public void setDataMovimentacao(LocalDate dataMovimentacao) {
        this.dataMovimentacao = dataMovimentacao;
    }

    public String getTipoMovimentacao() {
        return tipoMovimentacao;
    }

    public void setTipoMovimentacao(String tipoMovimentacao) {
        this.tipoMovimentacao = tipoMovimentacao;
    }
}