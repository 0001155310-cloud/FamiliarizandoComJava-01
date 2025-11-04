package FamiliarizandoComaJava_Atv1;

import java.util.Scanner;

public class SimuladorCaixaEletronico {
    public static void main(String[] args) {

        // Declarando variáveis
        float valorCompra;
        float dinheiroRecebido;
        float troco;

        double[] valores = {100, 50, 20, 10, 5, 1, 0.50, 0.25, 0.10}; //Declarando notas e moedas
        int[] quantidade = new int[valores.length]; //Declarando a quantidade de cada nota / moeda

        Scanner sc = new Scanner(System.in); //Inicia o Scanner

        System.out.println("\n========== Sistema de Caixa Eletrônico =========");
        System.out.println("Digite o valor final da compra: ");
        valorCompra = sc.nextFloat(); //Recebe o valor da compra

        System.out.println("Digite o valor recebido (utilizando vírgula!): ");
        dinheiroRecebido = sc.nextFloat(); //Recebe o valor do cliente

        // Calcula o troco corretamente
        troco = dinheiroRecebido - valorCompra;

        // Caso esteja devendo
        if (troco < 0) {
            System.out.println("\nO cliente está te devendo R$" + (troco * -1) + "!");
            System.out.println("Peça para o cliente completar o valor.");
            sc.close();
            System.exit(0);
        }

        // Caso seja pagamento exato
        if (troco == 0) {
            System.out.println("\nO troco não será necessário! Pagamento exato.");
            sc.close();
            System.exit(0);
        }

        // Caso haja troco
        System.out.println("\n==== Calculando troco... ====");
        System.out.println("Troco total: R$ " + troco);

        // Calculando quantidade de notas e moedas
        for (int i = 0; i < valores.length; i++) {
            while (troco >= valores[i]) {
                troco -= valores[i];
                quantidade[i]++;
            }
        }

        System.out.println("\n===== Troco entregue =====");
        for (int i = 0; i < valores.length; i++) {
            if (quantidade[i] > 0) {
                if (valores[i] >= 5) {
                    System.out.println("Entregue " + quantidade[i]+ " notas de R$" + valores[i]);
                } else {
                    System.out.println("Entregue " +  quantidade[i] + " moedas de R$ " + valores[i]);
                }
            }
        }

        sc.close();
    }
}