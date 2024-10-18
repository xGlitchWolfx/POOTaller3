package org.example;

import java.util.Scanner;

public class Jugador {

    String avatar;
    int edad;
    String pais;

    public Jugador(String avatar, int edad, String pais) {
        this.avatar = avatar;
        this.edad = edad;
        this.pais = pais;
    }

    public Jugador() {
    }

    public void patear() {
        System.out.println("Nombre del avatar: " + avatar);
        System.out.println("Edad: " + edad);
        System.out.println("Pais: " + pais);
        System.out.println("El jugador pateó.");
    }

    public void correr() {
        System.out.println("El jugador corrió.");
    }

    public void saltar(int s) {
        int saltos = 2 + s;
        System.out.println("El jugador saltó.");
        System.out.println("No saltos: " + saltos);
    }
}