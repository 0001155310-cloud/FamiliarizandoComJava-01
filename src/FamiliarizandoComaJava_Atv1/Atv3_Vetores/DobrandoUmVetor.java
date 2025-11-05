package FamiliarizandoComaJava_Atv1.Atv3_Vetores;

import java.util.Scanner;

public class DobrandoUmVetor {
    public static void main(String[] args) {

        //Declarando Variáveis
        int[] numeros = new int[5];
        int[] dobroNumeros = new int[5];
        Scanner sc = new Scanner(System.in);

        //Recebendo valores do usuario
        System.out.println("\n =========== Dobrando 5 números ============");


        for (int i = 0; i < numeros.length; i++) { //Cria variável i, que se repete até o fim da matriz

            //Repetindo até o fim do vetor
            System.out.println("Digite o valor do " + (i+1) + "° número: ");
            numeros[i] = sc.nextInt();
            dobroNumeros[i] += (numeros[i]*2);
        }

        //Exibindo os números
        System.out.println("\n==== Exibindo números: =====");


        //Vetor original
        System.out.println("\nVetor original: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print( numeros[i] + " ");
        }

        //Vetor em dobro
        System.out.println("\nVetor dobrado: ");
        for (int i = 0; i < dobroNumeros.length; i++) {
            System.out.print( dobroNumeros[i] + " ");
        }


        System.out.println("\n======= Sistema Finalizado! ======");
        sc.close();

    }
}
