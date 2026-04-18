public class Main {
    public static void main(String[] args) {

        Livro livro = new Livro("POO Java", "Autor B", 3);
        Aluno aluno = new Aluno("Larissa");

        EmprestimoController controller = new EmprestimoController();
        ConsoleView view = new ConsoleView();

        controller.realizarEmprestimo(livro, aluno);

        view.mostrarEmprestimos(controller.listarEmprestimosAtivos());
    }
}