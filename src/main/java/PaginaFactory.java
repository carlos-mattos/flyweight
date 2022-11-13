
import java.util.HashMap;
import java.util.Map;

public class PaginaFactory {

    private static Map<String, Pagina> paginas = new HashMap<>();

    public static Pagina getPagina(String nome, String url) {
        Pagina pagina = paginas.get(nome);

        if (pagina == null) {
            pagina = new Pagina(nome, url);
            paginas.put(nome, pagina);
        }

        return pagina;
    }

    public static int getTotalPaginasRenderizadas() {
        return paginas.size();
    }

}
