package FamiliarizandoComaJava_Atv1;

import java.util.Scanner;

public class PontenciaDeUmNumero {
    public static void main(String[] args) {


        //Declarando variáveis
        int numero; int resultado = 1; int potencia;

        Scanner sc = new Scanner(System.in); //Declara a função de input

        System.out.println("\n========== Calculando pontência =========");

        System.out.println("Digite o número: ");
        numero = sc.nextInt(); //Recebe o valor do usuário

        System.out.println("Digite a potência: ");
        potencia = sc.nextInt();

        //Calculando  POTENCIA
        for (int i = 0; i < potencia; i++) {

            resultado = resultado * numero;

        }

        //Menssagem final
        System.out.println("\n ========== Resultado ============");
        System.out.println( numero + " ^ " + potencia + " = " + resultado);

        System.out.println("\n=== Programa Finalizado! ===");
        sc.close(); //Finalizando Scanner
    }
}
