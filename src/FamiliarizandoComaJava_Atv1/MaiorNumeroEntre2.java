package FamiliarizandoComaJava_Atv1;

import java.util.Scanner;

public class MaiorNumeroEntre2 {
    public static void main(String[] args) {

        //Declarando variáveis
        System.out.println("\n========== Maior ou Menor ==============");
        int num1; int num2;

        //Recebendo valores
        Scanner sc = new Scanner(System.in); //Declara a função de input

        System.out.println("Digite o primeiro número: ");
        num1 = sc.nextInt(); //Recebe o valor do usuário

        System.out.println("Digite o segundo número: ");
        num2 = sc.nextInt(); //Recebe o valor do usuário


        //Comparando Números
        System.out.println("\n ===== Verificando números =======");

        if (num1 < num2) { //Se num1 for menor que num2:
            System.out.println("O número " + num1 + " é menor que " + num2);
            System.exit(0);

        } else if (num1 == num2) { //Se num1 for igual a num2:
            System.out.println("O número " + num1 + " é igual ao número " + num2);
            System.exit(0);
        } else if (num1 > num2) { //Se num1 for maior que num2:
            System.out.println("O número " + num1 + " é maior que " + num2);
            System.exit(0);
        } else { //Se nenhum dos passos anteriores foi realizado, mostrar menssagem de erro:
            System.out.println("ERRO INESPERADO! TENTE NOVAMENTE");
            System.exit(0);
        }

        //Finaliza o Scanner
        System.out.println("\n=== Programa Finalizado! ===");
        sc.close();
    }
}
