package FamiliarizandoComaJava_Atv1.Atv1_30questoes;

import java.util.Scanner;

public class FatorialdeUmNumero {
    public static void main(String[] args) {


        //Declarando variáveis
        int numero; int resultado = 1;

        Scanner sc = new Scanner(System.in); //Declara a função de input

        System.out.println("\n========== Calculando Fatorial =========");

        System.out.println("Digite o número para realizar a fatoração: ");
        numero = sc.nextInt(); //Recebe o valor do usuário

        if (numero < 0) {
            System.out.println("Impossível calcular fatorial de números negativos!");
            sc.close();
            System.exit(0);

        } else if (numero == 0) {

            System.out.println("\n ========== Resultado ============");
            System.out.println( numero + "! (fatorial) = " + resultado);
            sc.close();
            System.exit(0);
        }


        //Calculando o fatorial
        System.out.println("Calculando...");

        for (int i = numero; i >= 1; i--) {

            System.out.println(resultado + " x " + i + " = " + (resultado * i));
            resultado = resultado * i;
        }

        //Menssagem final
        System.out.println("\n ========== Resultado ============");
        System.out.println( numero + "! (fatorial) = " + resultado);

        System.out.println("\n=== Programa Finalizado! ===");
        sc.close(); //Finalizando Scanner
    }
}
