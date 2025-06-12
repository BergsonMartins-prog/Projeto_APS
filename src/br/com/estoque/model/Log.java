package br.com.estoque.model;

import java.time.LocalDateTime;

public class Log {

    private int idLog;
    private String acao;
    private LocalDateTime dataHora;
    private String detalhes;
    private Usuario usuario;

    public Log(Usuario usuario, String acao, String detalhes) {
        this.usuario = usuario;
        this.acao = acao;
        this.detalhes = detalhes;
        this.dataHora = LocalDateTime.now(); // Define a data e hora no momento da criação
    }
    
    public int getIdLog(){
        return idLog;
    }

    public void setIdLog(int idLog){
        this.idLog = idLog;
    }

    public String getAcao(){
        return acao;
    }

    public void setAcao(String acao){
        this.acao = acao;
    }

    public LocalDateTime getDataHora(){
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora){
        this.dataHora = dataHora;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes){
        this.detalhes = detalhes;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
    }
    
}