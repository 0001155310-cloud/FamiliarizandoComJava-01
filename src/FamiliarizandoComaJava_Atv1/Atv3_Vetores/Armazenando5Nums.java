package FamiliarizandoComaJava_Atv1.Atv3_Vetores;

import java.util.Scanner;

public class Armazenando5Nums {
    public static void main(String[] args) {

        //Declarando variáveis

        int[] numeros = new int[5];
        Scanner sc = new Scanner(System.in);

        //Recebendo valores do usuario
        System.out.println("\n =========== Vetor de 5 números ============");


        for (int i = 0; i < numeros.length; i++) { //Cria variável i, que se repete até o fim da matriz

            //Repetindo até o fim do vetor
            System.out.println("Digite o valor do " + (i+1) + "° número: ");
            numeros[i] = sc.nextInt();
        }

        //Exibindo os números
        System.out.println("\nExibindo números: ");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println((i+1) + "° Número : " + numeros[i]);

        }


        System.out.println("======= Sistema Finalizado! ======");
        sc.close();
    }
}
