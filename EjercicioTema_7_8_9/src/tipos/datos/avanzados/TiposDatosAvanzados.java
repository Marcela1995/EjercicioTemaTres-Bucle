
package tipos.datos.avanzados;

import java.io.*;
import java.util.*;


public class TiposDatosAvanzados {

    /**
     * Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo",
     * debe retornar "odnum aloh".
     */


    public static String cadenaTexto(String cadena) {
        StringBuilder reversed = new StringBuilder(cadena);
        return reversed.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println("-----------------------Cadena Alreves--------------------------------");
        String cadena = "hola mundo";
        System.out.println(cadena);
        String cadenaAlReves = cadenaTexto(cadena);
        System.out.println(cadenaAlReves);
    }


    /**
     * 1. Crea un array unidimensional de Strings y recórrelo,
     * mostrando únicamente sus valores.
     */


    public static class ArrayUnidimensional {
        public static void main(String[] args) {
            System.out.println("----------1. Array Unidimensional------------ ");

            String[] nombre = {"Catalina", "John", "Diego", "Fausto"};
            for (String nombres : nombre) {

                System.out.println("El nombre es: " + nombres);

            }

        }
    }


    public static class Bidimensional {
        public static void main(String[] args) {

            /**
             * 2. Crea un array bidimensional de enteros y recórrelo, mostrando la posición
             * y el valor de cada elemento en ambas dimensiones.
             */

            System.out.println("------------------2. Bidimensional----------------------");


            String[][] bidimensional = new String[2][4];
            bidimensional[0][0] = "Deparamets Contabilidad";
            bidimensional[0][1] = "Deparameto Medico";
            bidimensional[0][2] = "Deparameto Sistemas";
            bidimensional[0][3] = "Deparameto Bienestar";

            bidimensional[1][0] = "Sebastian Siavy";
            bidimensional[1][1] = "Andrea Rubio";
            bidimensional[1][2] = "Braulio Castro";
            bidimensional[1][3] = "Daniel Orellana";


            for (
                    int i = 0;
                    i < bidimensional.length; i++) {
                System.out.println("Fila: " + i);

                for (int j = 0; j < bidimensional[1].length; j++) {
                    System.out.println("Fila" + i + "Columnas " + j);
                    System.out.println("\nNombre: " + bidimensional[i][j]);
                }
            }


        }


        public static class Vectores {


            public static void main(String[] args) {
                /**
                 * Crea un Vector del tipo de dato que prefieras, y añádele 5 elementos.
                 * Elimina el 2o y 3er elemento y muestra el resultado final
                 */

                System.out.println("-------------3. Vector----------------");

                Vector<String> result = new Vector(128);
                result.add("Juan");
                result.add("Paco");
                result.add("Pedro");
                result.add("Victoria");
                result.add("Sophia");

                for (int i = 0; i < result.size(); i++) {
                    System.out.println(result.get(i));

                }

                for (int i = 0; i < result.size() - 1; i++) {

                    result.remove("Pedro");
                    result.remove("Paco");
                }
                System.out.println("Resultado Final : " + result);

                /**
                 *Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos
                 *1000 elementos para ser añadidos al mismo.
                 *
                 */
                System.out.println("\n---------- \n 4. Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos\n" +
                        " 1000 elementos para ser añadidos al mismo\n-------------");

                System.out.println("Al agregar 1000 elementos a un vector de capacidad estándar puede requerir cambiar\n" +
                        "el tamaño del vector varias veces, lo que da como resultado varias asignaciones de memoria y copias.\n" +
                        "Esto puede ser un proceso costoso de tiempo de ejecución,");

            }


        }

        /**
         * Crea un ArrayList de tipo String, con 4 elementos.
         * Cópialo en una LinkedList.
         * Recorre ambos mostrando únicamente el valor de cada elemento.
         */

        public static class LinkedLista {
            public static void main(String[] args) {
                System.out.println("----------------5. ArrayList y LinkedList ----------------");
                ArrayList<String> list = new ArrayList<>();
                list.add("Vladimir");
                list.add("America");
                list.add("Taka");
                list.add("Matzuda");


                LinkedList<String> list2 = new LinkedList<>(list);

                System.out.println("Elementos del ArrayList:");
                for (String objeto : list) {
                    System.out.println(objeto);
                }

                System.out.println("\nElementos de LinkedList:");
                for (String objeto : list2) {
                    System.out.println(objeto);
                }


            }

        }
    }

