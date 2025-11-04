package FamiliarizandoComaJava_Atv1;

import java.util.Scanner;


public class ValidacaoDeSenha {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String senha;
        boolean valida = false;

        System.out.println("\n===== Validação de Senha =====");

        // Continua pedindo até que a senha seja válida
        while (!valida) {
            System.out.print("\nDigite sua senha (mínimo 6 caracteres): ");
            senha = sc.nextLine();

            // Verifica tamanho mínimo
            if (senha.length() >= 6) {
                System.out.println("Senha válida!");
                valida = true;
            } else {
                System.out.println("Senha inválida! Tente novamente.");
            }
        }

        System.out.println("\n=== Programa Finalizado! ===");
        sc.close();
    }
}
