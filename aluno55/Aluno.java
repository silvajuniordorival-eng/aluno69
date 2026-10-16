class Cidade {
    private String nome;

    public Cidade(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

public class Aluno { 
    private String nome;
    private int idade;
    private Cidade cidade;
    private double[] notas;

    // Construtor
    public Aluno(String nome, int idade, Cidade cidade, double[] notas) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
        this.notas = notas;
    }

    // Método para calcular a média das notas
    public double calcularMedia() {
        if (notas == null || notas.length == 0) {
            return 0.0;
        }
        
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    // Método para exibir as informações completas do aluno
    public void exibir() {
        System.out.println("----------------------------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Mora em: " + cidade.getNome());
        System.out.printf("Média das notas: %.2f\n", calcularMedia());
        
        if (calcularMedia() >= 7.0) {
            System.out.println("Situação: Aprovado(a)!");
        } else {
            System.out.println("Situação: Reprovado(a).");
        }
        System.out.println("----------------------------------------");
    }    

    // Método main para testar o sistema
    public static void main(String[] args) {
        Cidade cidadeAluno = new Cidade("Curitiba");
        
        // Criando um vetor com 3 notas
        double[] notasAluno = {8.5, 7.0, 9.2};
        
        Aluno aluno1 = new Aluno("Carlos", 20, cidadeAluno, notasAluno);
        aluno1.exibir();
    }
}