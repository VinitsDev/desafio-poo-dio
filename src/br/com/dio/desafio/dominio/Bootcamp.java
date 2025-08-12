package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.List;

public class Bootcamp {

    private String nome;
    private LocalDate dataLimite;
    private List<Curso> cursos;
    private List<Aluno> alunos;

    //Métodos especiais
    public void matricularAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public void desmatricularAluno(Aluno aluno){
        alunos.remove(aluno);
    }

    public Bootcamp(String nome, LocalDate dataLimite, List<Curso> cursos, List<Aluno> alunos) {
        this.nome = nome;
        this.dataLimite = dataLimite;
        this.cursos = cursos;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataLimite() {
        return dataLimite;
    }

    public void setDataLimite(LocalDate dataLimite) {
        this.dataLimite = dataLimite;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    @Override
    public String toString() {
        return "Bootcamp{" +
                "nome='" + nome + '\'' +
                ", dataLimite=" + dataLimite +
                ", cursos=" + cursos +
                ", alunos=" + alunos +
                '}';
    }
}
