package mapa;

import java.time.LocalDate;

public class Aluno {

    private int matricula;

    private String nome;

    private LocalDate nascimento;

    public Aluno(int matricula, String nome, LocalDate nascimento) {
        this.matricula = matricula;
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }
}
