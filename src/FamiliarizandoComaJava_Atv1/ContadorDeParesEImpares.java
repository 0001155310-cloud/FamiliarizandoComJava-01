package FamiliarizandoComaJava_Atv1;

import java.util.Scanner;

public class ContadorDeParesEImpares {
    public static void main(String[] args) {

        //Declarando variáveis
        int pares = 0;
        int impares = 0;
        String continuar = "s";

        System.out.println("\n===== Contador de pares e ímpares =====");
        Scanner sc = new Scanner(System.in);

        while (continuar.contains("s")) {
            System.out.print("\nDigite um número: ");
            int numero = sc.nextInt();

            // Conta direto
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

            System.out.print("Deseja adicionar mais um número? (S/N): ");
            continuar = sc.next();
        }

        System.out.println("\n===== Resultado =====");
        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);

        System.out.println("\n=== Programa Finalizado! ===");
        sc.close();
    }
}