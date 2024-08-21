package Ex2;

// Classe Lampada
class Lampada {
    private Estado estado; // Estado atual da lâmpada
    private int qtdAcendimentos; // Quantidade de vezes que a lâmpada foi acesa

    // Construtor
    public Lampada() {
        this.estado = Estado.APAGADO; // Inicialmente a lâmpada está apagada
        this.qtdAcendimentos = 0; // Inicialmente, a lâmpada não foi acesa
    }

    // Método para alternar o estado da lâmpada
    public void click() {
        if (this.estado == Estado.APAGADO) {
            this.estado = Estado.ACESO;
            this.qtdAcendimentos++; // Incrementa o contador de acendimentos
        } else {
            this.estado = Estado.APAGADO;
        }
    }

    // Método que retorna a quantidade de vezes que a lâmpada foi acesa
    public int qtdAcendimentos() {
        return this.qtdAcendimentos;
    }

    // Método que retorna o estado atual da lâmpada
    public Estado checaEstado() {
        return this.estado;
    }
}