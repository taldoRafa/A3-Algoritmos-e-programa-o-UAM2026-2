public class ListaR extends LoginBase {

    @Override
    public void carregar() {

        adicionarUsuario(new Usuario("Ana.rrr@gmail", "1234A"));
        adicionarUsuario(new Usuario("Bruno.rrr@gmail", "1234B"));
        adicionarUsuario(new Usuario("Arthur.rrr@gmail", "1234C"));

    }
}