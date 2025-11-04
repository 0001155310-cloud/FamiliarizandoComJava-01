package FamiliarizandoComaJava_Atv1;

import java.util.Scanner;

import java.time.Duration;

public class ContagemRegressiva {
    public static void main(String[] args) {

        //Declarando variáveis
        int tempo = 10;
        long proximoMomento = System.currentTimeMillis();

        Scanner sc = new Scanner(System.in); //Declara a função de input

        System.out.println("\n========== Contagem Regressiva =========");

        System.out.println("Digite o número para realizar a contagem: ");
        tempo = sc.nextInt(); //Recebe o valor do usuário

        // Preparando contagem
        System.out.println("\nIniciando contagem regressiva...");

        while (tempo > 0) {
            System.out.println("Contagem Regressiva: " + tempo);

            proximoMomento += 1000; // adiciona 1 segundo em milissegundos

            while (System.currentTimeMillis() < proximoMomento) {// loop vazio esperando passar 1 segundo
            }
            tempo--;
        }

        System.out.println("Tempo esgotado!");
    }
}



