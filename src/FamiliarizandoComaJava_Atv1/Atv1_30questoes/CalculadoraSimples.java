package FamiliarizandoComaJava_Atv1.Atv1_30questoes;

import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {

        // Declarando as variaveis
        float valor1; float valor2; String operacao; double resultado = 0;

        Scanner sc = new Scanner(System.in); //Declara a função de input


        //Inicio da calculadora simples
        System.out.println("\n======= Calculadora simples =======");

        System.out.println("Digite o primeiro número: ");
        valor1 = sc.nextFloat(); //Recebe o valor do usuário

        System.out.println("Qual operação deseja realizar? +, -, * ou /: ");
        operacao = sc.next(); //Recebe a operação que o usuário deseja

        System.out.println("Digite o segundo número: ");
        valor2 = sc.nextFloat(); //Recebe o valor do usuário


        //Realizando a operação
        switch (operacao) {
            case "+":
                resultado = valor1 + valor2;
                break;
            case "-":
                resultado = valor1 - valor2;
                break;
            case "*":
                resultado = valor1 * valor2;
                break;
            case "/":
                resultado = valor1 / valor2;
                break;
            case null:
                System.out.println("Operação não reconhecida: " + operacao);
                System.exit(0);
            default:
                System.out.println("Operação não reconhecida: " + operacao);
                System.exit(0);
        }


        if (operacao.equals("/") && valor2 == 0) {

                System.out.println("ERRO! Impossível dividir por zero!");
                System.exit(0);

        }



        //Exibindo o resultado da soma
        System.out.println("\nRealizando operação...");
        System.out.println(valor1 + " " + operacao + " " + valor2 + " = " + resultado);
        System.out.println("\n=== Programa Finalizado! ===");

        sc.close(); //Finaliza o scanner
    }
}
