package org.example;

import java.util.Scanner;

public class llamar_clase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Datos de los jugadores: ");

        System.out.println("Ingrese el nombre del avatar para el Jugador 1: ");
        String avatar1 = scanner.nextLine();
        System.out.println("Ingrese la edad del Jugador 1: ");
        int edad1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el país del Jugador 1: ");
        String pais1 = scanner.nextLine();

        Jugador jugador1 = new Jugador(avatar1, edad1, pais1);
        jugador1.patear();
        jugador1.correr();

        System.out.println("Ingrese el nombre del avatar para el Jugador 2: ");
        String avatar2 = scanner.nextLine();
        System.out.println("Ingrese la edad del Jugador 2: ");
        int edad2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el país del Jugador 2: ");
        String pais2 = scanner.nextLine();

        Jugador jugador2 = new Jugador(avatar2, edad2, pais2);
        jugador2.patear();
        jugador2.correr();
        System.out.println("Ingrese el número de saltos del Jugador 2: ");
        int saltos = scanner.nextInt();
        jugador2.saltar(saltos);
        scanner.close();
    }
}