    /**
     * Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
     * A continuación, con otro bucle, recórrelo y elimina los numeros pares.
     * Por último, vuelve a recorrerlo y muestra el ArrayList final.
     * Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
     */
    public static class ArrayTipoInt {
        public static void main(String[] args) {
            System.out.println("-------------------- Array tipo Int--------------------");

            ArrayList<Integer> lista = new ArrayList<Integer>();

            for (int i = 1; i <= 10; i++) {
                lista.add(i);

            }

            Iterator<Integer> iteracion = lista.iterator();
            while (iteracion.hasNext()) {
                int numero = iteracion.next();
                if (numero % 2 == 0) {
                    iteracion.remove();

                }
            }
            for (int valor : lista) {
                System.out.println("ArrayList Final: " + valor);

            }

        }
    }

    /**
     * Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo
     * ArithmeticException que será capturada por su llamante (desde "main", por ejemplo). Si se dispara
     * la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".
     */

    public static class division {

        public static void main(String[] args) {
            System.out.println("--------------------7. Division para cero--------------------");
            try {
                DivididoPorCero();
            } catch (ArithmeticException e) {
                System.out.println("Excepción capturada: " + e.getMessage());
            } finally {
                System.out.println("Demo de codigo");
            }
        }


        public static void DivididoPorCero() throws ArithmeticException {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese el dividendo: ");
            double numeroA = scanner.nextInt();

            System.out.print("Ingrese el divisor: ");
            double numeroB = scanner.nextInt();

            if (numeroB == 0) {
                throw new ArithmeticException("Esto no puede hacerse.");
            }

            double resultado = numeroA / numeroB;
            System.out.println("El resultado de la división es: " + resultado);
        }
    }

    /**
     * 8. Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros:
     * "fileIn" y "fileOut". La tarea de la función será realizar la copia del fichero dado
     * en el parámetro "fileIn" al fichero dado en "fileOut"
     */

    public static class InputPrintStream {
        public static void main(String[] args) {

            System.out.println("");
            String fileIn = "C:/Users/crist/Documents/BootCamp/passwd.txt";
            String fileOut = "C:/Users/crist/Documents/BootCamp/destino.txt";

            try {
                copiarArchivo(fileIn, fileOut);
                System.out.println("Copia de archivo realizada ok!.");
            } catch (IOException e) {
                System.out.println("Error al copiar el archivo: " + e.getMessage());
            }
        }

        public static void copiarArchivo(String fileIn, String fileOut) throws IOException {
            try (
                    InputStream inputStream = new FileInputStream(fileIn);
                    OutputStream outputStream = new FileOutputStream(fileOut);
                    PrintStream printStream = new PrintStream(outputStream)) {

                byte[] buffer = new byte[1024];
                int bytesRead;

                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                }
            }
        }
    }


    /**
     * Sorpréndenos creando un programa de tu elección que utilice InputStream,
     * PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.
     */
    public static class DatosPersona {


        public static void main(String[] args) {

            System.out.println("-----------------HashMap -ArrayList - LinkedList InputPrintStream ----------------------");
            try {
                // Objeto InputStream para leer desde la entrada estándar (teclado)
                InputStream inputStream = System.in;
                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

                // Objeto PrintStream para imprimir en la salida estándar (consola)
                PrintStream printStream = System.out;

                //HashMap para almacenar pares de clave-valor
                HashMap<String, Integer> hashMap = new HashMap<>();

                //ArrayList para almacenar elementos
                ArrayList<String> arrayList = new ArrayList<>();

                //LinkedList para almacenar elementos
                LinkedList<Integer> linkedList = new LinkedList<>();

                // Lee una cadena de texto desde la entrada
                printStream.println("Escribe tu nombre y apellido:");
                String texto = reader.readLine();

                // Agregar la cadena de texto al ArrayList
                arrayList.add(texto);

                // Leer un número entero desde la entrada estándar
                printStream.println("Cuántos años tienes?: ");
                int numero = Integer.parseInt(reader.readLine());

                // Agregar el número entero al LinkedList
                linkedList.add(numero);

                // Agregar un par clave-valor al HashMap
                hashMap.put(texto, numero);

                // Imprimir el contenido del ArrayList
                printStream.println("Contenido del ArrayList:");
                for (String elemento : arrayList) {
                    printStream.println(elemento);
                }

                // Imprime el contenido del LinkedList
                printStream.println("Contenido del LinkedList:");
                for (Integer elemento : linkedList) {
                    printStream.println(elemento);
                }

                // Imprime el contenido del HashMap
                printStream.println("Contenido del HashMap:");
                for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
                    printStream.println(entry.getKey() + ": " + entry.getValue());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}





