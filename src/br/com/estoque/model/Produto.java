package br.com.estoque.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Produto {

    private int idProduto;
    private String nome;
    private String descricao;
    private float preco; 
    private int qtdEstoque;
    private LocalDate dataCadastro;
    private String categoria;
    private String marca;
    private String status;
    
    // Relacionamento: Um produto pode ter zero ou mais (0..*) movimentações de estoque
    private List<Estoque> movimentacoes;

    
    public Produto() {
        this.movimentacoes = new ArrayList<>();
    }

    public void alterarDados() {
       
        System.out.println("Alterando dados do produto " + this.nome);
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Estoque> getMovimentacoes() {
        return movimentacoes;
    }

    public void setMovimentacoes(List<Estoque> movimentacoes) {
        this.movimentacoes = movimentacoes;
    }


}
