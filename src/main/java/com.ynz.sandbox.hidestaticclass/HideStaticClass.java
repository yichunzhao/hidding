package com.ynz.sandbox.hidestaticclass;

public class HideStaticClass {

    public static void main(String[] args) {
        ClientModule clientModule = new MyClientModule();
        ClientModule standardClientModule = new StandardClientModule();
        ClientModule myClientModule = new MyClientModule();

        new ClientModule.Offset();
        new StandardClientModule.Offset();
    }
}
