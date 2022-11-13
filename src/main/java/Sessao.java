import java.util.ArrayList;
import java.util.List;

public class Sessao {

    private List<Usuario> usuarios = new ArrayList<>();

    public void renderizar(String emailUsuario, String nomePagina, String urlPagina) {
        Pagina pagina = PaginaFactory.getPagina(nomePagina, urlPagina);

        Usuario usuario = new Usuario(emailUsuario, pagina);

        usuarios.add(usuario);
    }

    public List<String> obterUsuariosNaSessao() {
        List<String> saida = new ArrayList<String>();

        for (Usuario usuario : this.usuarios) {
            saida.add(usuario.obterUsuario());
        }

        return saida;
    }

}
