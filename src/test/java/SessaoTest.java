import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SessaoTest {

    @Test
    void deveRetornarUsuariosNaSessao() {
        Sessao sessao = new Sessao();

        sessao.renderizar("primeiro@gmail.com.br", "home", "https://www.teste.com.br/home");
        sessao.renderizar("segundo@gmail.com.br", "home", "https://www.teste.com.br/home");
        sessao.renderizar("terceiro@gmail.com.br", "home", "https://www.teste.com.br/home");

        List<String> saida = Arrays.asList(
                "Usuario{email='primeiro@gmail.com.br', pagina='home', url='https://www.teste.com.br/home'}",
                "Usuario{email='segundo@gmail.com.br', pagina='home', url='https://www.teste.com.br/home'}",
                "Usuario{email='terceiro@gmail.com.br', pagina='home', url='https://www.teste.com.br/home'}");

        assertEquals(saida, sessao.obterUsuariosNaSessao());
    }

    @Test
    void deveRetornarTotalDePaginasRenderizadas() {
        Sessao sessao = new Sessao();

        sessao.renderizar("primeiro@gmail.com.br", "home", "https://www.teste.com.br/home");
        sessao.renderizar("segundo@gmail.com.br", "home", "https://www.teste.com.br/home");
        sessao.renderizar("terceiro@gmail.com.br", "home", "https://www.teste.com.br/home");
        sessao.renderizar("quarto@gmail.com.br", "settings", "https://www.teste.com.br/settings");

        assertEquals(2, PaginaFactory.getTotalPaginasRenderizadas());
    }


}