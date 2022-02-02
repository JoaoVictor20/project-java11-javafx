package com.example.listagempessoafisica;

import com.example.listagempessoafisica.entidade.Pessoa;
import com.example.listagempessoafisica.persistencia.PessoaDao;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    private ObservableList<Pessoa> pessoas = FXCollections.observableArrayList();

    @FXML
    private TableColumn<Pessoa, Integer> id;

    @FXML
    private TableColumn<Pessoa, String> contato;

    @FXML
    private TableColumn<Pessoa, String> cpf;

    @FXML
    private TableColumn<Pessoa, String> estado;

    @FXML
    private TableColumn<Pessoa, String> status;

    @FXML
    private TableView<Pessoa> tabelaPessoa;

    @FXML
    private TableColumn<Pessoa, String> nome;

    @FXML
    private TableColumn<Pessoa, String> celular;

    @FXML
    private TableColumn<Pessoa, String> cidade;

    @FXML
    private TableColumn<Pessoa, String> comercial;

    private void carregarPessoasNaTabela() {
        PessoaDao pessoaDao = new PessoaDao();
        List<Pessoa> list = pessoaDao.selectAll();
        pessoas.addAll(list);

        id.setCellValueFactory(cellData -> cellData.getValue().idProperty().asObject());
        nome.setCellValueFactory(cellData -> cellData.getValue().nomeProperty());
        cpf.setCellValueFactory(cellData -> cellData.getValue().cpfProperty());
        cidade.setCellValueFactory(cellData -> cellData.getValue().cidadeProperty());
        estado.setCellValueFactory(cellData -> cellData.getValue().estadoProperty());
        celular.setCellValueFactory(cellData -> cellData.getValue().celularProperty());
        contato.setCellValueFactory(cellData -> cellData.getValue().contatoProperty());
        comercial.setCellValueFactory(cellData -> cellData.getValue().comercialProperty());
        status.setCellValueFactory(cellData -> cellData.getValue().statusProperty());

        tabelaPessoa.setItems(pessoas);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        carregarPessoasNaTabela();
    }
}