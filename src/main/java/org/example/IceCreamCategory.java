package org.example;

import org.w3c.dom.ls.LSOutput;

public class IceCreamCategory {

  // Precio de los helados por su categoría
  private double heladoSimple = 12.00;
  private double heladoDoble = 23.00;
  private double heladoEspecial = 8.00;

  // Cantidad de helados por su categoría
  private int cantidadHeladoSimple = 15;
  private int cantidadHeladoDoble = 20;
  private int cantidadHeladoEspecial = 10;

  // Constructor
  public IceCreamCategory() {
  }

  // Getters
  public double getPriceHeladoSimple() {
    return heladoSimple;
  }

  public double getPriceHeladoDoble() {
    return heladoDoble;
  }

  public double getPriceHeladoEspecial() {
    return heladoEspecial;
  }

  public int getCantidadHeladoSimple() {
    return cantidadHeladoSimple;
  }

  public int getCantidadHeladoDoble() {
    return cantidadHeladoDoble;
  }

  public int getCantidadHeladoEspecial() {
    return cantidadHeladoEspecial;
  }

  // Method for printing the price of an ice cream
  public void printPriceHeladoSimple() {
    System.out.println("El precio de un helado simple es: " + heladoSimple);
  }

  // Method for printing the quantity of ice cream
  public void printCantidadHeladoSimple() {
    System.out.println("La cantidad de helados simple es: " + cantidadHeladoSimple);
  }

}
