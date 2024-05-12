package main.java.list.Pesquisa;

public class Livro {
    private String titulo;
    private String author;
    private int anoPublicacao;

    public Livro(String titulo, String author, int anoPublicacao) {
        this.titulo = titulo;
        this.author = author;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAuthor() {
        return author;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", author='" + author + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                '}';
    }
}
