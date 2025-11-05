package FamiliarizandoComaJava_Atv1.Atv1_30questoes;

import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {

        //Declarando variaveis
        int numero;
        int resultado;
        boolean primo;


        //Recebendo o número
        Scanner sc = new Scanner(System.in); //Declara a função de input

        System.out.println("Digite o número: ");
        numero = sc.nextInt(); //Recebe o valor do numero

        //Declarando se a divisão por 2 tem resto ou não
        resultado = numero % 2;

        //Condição para declarar se é primo ou não
        System.out.println("\n ===== Verificando número =======");

        if (numero <= 1) {
            primo = false;

        } else if (numero == 2) {
            primo = true;

        } else if (numero % 2 == 0) {
            primo = false;

        } else {
            for (int i = 3; i*i <= numero; i += 2) {
                if (numero % i == 0) {
                    primo = false;

                }
            }
        }

        primo = true;

        if (primo == true) {

            System.out.println("O número " + numero + " é primo");
            System.exit(0);

        } else {

            System.out.println("O número " + numero + " não é primo");
            System.exit(0);

        }


        System.out.println("\n=== Programa Finalizado! ===");
        sc.close(); //Finaliza o Scanner
    }

}
