import java.util.Scanner;
import java.util.Stack;

public class Livro {

    private String titulo;
    private String categoria;

    //CONSTRUTOR
    Livro(String titulo, String categoria) {
        this.titulo = titulo;
        this.categoria = categoria;
    }
    //GETTERS AND SETTERS

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

}