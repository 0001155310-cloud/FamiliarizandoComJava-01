package FamiliarizandoComaJava_Atv1.Atv1_30questoes;

import java.util.Scanner;

import java.util.Random;

public class JogoDeAdivinhacao {
    public static void main(String[] args) {

        //Declarando variáveis
        int tentativa;
        int quantTentativas = 1;
        String continuar = "s";

        //Recebendo Valores do jogador
        Scanner sc = new Scanner(System.in); //Inicia o

        while (continuar.toLowerCase().equals("s")) {

            Random randomGenerator = new Random(); //Cria um objeto aleatório
            int numEscolhido = randomGenerator.nextInt(100); //Cria o numero com limite entre 0 e 100

            System.out.println("\n========== Jogo de Adivinhação =========");
            System.out.println("Tente adivinnhar o número que eu estou pensando (entre 0 e 100): ");
            tentativa = sc.nextInt(); //Recebe o número do jogador

            //Descobrindo se o número é certo ou não
            while (tentativa != numEscolhido) {

                //Se for maior que o escolhido
                if (tentativa > numEscolhido) {
                    System.out.println("\nO número " + tentativa + " é muito ALTO!");
                    System.out.println("Tente um número menor: ");
                    quantTentativas++;
                    tentativa = sc.nextInt(); //Recebe o número do jogador

                }

                //Se for menor que o escolhido
                if (tentativa < numEscolhido) {
                    System.out.println("\nO número " + tentativa + " é muito BAIXO!");
                    System.out.println("Tente um número maior: ");
                    quantTentativas++;
                    tentativa = sc.nextInt(); //Recebe o número do jogador

                }

            }

            //Caso o número seja o certo
            System.out.println("\nParabéns! O número escolhido era: " + numEscolhido);
            System.out.println("Você acertou o número com " + quantTentativas + " tentativas!");


            //Para jogar novamente
            System.out.println("\nDeseja jogar novamente? (S/N):");
            continuar = sc.next();
        }

        System.out.println("\n=== Programa Finalizado! ===");
        sc.close();


    }
}
