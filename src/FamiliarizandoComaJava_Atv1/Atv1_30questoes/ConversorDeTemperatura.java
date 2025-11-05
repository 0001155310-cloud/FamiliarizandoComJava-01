package FamiliarizandoComaJava_Atv1.Atv1_30questoes;

import java.util.Scanner;

public class ConversorDeTemperatura {
    public static void main(String[] args) {

        //Declarando variáveis
        String escala = "INDEFINIDO";
        float temperatura = 0;
        String conversao = "INDEFINIDO";
        double farenheit = 0;
        double celsius = 0;

        //Iniciando o Scanner(Input) para a inserção de valores nas variáveis
        Scanner sc = new Scanner(System.in);

        //Recebendo os Valores
        System.out.println("\n========== Conversor de Temperatura =========");
        System.out.println("Qual escala de temperatura deseja inserir? (1. Celsius) / (2.Fahrenheit): ");
        escala = sc.next(); //Recebendo o valor da escala

        //Transformando em minúsculo
        escala = escala.toLowerCase();

        //CELSIUS
        if (escala.equals("1") || escala.contains("c")) { //Se escala for Celsius
            conversao = "Fahrenheit (F°)";
            System.out.println("Digite a temperatura em Celsius (C°): ");
            temperatura = sc.nextFloat();
            farenheit = (double) ((temperatura*1.8) + 32); //Covertendo

            //Menssagem final
            System.out.println(temperatura + "C° equivalem a " + farenheit + "° Farenheit");

        } else if (escala.equals("2") || escala.contains("f")) { //se escala for Fahrenheit
            conversao = "Celsius (C°)";
            System.out.println("Digite a temperatura em Farenheit (F°): ");
            temperatura = sc.nextFloat();
            celsius = (double) ((temperatura - 32)/1.8);//Convertendo

            //Menssagem final
            System.out.println(temperatura + "F° equivalem a " + celsius + "° Celsius");

        }



        System.out.println("\n=== Programa Finalizado! ===");
        sc.close();//Finaliza o Scanner
    }
}
