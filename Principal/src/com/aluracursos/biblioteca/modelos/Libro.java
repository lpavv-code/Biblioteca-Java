package com.aluracursos.biblioteca.modelos;

public class Libro {
  private String titulo;
  private String autor;
  private int anoDePublicacion;

  public Libro(String titulo, String autor, int anoDePublicacion) {
    this.titulo = titulo;
    this.autor = autor;
    this.anoDePublicacion = anoDePublicacion;
  }

  public String getTitulo() {
    return titulo;
  }

    public String getAutor() {
    return autor;
  }

  public int getAnoDePublicacion() {
    return anoDePublicacion;
  }

  @Override
  public String toString() {
    return "\n* Título: "+this.getTitulo() + " | "+
            "Autor: "+this.getAutor() + " | "+
            "Año de publicación: "+this.getAnoDePublicacion();
  }


}
