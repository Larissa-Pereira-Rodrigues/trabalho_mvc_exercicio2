import java.util.ArrayList;
import java.util.List;

public class EmprestimoController {

    private List<Emprestimo> emprestimos = new ArrayList<>();

    public void realizarEmprestimo(Livro livro, Aluno aluno) {
        Emprestimo e = new Emprestimo(livro, aluno);
        emprestimos.add(e);
    }

    public void devolverLivro(Emprestimo e) {
        e.devolverLivro();
    }

    public List<Emprestimo> listarEmprestimosAtivos() {
        List<Emprestimo> ativos = new ArrayList<>();

        for (Emprestimo e : emprestimos) {
            if (!e.isDevolvido()) {
                ativos.add(e);
            }
        }

        return ativos;
    }
}