package com.example.listagempessoafisica.persistencia;

import com.example.listagempessoafisica.entidade.Pessoa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PessoaDao {

    public static final String CAMINHO_ARQUIVO = "C:\\Users\\PC\\IdeaProjects\\listagempessoafisica\\src\\main\\java\\com\\example\\listagempessoafisica\\recursos\\PessoaFisica.csv";

    public List<Pessoa> selectAll() {
        String linha = "";
        List<Pessoa> pessoas = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(CAMINHO_ARQUIVO);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            Pessoa pessoa;
            bufferedReader.readLine();
            linha = bufferedReader.readLine();
            do {
                pessoa = mapearPessoa(linha);
                pessoas.add(pessoa);
                linha = bufferedReader.readLine();

            } while (linha != null);
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pessoas;
    }

    private Pessoa mapearPessoa(String linha) {
        Pessoa pessoa = new Pessoa();
        try {
            String[] strings;
            if (linha != null) {
                strings = linha.split(";");
                if (strings != null && strings.length > 0) {
                    pessoa.setId(Integer.parseInt(strings[0]));
                    pessoa.setCpf(strings[1]);
                    pessoa.setNome(strings[2]);
                    pessoa.setCidade(strings[3]);
                    pessoa.setEstado(strings[4]);
                    pessoa.setStatus(strings[5]);
                    if (strings.length == 7) {
                        pessoa.setCelular(strings[6]);
                        pessoa.setContato("s/n");
                        pessoa.setComercial("s/n");
                    } else if (strings.length == 8) {
                        pessoa.setCelular(strings[6]);
                        pessoa.setContato(strings[7]);
                        pessoa.setComercial("s/n");
                    } else {
                        pessoa.setCelular(strings[6]);
                        pessoa.setContato(strings[7]);
                        pessoa.setComercial(strings[8]);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pessoa;
    }
}