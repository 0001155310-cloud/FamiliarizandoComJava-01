package FamiliarizandoComaJava_Atv1.Atv1_30questoes;


public class TabuadaCompleta {
    public static void main(String[] args) {

        System.out.println("\n===== Tabuada Completa de 1 a 10 =====\n");

        // Percorre os números de 1 a 10
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabuada do " + i + ":");

            // Percorre os multiplicadores de 1 a 10
            for (int j = 1; j <= 10; j++) {
                    System.out.println(i + " x " + j + " = " + (i * j));
            }

            System.out.println(); // linha em branco entre tabuadas
        }

        System.out.println("\n=== Programa Finalizado! ===");
    }
}

