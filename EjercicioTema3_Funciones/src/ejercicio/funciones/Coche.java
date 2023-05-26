package ejercicio.funciones;

public class Coche {

    private int numeroPuerta;

    public Coche(int numeroPuerta) {
        this.numeroPuerta = numeroPuerta;
    }

    public int getNumeroPuerta() {
        return numeroPuerta;
    }

    public void setNumeroPuerta(int numeroPuerta) {
        this.numeroPuerta = numeroPuerta;
    }

    public void incrementarPuerta() {
        numeroPuerta++;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "numeroPuerta=" + numeroPuerta +
                '}';
    }


    public static void main(String[] args) {
        Coche miCoche = new Coche(5);

        System.out.println("Numero de puerta: " + miCoche.getNumeroPuerta());
        miCoche.incrementarPuerta();
//        miCoche.incrementarPuerta();


        System.out.println("Numero de Puertas: " + miCoche.getNumeroPuerta());
    }


    public static class FuncionConParametros {


        public static void main(String[] args) {

            int numeroA = 50;
            int numeroB = 40;
            int impuesto = 50;
            int result = sumar(numeroA, numeroB, impuesto);
            System.out.println("la suma es: "+ result);

        

        }

        private static int sumar(int numeroA, int numeroB, int impuesto) {
         return (numeroA + numeroB+impuesto);
        }
    }
}

