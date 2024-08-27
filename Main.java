import java.util.ArrayList;
import java.util.List;

class Livro {
  private String isbn;
  private String autor;
  private String editora;
  private String titulo;

  public Livro(String isbn, String autor, String editora, String titulo) {
    this.isbn = isbn;
    this.autor = autor;
    this.editora = editora;
    this.titulo = titulo;
  }

  public String getIsbn() {
    return isbn;
  }

  public String getAutor() {
    return autor;
  }

  public String getEditora() {
    return editora;
  }

  public String getTitulo() {
    return titulo;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Livro other = (Livro) obj;
    if (isbn == null) {
      if (other.isbn != null)
        return false;
    } else if (!isbn.equals(other.isbn))
      return false;
    return true;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
    return result;
  }

  @Override
  public String toString() {
    return "Livro [isbn=" + isbn + ", autor=" + autor + ", editora=" + editora + ", titulo=" + titulo + "]";
  }
}

class Biblioteca {
  private List<Livro> livros = new ArrayList<>();

  public void adicionarLivro(Livro livro) {
    livros.add(livro);
  }

  public void removerLivro(Livro livro) {
    livros.remove(livro);
  }

  public void imprimirLivros() {
    for (Livro livro : livros) {
      System.out.println(livro);
    }
  }

  public boolean existeLivro(Livro livro) {
    return livros.contains(livro);
  }

  public Livro obterLivro(Livro livro) {
    for (Livro l : livros) {
      if (l.equals(livro)) {
        return l;
      }
    }
    return null;
  }

  public boolean estaVazia() {
    return livros.isEmpty();
  }
}