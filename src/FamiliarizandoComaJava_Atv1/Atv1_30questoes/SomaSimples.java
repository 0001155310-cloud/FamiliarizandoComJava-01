package FamiliarizandoComaJava_Atv1.Atv1_30questoes;

import java.util.Scanner;

public class SomaSimples {
    public static void main(String[] args) {

        //Declarando variáveis
        float n1; float n2; double soma;

        Scanner sc = new Scanner(System.in); //Declara a função de input

        System.out.println("Digite o primeiro número: ");
        n1 = sc.nextFloat(); //Recebe o valor do usuário

        System.out.println("Digite o segundo número: ");
        n2 = sc.nextFloat(); //Recebe o valor do usuário

        soma = n1+n2; //Declara a soma como o valor 1 + valor 2

        //Exibindo o resultado da soma
        System.out.println("\nSomando...");
        System.out.println(n1 + " + " + n2 + " = " + soma);
        System.out.println("\n=== Programa Finalizado! ===");

        sc.close(); //Finaliza o scanner
    }
}
