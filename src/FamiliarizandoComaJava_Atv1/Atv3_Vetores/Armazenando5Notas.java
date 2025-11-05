package FamiliarizandoComaJava_Atv1.Atv3_Vetores;

import java.util.Scanner;

public class Armazenando5Notas {
    public static void main(String[] args) {

        //Declarando variáveis
        double[] notas = new double[5];
        int soma = 0;
        double media = 0;
        Scanner sc = new Scanner(System.in);

        //Recebendo valores do usuario
        System.out.println("\n =========== Armazenando 5 notas ============");

        for (int i = 0; i < notas.length; i++) { //Cria variável i, que se repete até o fim da matriz
            // Repetindo até o fim do vetor
            System.out.println("Digite o valor da " + (i+1) + "° nota: ");
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }

        //Exibindo a média das notas
        media = (soma/ notas.length);

        System.out.println("\nA média de todas as notas do vetor é: " + media);


        System.out.println("======= Sistema Finalizado! ======");
        sc.close();
    }
}
