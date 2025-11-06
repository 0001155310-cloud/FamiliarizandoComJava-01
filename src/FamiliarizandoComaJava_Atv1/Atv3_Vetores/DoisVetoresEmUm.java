package FamiliarizandoComaJava_Atv1.Atv3_Vetores;

import java.util.Scanner;

public class DoisVetoresEmUm {
    public static void main(String[] args) {

        //Declarando Variáveis
        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];
        int[] vetorFinal = new int[10];

        Scanner sc = new Scanner(System.in);

        //Declarando Vetor 1
        System.out.println("\n =========== Vetor 1 ============");

        for (int i = 0; i < vetor1.length; i++) { //Cria variável i, que se repete até o fim da matriz

            //Repetindo até o fim do vetor
            System.out.println("Digite o valor do " + (i+1) + "° número: ");
            vetor1[i] = sc.nextInt();
        }

        //Declarando Vetor 2
        System.out.println("\n =========== Vetor 2 ============");

        for (int i = 0; i < vetor2.length; i++) { //Cria variável i, que se repete até o fim da matriz

            //Repetindo até o fim do vetor
            System.out.println("Digite o valor do " + (i+1) + "° número: ");
            vetor2[i] = sc.nextInt();
        }


        //Declarando o vetor final
        System.out.println("\n =========== Vetor Final ============");


        //Pegando valores do vetor 1
        for (int j = 0; j < vetor1.length; j++) {
            vetorFinal[j] = vetor1[j];
        }


        //Pegando valores do vetor 2
        for (int j = 0; j < vetor2.length; j++) {
            vetorFinal[j + vetor1.length] = vetor2[j];
        }


       //Exibindo o Vetor Final
        for (int i = 0; i < vetorFinal.length; i++) {
            System.out.println("Posição " + (i+1) + ": " + vetorFinal[i]);
        }

        System.out.println("\n======= Sistema Finalizado! ======");
        sc.close();
    }
}
