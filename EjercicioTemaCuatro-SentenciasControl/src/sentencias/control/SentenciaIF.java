package sentencias.control;

/**
 * Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
 * Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
 */
public class SentenciaIF {

    public static void main(String[] args) {


        int numeroIF = 0;

        if (numeroIF > 0) {
//            numeroIF = numeroIF+1;
            System.out.println("es Positivo " + numeroIF);


        } else if (numeroIF < 0) {
            System.out.println("Es negativo");


        } else {
            System.out.println("es cero");
        }

    }

    /**
     * Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile
     * sea inferior a 3, el bloque de código que tendrá el bucle deberá:
     * Incrementar el valor de la variable en uno cada vez que se ejecute.
     * Mostrarlo por pantalla cada vez que se ejecute.
     */
    public static class SentenciaWhile {

        public static void main(String[] args) {
            int numeroWhile = -5;

            while (numeroWhile < 3) {
                System.out.println(numeroWhile);
                numeroWhile++;

            }
        }
    }

    /**
     * Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
     */
    public static class DoWhile {

        public static void main(String[] args) {

            int numeroIF = 0;

            do {
                System.out.println("Se ejecuta una vez");
                numeroIF++;

            } while (numeroIF < 0);
        }


    }

    /**
     * Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable
     * sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.
     */
    public static class SentenciaFor {
        public static void main(String[] args) {

            // int numeroFor = 0;

            for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
                System.out.println(numeroFor);
            }

        }

    }

    /**
     * Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año.
     * Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está.
     * También habrá que poner un default para cuando el valor de la variable no sea una estación.
     */
    public static class SentenciaSwitch {
        public static void main(String[] args) {
            String estacion = "primavera";


            switch (estacion) {
                case "verano":
                    System.out.println("Soy verano");
                    break;
                case "invierno":
                    System.out.println("Soy invierno");
                    break;

                case "otoño":
                    System.out.println("Soy otoño");
                    break;

                case "primavera":
                    System.out.println("Soy primavera");
                    break;

                default:
                    System.out.println("no encontrado");

            }
        }
    }
}
