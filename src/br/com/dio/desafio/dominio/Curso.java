package br.com.dio.desafio.dominio;

public class Curso {

    private String nome;
    private String descricao;
    private Integer horasTotais;
    private Professor professor;

    public Curso(String nome, String descricao, Integer horasTotais, Professor professor) {
        this.nome = nome;
        this.descricao = descricao;
        this.horasTotais = horasTotais;
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", horasTotais=" + horasTotais +
                ", professor=" + professor +
                '}';
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

    public Integer getHorasTotais() {
        return horasTotais;
    }

    public void setHorasTotais(Integer horasTotais) {
        this.horasTotais = horasTotais;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
