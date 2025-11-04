package FamiliarizandoComaJava_Atv1;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {

        //Declarando variaveis
        int numero; int resultado;


        //Recebendo o número
        Scanner sc = new Scanner(System.in); //Declara a função de input

        System.out.println("Digite o número: ");
        numero = sc.nextInt(); //Recebe o valor do numero

        //Declarando se a divisão por 2 tem resto ou não
        resultado = numero % 2;

        //Condição para declarar se é impar ou par
        System.out.println("\n ===== Verificando número =======");

        switch (resultado) {

            case 1:
                System.out.println("O número " + numero + " é ìmpar");
                System.exit(0);
            case 0:
                System.out.println("O número " + numero + " é par");
                System.exit(0);

        }
        System.out.println("\n=== Programa Finalizado! ===");
        sc.close(); //Finaliza o Scanner
    }
}
