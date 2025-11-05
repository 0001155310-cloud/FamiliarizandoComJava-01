package FamiliarizandoComaJava_Atv1.Atv1_30questoes;

import java.util.Scanner;

public class SomandoDe1aN {
    public static void main(String[] args) {

        //Declarando variáveis
        int numero;
        int soma = 0;

        //Recebendo valores
        Scanner sc = new Scanner(System.in);
        System.out.println("\n========== Somando de 1 a N =========");
        System.out.println("Digite o número que deseja fazer a soma: ");
        numero = sc.nextInt();

        //Realizando a soma
        System.out.println("\nRealizando soma...");
        for (int i = 1; i <= numero; i++) {//Declara i, que enquanto for menor que NUMERO, realiza ação e adiciona +1
            System.out.println(soma + " + " + i + " = " + (soma + i)); //Exibe na tela a conta
            soma = soma + i; //Soma se torna o valor anterior + o número atual

        }

        System.out.println("\nA soma dos números de 1 até " + numero + " é igual a: " + soma);
        System.out.println("\n=== Programa Finalizado! ===");

        sc.close();//Finaliza o Scanner
    }
}
