package classes;

import enums.SituacaoApolice;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Apolice {

    private long numero;
    private LocalDate data;
    private LocalDate dataValidade;
    private SituacaoApolice situacao;
    private String seguradora;

    public Apolice() {
    }

    public Apolice(long numero, LocalDate data, LocalDate dataValidade, SituacaoApolice situacao, String seguradora) {
        this.numero = numero;
        this.data = data;
        this.dataValidade = dataValidade;
        this.situacao = situacao;
        this.seguradora = seguradora;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    public SituacaoApolice getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoApolice situacao) {
        this.situacao = situacao;
    }

    public String getSeguradora() {
        return seguradora;
    }

    public void setSeguradora(String seguradora) {
        this.seguradora = seguradora;
    }
    
    

    @Override
    public String toString() {
        DateTimeFormatter padraoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Numero: " + getNumero() + " Data :" + getData().format(padraoData) + " Data de Validade: " 
                + getDataValidade().format(padraoData) + " Situação: " + getSituacao() + " Seguradora: " +getSeguradora();
    }
    
    
}
