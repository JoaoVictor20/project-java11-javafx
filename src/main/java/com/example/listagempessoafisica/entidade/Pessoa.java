package com.example.listagempessoafisica.entidade;

import javafx.beans.property.*;

public class Pessoa {
    private IntegerProperty id;
    private StringProperty cpf;
    private StringProperty nome;
    private StringProperty cidade;
    private StringProperty estado;
    private StringProperty status;
    private StringProperty celular;
    private StringProperty contato;
    private StringProperty comercial;

    public Pessoa() {
        this.id = new SimpleIntegerProperty();
        this.cpf = new SimpleStringProperty();
        this.nome = new SimpleStringProperty();
        this.cidade = new SimpleStringProperty();
        this.estado = new SimpleStringProperty();
        this.status = new SimpleStringProperty();
        this.celular = new SimpleStringProperty();
        this.contato = new SimpleStringProperty();
        this.comercial = new SimpleStringProperty();
    }

    public int getId() {
        return id.get();
    }

    public IntegerProperty idProperty() {
        return id;
    }

    public void setId(int id) {
        this.id.set(id);
    }

    public String getCpf() {
        return cpf.get();
    }

    public StringProperty cpfProperty() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf.set(cpf);
    }

    public String getNome() {
        return nome.get();
    }

    public StringProperty nomeProperty() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome.set(nome);
    }

    public String getCidade() {
        return cidade.get();
    }

    public StringProperty cidadeProperty() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade.set(cidade);
    }

    public String getEstado() {
        return estado.get();
    }

    public StringProperty estadoProperty() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado.set(estado);
    }

    public String getStatus() {
        return status.get();
    }

    public StringProperty statusProperty() {
        return status;
    }

    public void setStatus(String status) {
        this.status.set(status);
    }

    public String getCelular() {
        return celular.get();
    }

    public StringProperty celularProperty() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular.set(celular);
    }

    public String getContato() {
        return contato.get();
    }

    public StringProperty contatoProperty() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato.set(contato);
    }

    public String getComercial() {
        return comercial.get();
    }

    public StringProperty comercialProperty() {
        return comercial;
    }

    public void setComercial(String comercial) {
        this.comercial.set(comercial);
    }
}