package FamiliarizandoComaJava_Atv1.Atv1_30questoes;

import java.util.Scanner;

public class TabuadaComFOR {
    public static void main(String[] args) {

        //Declarando Variáveis
        int numero;
        int multiplicacao = 0;

        //Iniciando o Scanner(Input) para a inserção de valores nas variáveis
        Scanner sc = new Scanner(System.in);

        //Recebendo os Valores
        System.out.println("\n========== Tabuada =========");
        System.out.println("Digite um número para receber a tabuada: ");
        numero = sc.nextInt(); //Recebendo o valor do número

        //Mostrando a tabuada
        System.out.println("\nCriando tabuada...");
        for (int i = 1; i < 11; i++) { //Declaraçlão da variável i. Enquanto for menor que 10, adicionar + 1

            //Mostrando na tela a tabuada
            multiplicacao = numero*i;
            System.out.println(i + " x " + numero + " = " + multiplicacao);


        }


        System.out.println("\n=== Programa Finalizado! ===");
        sc.close(); //Finalizando Scanner
    }
}
