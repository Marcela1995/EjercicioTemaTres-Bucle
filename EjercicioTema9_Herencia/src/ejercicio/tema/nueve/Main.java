package ejercicio.tema.nueve;

public class Main {
    public static void main(String[] args) {
       System.out.println("------------\n Clase Cliente\n----------------");

     Cliente cliente = new Cliente();
        cliente.setEdad(20);
        cliente.setNombre("Monserrat");
        cliente.setTelefono("0959042121");
        cliente.setCredito(500.20);

        System.out.println(cliente.getEdad());
        System.out.println(cliente.getNombre());
        System.out.println(cliente.getTelefono());
        System.out.println("credito: "+cliente.getCredito());

       System.out.println("------------\n Clase Trabajador\n----------------");
        Trabajador persona = new Trabajador();
        persona.setEdad(20);
        persona.setNombre("Sebastian");
        persona.setTelefono("0959041221");
        persona.setSalario(162.99);


        System.out.println(persona.getEdad());
        System.out.println(persona.getNombre());
        System.out.println(persona.getTelefono());
        System.out.println("Salario: "+persona.getSalario());


    }
}