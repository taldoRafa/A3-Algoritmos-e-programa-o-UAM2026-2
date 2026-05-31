import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcao = 0;

        while (opcao != 3) {

            System.out.println("\n=== SISTEMA PRINCIPAL ===");
            System.out.println("1 - Sistema Marmitas");
            System.out.println("2 - Sistema Restaurante");
            System.out.println("3 - Sair");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:

                    SistemaMarmitas sistemaMarmitas = new SistemaMarmitas();
                    sistemaMarmitas.iniciar();

                    break;

                case 2:

                    SistemaRestaurante sistemaRestaurante = new SistemaRestaurante();
                    sistemaRestaurante.iniciar();

                    break;

                case 3:

                    System.out.println("Encerrando sistema...");
                    break;

                default:

                    System.out.println("Opção inválida.");
            }
        }

        sc.close();
    }
}