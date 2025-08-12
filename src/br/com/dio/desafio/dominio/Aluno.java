package br.com.dio.desafio.dominio;


public final class Aluno extends Devs {

    private Integer xp;

    //Métodos especiais
    public void concluirCurso() {
        setXp(getXp()+40);
    }

    //constructor
    public Aluno(String nome, String email, Integer idade, Integer xp) {
        super(nome, email, idade);
        this.xp = xp;
    }


    //to String
    @Override
    public String toString() {
        return "Aluno{" +
                "xp=" + xp +
                "}";
    }

    //getters e setters
    public Integer getXp() {
        return xp;
    }

    public void setXp(Integer xp) {
        this.xp = xp;
    }

}
