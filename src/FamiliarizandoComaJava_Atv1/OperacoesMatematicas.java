package FamiliarizandoComaJava_Atv1;

import java.util.Scanner;

public class OperacoesMatematicas {
    public static void main(String[] args) {

        //Declarando variáveis
        float n1; float n2; double soma; double subtracao; double mutiplicacao; double divisao = 0;

        Scanner sc = new Scanner(System.in); //Declara a função de input

        System.out.println("Digite o primeiro número: ");
        n1 = sc.nextFloat(); //Recebe o valor do usuário

        System.out.println("Digite o segundo número: ");
        n2 = sc.nextFloat(); //Recebe o valor do usuário

        soma = n1+n2; //Declara a soma como o valor 1 + valor 2
        subtracao = n1 - n2; //Declara a subtração como o valor 1 - valor 2






        //Mostrando resultados
        System.out.println("\n ==== Resultados ====");
        System.out.println("Soma: " + n1 + " + " + n2 + " = " + soma);
        System.out.println("Subtração: " + n1 + " - " + n2 + " = " + subtracao);


        //Caso divida por zero
        switch ((int) n2) {
            case 0:
                System.out.println("Divisão : Impossível dividir por zero!");
                System.exit(0);
        }


        System.out.println("Divisão: " + n1 + " / " + n2 + " = " + divisao);
        System.out.println("\n=== Programa encerrado! ====");




       sc.close();

    }
}
