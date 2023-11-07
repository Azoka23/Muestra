
package ej3extraguia5_2;


import java.util.Objects;


public class Libros {
    private String titulo;
    private String autor;
    private int nroEjemplares;
    private int nroEjemplaresprestados;

    public Libros(String titulo, String autor, int nroEjemplares, int nroEjemplaresprestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.nroEjemplares = nroEjemplares;
        this.nroEjemplaresprestados = nroEjemplaresprestados;
    }
    
    public Libros(){
    
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNroEjemplares() {
        return nroEjemplares;
    }

    public void setNroEjemplares(int nroEjemplares) {
        this.nroEjemplares = nroEjemplares;
    }

    public int getNroEjemplaresprestados() {
        return nroEjemplaresprestados;
    }

    public void setNroEjemplaresprestados(int nroEjemplaresprestados) {
        this.nroEjemplaresprestados = nroEjemplaresprestados;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + Objects.hashCode(this.titulo);
        hash = 43 * hash + Objects.hashCode(this.autor);
        hash = 43 * hash + this.nroEjemplares;
        hash = 43 * hash + this.nroEjemplaresprestados;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libros other = (Libros) obj;
        if (this.nroEjemplares != other.nroEjemplares) {
            return false;
        }
        if (this.nroEjemplaresprestados != other.nroEjemplaresprestados) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        return true;
    }
    

    @Override
    public String toString() {
        return "Libros{" + "titulo=" + titulo + ", autor=" + autor + ", nroEjemplares=" + nroEjemplares + ", nroEjemplaresprestados=" + nroEjemplaresprestados + '}';
    }
    
    
    
    public static void prestamo(){
    
    }
}
