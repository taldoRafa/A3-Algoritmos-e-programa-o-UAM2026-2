import java.util.ArrayList;

public class LoginBase {

    private ArrayList<Usuario> loginBase01 = new ArrayList<>();

    public void carregar() {

    }

    // Getter da lista
    public ArrayList<Usuario> getLoginBase01() {
        return loginBase01;
    }

    // Método para adicionar usuário
    public void adicionarUsuario(Usuario usuario) {
        loginBase01.add(usuario);
    }

    // Método de autenticação
    public boolean autenticar(String email, String senha) {

        for (Usuario u : loginBase01) {

            if (u.getEmail().equals(email) &&
                u.getSenha().equals(senha)) {

                return true;
            }
        }

        return false;
    }
}