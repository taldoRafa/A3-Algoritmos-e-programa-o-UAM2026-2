public class ListaD extends LoginBase {

    @Override
    public void carregar() {

        adicionarUsuario(new Usuario("Ana.ddd@gmail", "1234a"));
        adicionarUsuario(new Usuario("Bruno.ddd@gmail", "1234b"));
        adicionarUsuario(new Usuario("Arthur.ddd@gmail", "1234c"));

    }
}