package ejercicio.cuatro.clase;

/**
 * CLASE HIJA
 */
public class SmartPhone  extends SmartDevice{

    protected  String numeroTelefono;

    public SmartPhone(){

    }

    public SmartPhone(String modelo, String marca, String procesador, String memoriaRAM, String sistemaOperativo, int pasos, String numeroTelefono) {
        super(modelo, marca, procesador, memoriaRAM, sistemaOperativo, pasos);
        this.numeroTelefono = numeroTelefono;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    /**
     * METODOS
     * @return
     */
    public void enviarMensaje(String numero, String texto){
        System.out.println("Enviando mensaje al numero: " + numero+ "---> "  + texto);


    }

    @Override


    public String toString() {
        return "SmartPhone{" +
                "numeroTelefono='" + numeroTelefono + '\'' +
                '}';
    }
}
