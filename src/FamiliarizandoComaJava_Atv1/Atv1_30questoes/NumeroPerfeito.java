package FamiliarizandoComaJava_Atv1.Atv1_30questoes;
import java.util.Scanner;

public class NumeroPerfeito {

    public static void main(String[] args) {

        // Declarando variáveis
        int soma = 0;
        String continuar = "s";

        Scanner sc = new Scanner(System.in);

        System.out.println("\n===== Verificador de Números Perfeitos =====");

        while (continuar.equalsIgnoreCase("s")) {
            System.out.print("Digite um número para verificar: ");
            int numero = sc.nextInt();

            soma = 0; // reseta a soma para cada número

            // Calcula a soma dos divisores próprios
            for (int i = 1; i < numero; i++) {
                if (numero % i == 0) {
                    soma += i;
                }
            }

            // Verifica se é perfeito
            if (soma == numero) {
                System.out.println(numero + " é um número perfeito!");
            } else {
                System.out.println(numero + " NÃO é um número perfeito.");
            }

            System.out.print("\nDeseja verificar outro número? (S/N): ");
            continuar = sc.next();
        }

        System.out.println("\n=== Programa Finalizado! ===");
        sc.close();
    }
}
