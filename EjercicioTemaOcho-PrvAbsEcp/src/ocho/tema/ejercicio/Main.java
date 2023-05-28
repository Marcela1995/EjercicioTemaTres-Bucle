package ocho.tema.ejercicio;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
     Persona persona = new Persona();

     persona.setEdad(29);
     persona.setNombre("Marcela");
     persona.setTelefono("0959041777");

        System.out.println("Tu edad es: "+persona.getEdad());
        System.out.println("Tu nombre es: "+persona.getNombre());
        System.out.println("Telefono es: "+persona.getTelefono());
    }
}