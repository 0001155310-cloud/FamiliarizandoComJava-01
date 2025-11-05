package FamiliarizandoComaJava_Atv1.Atv1_30questoes;

import java.util.Scanner;

public class ClassificacaoDeIdade {

    public static void main(String[] args) {

        //Declarando variáveis
        int idade;
        String classificacaoIdade = "INDEFINIDO";

        //Iniciando o Scanner(Input) para a inserção de valores nas variáveis
        Scanner sc = new Scanner(System.in);

        //Recebendo os Valores
        System.out.println("\n========== Classificação de Idade =========");
        System.out.println("Digite a sua idade aqui: ");
        idade = sc.nextInt(); //Recebendo o valor da idade

        //Comparando a idade

        if (idade < 3) { //Se idade for menor que 12:
            classificacaoIdade = "bebê";


        } else if (idade < 12) { //Se idade for menor que 12:
            classificacaoIdade = "criança";
            System.exit(0);

        } else if (idade < 18) { //Se idade for menor que 18:
            classificacaoIdade = "adolescente";

        } else if (idade < 60) { //Se idade for maior ou igual a 18:
            classificacaoIdade = "adulto";

        } else if (idade < 150) { //Se idade for maior ou igual a 60:
            classificacaoIdade = "idoso";

        } else if (idade >= 150) {
            classificacaoIdade = "defunto";

        } else { //Se nenhum dos passos anteriores foi realizado, mostrar menssagem de erro:
            System.out.println("ERRO COM A VARIÁVEL " + idade + "! TENTE NOVAMENTE!");
            System.exit(0);
        }

        //Mostrando menssagem final
        System.out.println("Você tem " + idade + " anos de idade, logo, é considerado um(a) " + classificacaoIdade.toLowerCase() + "!");
        System.out.println("\n=== Programa Finalizado! ===");

        sc.close();//Finaliza o Scanner

    }
}