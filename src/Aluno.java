public class Aluno {
    private String nome;

    public Aluno(String nome) {
        if (nome.isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio");
        }
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}