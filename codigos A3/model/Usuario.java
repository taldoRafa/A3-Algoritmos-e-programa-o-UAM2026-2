public class Usuario {

    private String email;
    private String senha;

    // Construtor completo
    public Usuario(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    // SOBRECARGA
    public Usuario(String email) {
        this.email = email;
        this.senha = "123456";
    }

    // Getters
    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    // Setters
    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}