package ListaEstaticaAndEncadeada.lista_03_testando_encadeada_lista;

import java.time.LocalDate;
import java.util.Date;

public class Aluno {

    public Aluno(LocalDate date , String nome){
        this.dataNascimento = date;
        this.nome = nome;
    }

    private LocalDate dataNascimento;

    private String nome;

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
