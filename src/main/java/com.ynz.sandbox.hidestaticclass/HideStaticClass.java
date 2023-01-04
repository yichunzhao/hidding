package com.ynz.sandbox.hidestaticclass;

public class HideStaticClass {

  public static void main(String[] args) {
    System.out.println("add a line");

    new ClientModule.Offset();
    new StandardClientModule.Offset();
  }
}
