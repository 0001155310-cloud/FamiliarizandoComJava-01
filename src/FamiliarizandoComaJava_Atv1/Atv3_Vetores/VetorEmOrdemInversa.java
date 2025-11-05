package FamiliarizandoComaJava_Atv1.Atv3_Vetores;

import java.util.Scanner;

public class VetorEmOrdemInversa {
    public static void main(String[] args) {


        //Declarando variáveis
        int[] numeros = new int[8];
        Scanner sc = new Scanner(System.in);

        //Recebendo valores do usuario
        System.out.println("\n =========== Vetor de 8 números ============");


        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o valor do " + (i+1) + "° número: ");
            numeros[i] = sc.nextInt();
        }

        //Exibindo os números
        System.out.println("\n===== Exibindo números de forma invertida: =====");

        for (int i = (numeros.length - 1); i >= 0; i--) {
            System.out.println((i+1) + "° Número : " + numeros[i]);
        }

        System.out.println("======= Sistema Finalizado! ======");
        sc.close();

    }
}