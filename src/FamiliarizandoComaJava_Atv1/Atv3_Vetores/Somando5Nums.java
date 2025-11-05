package FamiliarizandoComaJava_Atv1.Atv3_Vetores;

import java.util.Scanner;

public class Somando5Nums {
    public static void main(String[] args) {

        //Declarando variáveis
        int[] numeros = new int[5];
        int soma = 0;
        Scanner sc = new Scanner(System.in);

        //Recebendo valores do usuario
        System.out.println("\n =========== Somando 5 números ============");

        for (int i = 0; i < numeros.length; i++) { //Cria variável i, que se repete até o fim da matriz

            //Repetindo até o fim do vetor
            System.out.println("Digite o valor do " + (i+1) + "° número: ");
            numeros[i] = sc.nextInt();

            soma += numeros[i];
        }

        //Exibindo a soma total
        System.out.println("\nA soma de todos os números do vetor é: " + soma);


        System.out.println("======= Sistema Finalizado! ======");
        sc.close();
    }
}
