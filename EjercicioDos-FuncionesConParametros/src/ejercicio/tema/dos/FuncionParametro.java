package ejercicio.tema.dos;

/**
 * @author Zhagüi"
 */
public class FuncionParametro {

    public static void main(String[] args) {

        double precioProducto = 12.30d;
        int cantidadProducto = 10;

        double precioIVA = getPrecioProducto(precioProducto, cantidadProducto);
        System.out.println(precioIVA);

        double precioTotal = precioIVA + (precioProducto * cantidadProducto);
        System.out.println(precioTotal);


    }

    /**
     *
     * @param precioProducto
     * @param cantidadProducto
     * @return retorna el valor del iva que se almacena
     *         en la variables precioIVA
     */

    static double getPrecioProducto(double precioProducto, int cantidadProducto) {

        return (precioProducto * cantidadProducto) * 0.12;

    }
}
