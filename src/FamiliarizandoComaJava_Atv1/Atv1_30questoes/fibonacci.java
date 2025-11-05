package FamiliarizandoComaJava_Atv1.Atv1_30questoes;


import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {


        //Declarando variáveis
        int n = 0; // Quantos números de Fibonacci gerar
        int primeiro = 0;
        int segundo = 1;

        Scanner sc = new Scanner(System.in); //Declara a função de input

        System.out.println("\n========== Calculando Fatorial =========");

        System.out.println("Quantos números de Fibonacci deseja gerar: ");
        n = sc.nextInt(); //Recebe o valor do usuário


        System.out.println("\nSequência de Fibonacci (até " + n + " termos):");

        for (int i = 1; i <= n; ++i) {
            System.out.println(primeiro);

            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;


        }
    }
}
