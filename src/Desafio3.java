public class Desafio3 {

    public static void main(String[] args) {
        // Desafio 3
        // Calcular a soma de todos os dígitos de um número inteiro positivo. Exemplo: 12323 => retorna 11

        int numero = 19382;
        int soma = 0; // Variável para armazenar a soma dos dígitos

        // Converte o número em uma string
        String numeroString = Integer.toString(numero);

        // Itera sobre os caracteres da string
        for (int i = 0; i < numeroString.length(); i++) {
            char digito = numeroString.charAt(i); // Obtém o caractere (dígito) na posição i
            int digitoInt = Character.getNumericValue(digito); // Converte o caractere em um inteiro
            soma += digitoInt; // Adiciona o dígito à soma
        }

        System.out.println("A soma dos dígitos de " + numero + " é " + soma);
    }
}