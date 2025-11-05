package FamiliarizandoComaJava_Atv1.Atv3_Vetores;

import java.util.Scanner;

public class ParesEImparesDoVetor {
    public static void main(String[] args) {

        //Declarando Variáveis
        int[] numeros = new int[10];
        int pares = 0;
        int impares = 0;

        //Recebedo valores do usuário
        Scanner sc = new Scanner(System.in);
        System.out.println("\n===== Pares e Ímpares do Vetor =====");

        for (int i = 0; i < numeros.length; i++) {
            //Recebendo os números
            System.out.println("Digite o " + (i+1) + "° número: ");
            numeros[i] = sc.nextInt();

            if (numeros[i] % 2 == 0) { //Caso seja par
                pares += 1;

            } else { //Caso seja impar
                impares += 1;
            }

        }

        // Exibe os resultados
        System.out.println("\n===== Resultado =====");
        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);


        System.out.println("\n=== Programa Finalizado! ===");
        sc.close();

    }
}
