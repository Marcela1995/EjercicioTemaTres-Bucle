package ejercicio.cuatro.clase;

public class SmartWatch extends SmartDevice {

    protected String conectividad;

    public SmartWatch() {
    }

    public SmartWatch(String modelo, String marca, String procesador, String memoriaRAM, String sistemaOperativo, int pasos, String conectividad) {
        super(modelo, marca, procesador, memoriaRAM, sistemaOperativo, pasos);
        this.conectividad = conectividad;
    }

    public SmartWatch(String conectividad) {
        this.conectividad = conectividad;
    }

    public String getConectividad() {
        return conectividad;
    }

    public void setConectividad(String conectividad) {
        this.conectividad = conectividad;
    }

    public void verNotificaciones(String notificacion){
        System.out.println("Ver Notificaiciones RECIENTES" +notificacion);
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "conectividad='" + conectividad + '\'' +
                '}';
    }
}
