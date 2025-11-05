package FamiliarizandoComaJava_Atv1.Atv3_Vetores;

import java.util.Scanner;

public class MaiorEMenorNumNoVetor {
    public static void main(String[] args) {


        //Declarando Variáveis
        int maior = Integer.MIN_VALUE; //Para declarar o menor valor
        int menor = Integer.MAX_VALUE; //Para declarar o maior valor



        int[] numeros = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("\n===== Maior e Menor Número do Vetor =====");

        // Loop para receber os números
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            numeros[i] = sc.nextInt();

            // Atualiza maior e menor
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
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
