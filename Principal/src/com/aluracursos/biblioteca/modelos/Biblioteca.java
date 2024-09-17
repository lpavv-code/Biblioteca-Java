package com.aluracursos.biblioteca.modelos;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
  private List<Libro> libros;

  public Biblioteca() {
    libros = new ArrayList<Libro>();
  }

  public void agregarLibro(Libro libro) {
    libros.add(libro);
    System.out.println("Libro agregado exitosamente");
  }

  public void buscarLibro(String buscarTitulo) {
    boolean encontrado = false;
    for (Libro libro : libros) {
      if (libro.getTitulo().toLowerCase().contains(buscarTitulo.toLowerCase())) {
        System.out.println("Libro encontrado:\n"+ libro);
        encontrado = true;
        break;
      }
    }if (!encontrado){
      System.out.println("Libro no se encuentra registrado!");
    }
  }

  public void mostrarLibro(){
    if (libros.isEmpty()) {
      System.out.println("No hay libros en la biblioteca.");
    }else {
      System.out.println("\nLista de libros:");
      for (Libro libro : libros) {
        System.out.print(libro);
      }
    }
  }

}
