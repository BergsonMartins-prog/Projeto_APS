package br.com.estoque.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private int idUsuario;
    private String nome;
    private String email;
    private String senha;
    private LocalDate dataCadastro;
    private String tipo;
    private String status;
    private LocalDateTime ultimoLogin;
    private List<Log> logs;

    public Usuario(){
        this.logs = new ArrayList<>();
    }

   
    public void fazerLogin(){
        System.out.println("Usuário " + this.nome + " fazendo login...");
    }

    public void atualizarDados(){
        System.out.println("Atualizando dados do usuário " + this.nome);
    }
    
    public int getIdUsuario(){
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario){
        this.idUsuario = idUsuario;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha(){
        return senha;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }

    public LocalDate getDataCadastro(){
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro){
        this.dataCadastro = dataCadastro;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public LocalDateTime getUltimoLogin(){
        return ultimoLogin;
    }

    public void setUltimoLogin(LocalDateTime ultimoLogin){
        this.ultimoLogin = ultimoLogin;
    }

    public List<Log> getLogs() {
        return logs;
    }

    public void setLogs(List<Log> logs) {
        this.logs = logs;
    }
 
    

}