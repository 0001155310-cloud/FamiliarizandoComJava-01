package FamiliarizandoComaJava_Atv1.Atv3_Vetores;

import java.util.Scanner;

public class VetorDeNumerosPositivos {
    public static void main(String[] args) {

        //Declarando Variáveis
        int[] numeros = new int[10];
        Scanner sc = new Scanner(System.in);

        //Recebendo valores do usuario
        System.out.println("\n =========== Ignorando Números Positivos ============");

        for (int i = 0; i < numeros.length; i++) { //Cria variável i, que se repete até o fim da matriz
            //Repetindo até o fim do vetor
            System.out.println("Digite o valor do " + (i+1) + "° número: ");
            numeros[i] = sc.nextInt();

        }

        //Exibindo os números
        System.out.println("\n==== Exibindo números (apenas os positivos): =====");

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 0) {
                i++;
            }
            else {
                System.out.println((i + 1) + "° Número : " + numeros[i]);
            }
        }
    }
}
