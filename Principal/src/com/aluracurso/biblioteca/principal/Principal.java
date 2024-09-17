package com.aluracurso.biblioteca.principal;

import com.aluracursos.biblioteca.modelos.Biblioteca;
import com.aluracursos.biblioteca.modelos.Libro;

import java.util.Scanner;

public class Principal {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Biblioteca biblioteca = new Biblioteca();
    int opcion = 0;
    String menu = """            
            \nOpciones :
            1. Agregar libro
            2. Buscar libro
            3. Mostrar todos los libros
            4. Salir
            Elige una opción :
            """;

    System.out.println("\nBienvenido a la Biblioteca!");

    do{
      System.out.print(menu);
      opcion = sc.nextInt();
      sc.nextLine(); // Limpiar buffer

      switch(opcion) {
        case 1:
          System.out.print("Ingresa el título del libro: ");
          String titulo = sc.nextLine();
          System.out.print("Ingresa el autor del libro: ");
          String autor = sc.nextLine();
          System.out.print("Ingresa el año de publicación: ");
          int anoDePublicacion = sc.nextInt();
          sc.nextLine(); // Limpiar buffer

          Libro nuevoLibro = new Libro(titulo, autor, anoDePublicacion);
          biblioteca.agregarLibro(nuevoLibro);
          break;

        case 2:
          System.out.print("Busqueda :" +
                  "\nIngresa el titulo del libro a buscar: ");
          String buscarTitulo = sc.nextLine();
          biblioteca.buscarLibro(buscarTitulo);
          break;

        case 3:
          biblioteca.mostrarLibro();
          break;

        case 4:
          System.out.println("Nos vemos pronto");
          break;

        default:
          System.out.println("Opción no valida");
      }
    }while(opcion != 4);
    sc.close();
  }
}