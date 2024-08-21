package Ex2;

// Classe principal para testar a Lampada
public class Main {
    public static void main(String[] args) {
        Lampada lampada = new Lampada(); // Cria uma instância de Lampada

        // Teste dos métodos
        System.out.println("Estado inicial: " + lampada.checaEstado()); // Estado inicial: APAGADO

        lampada.click(); // Acende a lâmpada
        System.out.println("Estado após 1º click: " + lampada.checaEstado()); // Estado após 1º click: ACESO
        System.out.println("Qtd acendimentos: " + lampada.qtdAcendimentos()); // Qtd acendimentos: 1

        lampada.click(); // Apaga a lâmpada
        System.out.println("Estado após 2º click: " + lampada.checaEstado()); // Estado após 2º click: APAGADO

        lampada.click(); // Acende a lâmpada novamente
        System.out.println("Estado após 3º click: " + lampada.checaEstado()); // Estado após 3º click: ACESO
        System.out.println("Qtd acendimentos: " + lampada.qtdAcendimentos()); // Qtd acendimentos: 2
    }
}