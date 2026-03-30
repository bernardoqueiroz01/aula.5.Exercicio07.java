// Nome: Bernardo Candido de Queiroz
// Matrícula: 1261948200

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Qual a sua nota?");

        byte nota;
        Scanner sujeito = new Scanner(System.in);

        while (true) {

            // Verifica se é número válido
            if (sujeito.hasNextByte()) {
                nota = sujeito.nextByte();
            } else {
                System.out.println("Digite um número válido.");
                sujeito.next(); // limpa entrada inválida
                continue;
            }

            if (nota < 0 || nota > 100) {
                System.out.println("Nota inválida.");
                System.out.println("Digite novamente");
            } else if (nota >= 90 && nota <= 100) {
                System.out.println("Nota de conceito A - Parabéns");
                break;
            } else if (nota >= 75 && nota < 90) {
                System.out.println("Nota de conceito B - Muito bem");
                break;
            } else if (nota >= 60 && nota < 75) {
                System.out.println("Nota de conceito C - Pode melhorar");
                break;
            } else if (nota < 60 && nota >= 0) {
                System.out.println("Nota de conceito D (Reprovado) - Triste...");
                break;
            }

            // pergunta de novo se a nota for inválida
            System.out.println("Qual a sua nota?");
        }

        sujeito.close();
    }
}
