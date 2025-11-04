package FamiliarizandoComaJava_Atv1;

import java.util.Scanner;

import java.text.DecimalFormat;


public class ConversorDeMoeda {
    public static void main(String[] args) {

        // Declarando variáveis
        String moeda;
        double real = 0;
        double dolar = 0;
        double euro = 0;


        Scanner sc = new Scanner(System.in); //Inicia o Scanner
        DecimalFormat df = new DecimalFormat("#.##"); //Correção e formatação

        System.out.println("\n========== Sistema de Conversão de Moeda =========");
        System.out.println("Qual moeda deseja converter? (1. Real / 2. Dólar / 3. Euro): ");
        moeda = sc.next(); //Recebe a moeda

        //REAL
        if (moeda.equals("1") || moeda.contains("re")) { //Se moeda for REAL

            System.out.println("\nDigite um valor em REAIS (R$): ");
            real = sc.nextDouble();
            dolar = 0.19 * real; //Convertendo para DOLAR
            euro = 0.16 * real; //Convertendo para EURO

            //Menssagem final
            System.out.println("\n ==== Dólar ====");
            System.out.println("R$" + real + " equivalem a: US$" + df.format(dolar) + " dólares!");

            System.out.println("\n ==== Euro ====");
            System.out.println("R$" + real + " equivalem a: €" + df.format(euro) + " euros!");

        }

        //DOLAR
        else if (moeda.equals("2") || moeda.contains("lar")) { //se moeda DOLAR

            System.out.println("\nDigite um valor em DÓLARES (US$): ");
            real = sc.nextDouble();
            real = 5.38 * dolar; //Convertendo para REAIS
            euro = 0.86 * dolar; //Convertendo para EURO

            //Menssagem final
            System.out.println("\n ==== Real ====");
            System.out.println("US$" + dolar + " equivalem a: R$" + df.format(real) + " reais!");

            System.out.println("\n ==== Euro ====");
            System.out.println("US$" + real + " equivalem a: €" + df.format(euro) + " euros!");

        }

        //DOLAR
        else if (moeda.equals("3") || moeda.contains("eur")) { //se moeda EURO

            System.out.println("\nDigite um valor em EUROS (€): ");
            real = sc.nextDouble();
            real = 6.63 * euro; //Convertendo para REAIS
            dolar = 1.16 * euro; //Convertendo para DOLARES

            //Menssagem final
            System.out.println("\n ==== Real ====");
            System.out.println("€" + euro + " equivalem a: R$" + df.format(real) + " dólares!");

            System.out.println("\n ==== Dólar ====");
            System.out.println("€" + euro + " equivalem a: US$" + df.format(dolar) + " dólares!");

        }

        System.out.println("\n=== Programa Finalizado! ===");
        sc.close();//Finaliza o Scanner
    }
}