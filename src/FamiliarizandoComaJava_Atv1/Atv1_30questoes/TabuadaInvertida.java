package FamiliarizandoComaJava_Atv1.Atv1_30questoes;

import java.util.Scanner;

public class TabuadaInvertida {
    public static void main(String[] args) {

        //Declarando Variáveis
        int numero;
        int multiplicacao = 0;

        //Iniciando o Scanner(Input) para a inserção de valores nas variáveis
        Scanner sc = new Scanner(System.in);

        //Recebendo os Valores
        System.out.println("\n========== Tabuada Invertida =========");
        System.out.println("Digite um número para receber a tabuada: ");
        numero = sc.nextInt(); //Recebendo o valor do número

        //Mostrando a tabuada
        System.out.println("\nCriando tabuada...");
        for (int i = 10; i > 0; i--) { //Declaraçlão da variável i. Enquanto for maior que 0, remover - 1

            //Mostrando na tela a tabuada
            multiplicacao = numero*i;
            System.out.println(i + " x " + numero + " = " + multiplicacao);


        }


        System.out.println("\n=== Programa Finalizado! ===");
        sc.close(); //Finalizando Scanner
    }
}
