package org.example;

public class Main {
  public static void main(String[] args) {

    Client client = new Client();
    IceCreamCategory iceCreamCategory = new IceCreamCategory();

    client.getDataClient();
    client.printDataClient();
    iceCreamCategory.printPriceHeladoSimple();
    iceCreamCategory.printCantidadHeladoSimple();

  }
}