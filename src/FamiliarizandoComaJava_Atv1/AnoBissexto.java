package FamiliarizandoComaJava_Atv1;

import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {

        //Declarando variáveis
        int ano;
        boolean bissexto;

        //Recebendo valores
        Scanner sc = new Scanner(System.in);

        System.out.println("\n=========== Ano Bissexto =========");
        System.out.println("Digite o ano: ");
        ano = sc.nextInt();

        //Condição para anos centenários (1900, 2000, etc)
       if (ano % 100 == 00) {
           if (ano % 400 == 0) {
               bissexto = true;

           } else {
               bissexto= false;
           }
       } else if (ano % 4 == 0) {
           bissexto = true;

       } else {
           bissexto= false;
       }

       //Mostrando menssagem final
        System.out.println("O ano " + ano + " foi bissexto?: " + bissexto);


        System.out.println("\n=== Programa Finalizado! ===");
        sc.close();//Finaliza o Scanner

    }
}
