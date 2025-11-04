package FamiliarizandoComaJava_Atv1;

import java.util.Scanner;

public class PositivoNegativoOuZero {
    public static void main(String[] args) {

        //Declarando Variáveis
        int numero = 0;

        //Recebendo valores
        Scanner sc = new Scanner(System.in);

        System.out.println("\n=========== Positivo, Negativo ou Zero =========");
        System.out.println("Digite um número: ");
        numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("O número " + numero + " é Negativo (menor que Zero)!");

        } else if (numero == 0) {
            System.out.println("O número " + numero + " é igual a Zero!");

        } else if (numero > 0) {
            System.out.println("O número " + numero + " é Positivo (maior que Zero)!");

        } else {
            System.out.println("ERRO! TENTE NOVAMENTE");
            System.exit(0);
        }

        System.out.println("\n=== Programa Finalizado! ===");
        sc.close();//Finaliza o Scanner
    }
}
