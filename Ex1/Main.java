package Ex1;

// Exemplo de utilização
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Ana", "Feminino", 5, false); // Exemplo de pessoa não vegetariana, 5 anos
        Pessoa pessoa2 = new Pessoa("João", "Masculino", 10, true); // Exemplo de pessoa vegetariana, 10 anos
        
        Churrasco churrasco = new Churrasco();
        churrasco.verificarConsumo(pessoa1); // Ana vai consumir 1.0 kg de carne no churrasco.
        churrasco.verificarConsumo(pessoa2); // João vai consumir 0.0 kg de carne no churrasco.
    }
}
