
import java.util.List;

public class ConsoleView {

    public void mostrarEmprestimos(List<Emprestimo> emprestimos) {
        for (Emprestimo e : emprestimos) {
            System.out.println("Aluno: " + e.getAluno().getNome() +
                    " | Livro: " + e.getLivro().getTitulo());
        }
    }
}