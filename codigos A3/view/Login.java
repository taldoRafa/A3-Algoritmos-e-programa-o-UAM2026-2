import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LoginBase R = new ListaR();
        R.carregar();
        int tentativas = 4;
        boolean acessoPermitido = false;

        
        System.out.println("\n=== Login ===\n");

        while (tentativas > 0 && !acessoPermitido) {

            System.out.print("\nDigite o Email: " );
            String emailDigitado = sc.next();

            System.out.print("\nDigite a Senha: " );
            String senhaDigitada = sc.next();
           
            for(Usuario U : R.LoginBase01){
            if ( U.email.equals(emailDigitado) &&  U.senha.equals(senhaDigitada)) {
                acessoPermitido = true;
                System.out.println("\n Confirmação bem sucedida, acesso autorizado.\n");

            } else {
                tentativas--;
                if (tentativas > 0) {
                  System.out.println("\nSenha ou email invalidos! Tentativas restantes:\n " + tentativas);
                } else {
                    System.out.println("\nAcesso bloqueado! Numero maximo de tentativas excedidas.\n");
              }
            }

            } 
        }
        sc.close();
    }
}
