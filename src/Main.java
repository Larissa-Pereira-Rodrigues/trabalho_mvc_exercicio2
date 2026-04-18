import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Livro livro1 = new Livro("Java Básico", "Autor A", 2);
        Aluno aluno1 = new Aluno("Larissa");

        List<Emprestimo> emprestimos = new ArrayList<>();

        Emprestimo e1 = new Emprestimo(livro1, aluno1);
        emprestimos.add(e1);

        System.out.println("Livro emprestado para: " + aluno1.getNome());

        // Listar livros emprestados
        for (Emprestimo e : emprestimos) {
            if (!e.isDevolvido()) {
                System.out.println("Livro: " + e.getLivro().getTitulo());
            }
        }

        // Devolução
        e1.devolverLivro();
        System.out.println("Livro devolvido!");
    }
}