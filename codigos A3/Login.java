import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HistoricoDeRegistrosNome registroNome = new HistoricoDeRegistrosNome();
        HistoricoDeRegistrosSenha registroSenha = new HistoricoDeRegistrosSenha();
        registroNome.carregar();
        registroSenha.carregar();
	
        final String EMAIL_VALIDO = registroNome.concatenar();
        final String SENHA_CORRETA = registroSenha.concatenar();
        int tentativas = 4;
        boolean acessoPermitido = false;
        
        System.out.println("=== Login ===\n");

        while (tentativas > 0 && !acessoPermitido) {

            System.out.print("Digite o Email: " );
            String emailDigitado = sc.next();

            System.out.print("Digite a Senha: " );
            String senhaDigitada = sc.next();

            
            if ( SENHA_CORRETA.contains(senhaDigitada) && EMAIL_VALIDO.contains(emailDigitado)) {
                acessoPermitido = true;
                System.out.println("\n Confirmação bem sucedida, acesso autorizado.\n");

            } else {
                tentativas--;
                if (tentativas > 0) {
                    System.out.println("Senha ou email invalidos! Tentativas restantes: " + tentativas);
                } else {
                    System.out.println("Acesso bloqueado! Numero maximo de tentativas excedidas.");
                }
            }
        }

        sc.close();
    }
}
