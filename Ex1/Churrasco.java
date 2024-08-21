package Ex1;

// Classe Churrasco
class Churrasco {
    double qtdCarne; // quantidade média de carne consumida
    
    // Método para verificar o consumo de carne
    public void verificarConsumo(Pessoa pessoa) {
        if (pessoa.idade >= 0 && pessoa.idade <= 3) {
            qtdCarne = 0; // 0 kg para pessoas de 0 a 3 anos
        } else if (pessoa.idade >= 4 && pessoa.idade <= 12) {
            qtdCarne = 1; // 1 kg para pessoas de 4 a 12 anos
        } else if (pessoa.idade >= 13) {
            qtdCarne = 2; // 2 kg para pessoas de 13 anos em diante
        }
        
        if (pessoa.vegetariana) {
            qtdCarne = 0; // vegetarianos não consomem carne
        }
        
        System.out.printf("%s vai consumir %.1f kg de carne no churrasco.\n", pessoa.nome, qtdCarne);
    }
}
