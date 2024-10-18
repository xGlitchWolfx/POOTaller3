package org.example;

class PersonaPrivada {
    private String nombre;
    private int edad;
    private double altura;

    public PersonaPrivada(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
    }

    public boolean esMayorDeEdad() {
        return edad > 18;
    }
}

class PersonaPublica {
    public String direccion;
    public String telefono;
    public String email;

    private void cambiarDireccion(String nuevaDireccion) {
        this.direccion = nuevaDireccion;
    }

    private void mostrarTelefono() {
        System.out.println("Teléfono: " + telefono);
    }

    public void mostrarDatosPublicos() {
        System.out.println("Dirección: " + direccion);
        mostrarTelefono();
    }
}

public class tarea {
    public static void main(String[] args) {
        // Instanciar PersonaPrivada
        PersonaPrivada personaPrivada = new PersonaPrivada("Pedrito", 25, 1.75);
        personaPrivada.mostrarDatos();
        System.out.println("¿Es mayor de edad? " + personaPrivada.esMayorDeEdad());

        // Instanciar PersonaPublica
        PersonaPublica personaPublica = new PersonaPublica();
        personaPublica.direccion = "El pedestal 155";
        personaPublica.telefono = "0999888777";
        personaPublica.email = "PedritoAlcachofa55555";
        personaPublica.mostrarDatosPublicos();
    }
}
