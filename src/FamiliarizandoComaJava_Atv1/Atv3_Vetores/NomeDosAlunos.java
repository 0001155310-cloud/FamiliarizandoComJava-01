package FamiliarizandoComaJava_Atv1.Atv3_Vetores;

import java.util.Arrays;
import java.util.Scanner;

public class NomeDosAlunos {
    public static void main(String[] args) {

        //Declarando variáveis
        String[] nomeAlunos = new String[10];
        String busca;

        Scanner sc = new Scanner(System.in);

        System.out.println("\n =========== Sistema de Busca ============");
        for (int i = 0; i < nomeAlunos.length; i++) {
            System.out.println("Digite o nome do " + (i+1) + "° aluno: ");
            nomeAlunos[i] = sc.next();
        }


        //Buscando Alunos
        System.out.println("\n =========== Buscando alunos ============");
        System.out.println("\nDigite o nome que você está buscando: ");
        busca = sc.next();

        int indice = Arrays.binarySearch(nomeAlunos, busca); //Class importada (Pesquisei e achei isso)

        if (indice >= 0) {
            int posicao = indice +1;
            System.out.println("\nO nome \"" + busca + "\" está na lista");
        } else {
            System.out.println("\nO nome  \"" + busca + "\" não foi encontrado na lista.");
        }

        System.out.println("\n=== Programa Finalizado! ===");
        sc.close();
    }
}
