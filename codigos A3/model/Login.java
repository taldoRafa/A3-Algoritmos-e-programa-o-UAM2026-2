import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LoginBase r = new ListaR();
        r.carregar();

        int tentativas = 4;
        boolean acessoPermitido = false;

        System.out.println("\n=== LOGIN ===\n");

        while (tentativas > 0 && !acessoPermitido) {

            System.out.print("Digite o Email: ");
            String emailDigitado = sc.next();

            System.out.print("Digite a Senha: ");
            String senhaDigitada = sc.next();

            if (r.autenticar(emailDigitado, senhaDigitada)) {

                acessoPermitido = true;

                System.out.println("\nLogin realizado com sucesso!\n");

            } else {

                tentativas--;

                if (tentativas > 0) {

                    System.out.println("\nEmail ou senha inválidos.");
                    System.out.println("Tentativas restantes: " + tentativas);

                } else {

                    System.out.println("\nAcesso bloqueado!");
                }
            }
        }

        sc.close();
    }
}