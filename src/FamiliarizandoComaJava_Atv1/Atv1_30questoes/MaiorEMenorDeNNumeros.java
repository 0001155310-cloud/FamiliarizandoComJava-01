package FamiliarizandoComaJava_Atv1.Atv1_30questoes;

import java.util.Scanner;

public class MaiorEMenorDeNNumeros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n===== Maior e Menor de N Números =====");

        // Pergunta quantos números o usuário quer informar
        System.out.print("\nQuantos números você vai digitar? ");
        int n = sc.nextInt();

        // Inicializa maior e menor com valores extremos
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        // Loop para receber os números
        for (int i = 1; i <= n; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = sc.nextInt();

            // Atualiza maior e menor
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        // Exibe os resultados
        System.out.println("\n===== Resultado =====");
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);

        System.out.println("\n=== Programa Finalizado! ===");
        sc.close();
    }
}
