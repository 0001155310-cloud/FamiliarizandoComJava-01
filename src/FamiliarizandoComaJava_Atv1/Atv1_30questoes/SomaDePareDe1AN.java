package FamiliarizandoComaJava_Atv1.Atv1_30questoes;

import java.util.Scanner;

public class SomaDePareDe1AN {
    public static void main(String[] args) {

        // Declarando variáveis
        int soma = 0;
        int numero;

        Scanner sc = new Scanner(System.in);

        System.out.println("\n===== Soma de Números Pares =====");

        // Recebe o valor de N
        System.out.print("Digite o valor de N: ");
        numero = sc.nextInt();

        // Percorre de 1 até N
        for (int i = 1; i <= numero; i++) {

            // Verifica se é par
            if (i % 2 == 0) {

                System.out.println(i + " + " + soma + " = " + (soma + i));
                soma += i; // adiciona à soma

            }
        }

        // Mensagem final
        System.out.println("\n===== Resultado =====");
        System.out.println("Soma de todos os números pares de 1 até " + numero + " é igual a: " + soma);

        System.out.println("\n=== Programa Finalizado! ===");
        sc.close();
    }
}

