public class Usuario {

    private String email;
    private Pagina paginaAtual;

    public Usuario(String nome, Pagina paginaAtual) {
        this.email = nome;
        this.paginaAtual = paginaAtual;
    }

    public String obterUsuario() {
        return "Usuario{" +
                "email='" + this.email + '\'' +
                ", pagina='" + paginaAtual.getNome() + '\'' +
                ", url='" + paginaAtual.getUrl() + '\'' +
                '}';
    }

}
