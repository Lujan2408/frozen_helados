package org.example;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner readKeyboard = new Scanner(System.in);

    // Helados Frozen

    // Asignar variables para el precio de los helados
    double heladoSimple = 12.00;
    double heladoDoble = 23.00;
    double heladoEspecial = 8.00;

    // Asignar variables para la cantidad vendida de cada tipo de helado
    int cantidadHeladoSimple = 15;
    int cantidadHeladoDoble = 20;
    int cantidadHeladoEspecial = 10;

    // Asignar variables para los datos del cliente
    String nombreCliente;
    String telCliente;
    String direccionCliente;
    String idCliente;
    String correoCliente;
    int edadCliente;
    String heladoFavCliente;
    String comentarioCliente;

    System.out.println("Escribe tu nombre: ");
    nombreCliente = readKeyboard.nextLine();

    System.out.println("Escribe tu telefono:");
    telCliente = readKeyboard.nextLine();

    System.out.println("Ingresa tu direccion:");
    direccionCliente = readKeyboard.nextLine();

    System.out.println("Ingresa tu cedula: ");
    idCliente = readKeyboard.nextLine();

    System.out.println("Ingresa tu correo: ");
    correoCliente = readKeyboard.nextLine();

    System.out.println("¿Cual es tu edad? ");
    edadCliente = readKeyboard.nextInt();
    readKeyboard.nextLine();

    System.out.println("Cual es tu helado favorito? ");
    heladoFavCliente = readKeyboard.nextLine();

    System.out.println("Tienes algun comentario para nosotros? ");
    comentarioCliente = readKeyboard.nextLine();

    // Imprimir datos del cliente por consola
    System.out.println("Tu nombre es: " + nombreCliente);
    System.out.println("tu telefono es: " + telCliente);
    System.out.println("Tu direccion es: " + direccionCliente);
    System.out.println("Tu cedula es: " + idCliente);
    System.out.println("Tu correo electronico es: " + correoCliente);
    System.out.println("Tu edad es: " + edadCliente);
    System.out.println("Super es uno de los más vendidos y deliciosos !! " + heladoFavCliente);
    System.out.println("Gracias por tu comentario ! " + comentarioCliente);


  }
}