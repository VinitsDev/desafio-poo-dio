import br.com.dio.desafio.dominio.Aluno;
import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Professor;

import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Mario", "Mario@hotmail.com", 23, 0);
        Aluno aluno2 = new Aluno("Jorge", "Jorge@gmail.com", 55, 0);
        Aluno aluno3 = new Aluno("Ana", "Ana@hotmail.com", 19, 0);
        Aluno aluno4 = new Aluno("Paulo", "Paulo@gmail.com", 21, 0);

        Professor professor1 = new Professor("Otavio", "Otavio@gmail.com", 34);
        Professor professor2 = new Professor("Clara", "Clara@hotmail.com", 29);

        Curso poo = new Curso(
                "POO", "Programação orientada a objetos", 9,professor1);
        Curso bancoDeDados = new Curso(
                "Banco de dados", "Bancos de dados relacionais", 11, professor1);
        Curso sintaxe = new Curso(
                "Sintaxe", "Sintaxe basica", 7,professor2);

        Bootcamp backend = new Bootcamp(
                "Back-end",
                LocalDate.of(2025,8,30),
                List.of(poo, bancoDeDados, sintaxe),
                List.of(aluno1, aluno2, aluno3, aluno4));

        System.out.println(backend.toString());
    }

}
