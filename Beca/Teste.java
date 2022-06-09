import Seres.Aluno;

public class Teste {
    public static void main(String[] args) {
        Aluno Aluno1 = new Aluno();

        Aluno1.nome = "Rebeca";
        Aluno1.idade = 16;
        Aluno1.matricula = "2021319327";

        System.out.println("nome: " + Aluno1.nome);
        System.out.println("idade: " + Aluno1.idade);
        System.out.println("matricula: " + Aluno1.matricula);
    }
}
