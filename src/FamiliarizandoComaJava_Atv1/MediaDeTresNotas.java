package FamiliarizandoComaJava_Atv1;

import java.util.Scanner;

public class MediaDeTresNotas {
    public static void main(String[] args) {

        //Declarando variáveis
        int nota1 = 0;
        int nota2 = 0;
        int nota3 = 0;
        int soma = 0;
        double media = 0;

        //Recebendo valores
        Scanner sc = new Scanner(System.in);
        System.out.println("\n=========== Média de 3 notas =========");
        System.out.println("Digite a 1° nota: ");
        nota1 = sc.nextInt();
        soma = soma + nota1;


        System.out.println("Digite a 2° nota: ");
        nota2 = sc.nextInt();
        soma = soma + nota2;

        System.out.println("Digite a 3° nota: ");
        nota3 = sc.nextInt();
        soma = soma + nota3;

        //Mostrando resultado
        media = soma / 3;
        System.out.println("A média de todas as notas é: " + media);


        System.out.println("\n=== Programa Finalizado! ===");
        sc.close();//Finaliza o Scanner



    }
}
