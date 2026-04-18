import java.time.LocalDate;

public class Emprestimo {
    private Livro livro;
    private Aluno aluno;
    private LocalDate dataEmprestimo;
    private boolean devolvido;

    public Emprestimo(Livro livro, Aluno aluno) {
        this.livro = livro;
        this.aluno = aluno;
        this.dataEmprestimo = LocalDate.now();
        this.devolvido = false;

        livro.emprestar();
    }

    public void devolverLivro() {
        if (!devolvido) {
            livro.devolver();
            devolvido = true;
        }
    }

    public boolean isDevolvido() {
        return devolvido;
    }

    public Livro getLivro() {
        return livro;
    }

    public Aluno getAluno() {
        return aluno;
    }
}