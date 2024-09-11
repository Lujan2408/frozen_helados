package org.example;

import java.util.Scanner;

public class Client {

  // Variables
  private String clientName;
  private String clientTel;
  private String clientDir;
  private String clientId;
  private String clientEmail;
  private String clientIceCreamFav;
  private String clientFeedback;
  private int clientAge;

  // Constructor
  public Client () {
  }

  // Method for getting data from the user by keyboard with scanner
  public void getDataClient () {
    Scanner readKeyboard = new Scanner(System.in);

    System.out.println("Escribe tu nombre: ");
    clientName = readKeyboard.nextLine();

    System.out.println("Escribe tu telefono:");
    clientTel = readKeyboard.nextLine();

    System.out.println("Ingresa tu direccion:");
    clientDir = readKeyboard.nextLine();

    System.out.println("Ingresa tu cedula: ");
    clientId = readKeyboard.nextLine();

    System.out.println("Ingresa tu correo: ");
    clientEmail = readKeyboard.nextLine();

    System.out.println("Cual es tu helado favorito? ");
    clientIceCreamFav = readKeyboard.nextLine();

    System.out.println("Tienes algun comentario para nosotros? ");
    clientFeedback = readKeyboard.nextLine();

    System.out.println("¿Cual es tu edad? ");
    clientAge = readKeyboard.nextInt();
  }

  // Method for printing data from the user and show it on the console
  public void printDataClient () {
    System.out.println("Tu nombre es: " + clientName);
    System.out.println("tu telefono es: " + clientTel);
    System.out.println("Tu direccion es: " + clientDir);
    System.out.println("Tu cedula es: " + clientId);
    System.out.println("Tu correo electronico es: " + clientEmail);
    System.out.println("Tu edad es: " + clientAge);
    System.out.println("Super es uno de los más vendidos y deliciosos !! " + clientIceCreamFav);
    System.out.println("Gracias por tu comentario ! " + clientFeedback);
  }

}
