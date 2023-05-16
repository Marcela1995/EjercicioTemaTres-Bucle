package ejercicio.cuatro.clase;


import java.util.Date;

/**
 * CLASE PADRE
 */
public class SmartDevice {

    protected String modelo;
    protected String marca;
    protected String procesador;
    protected String memoriaRAM;
    protected String sistemaOperativo;

    protected int pasos=0;

    /**
     * Constructor vacio
     */
    public SmartDevice() {
    }

    /**
     * Constructor con parametros
     * @param modelo
     * @param marca
     * @param procesador
     * @param memoriaRAM
     * @param sistemaOperativo
     */
    public SmartDevice(String modelo, String marca, String procesador, String memoriaRAM, String sistemaOperativo, int pasos) {
        this.modelo = modelo;
        this.marca = marca;
        this.procesador = procesador;
        this.memoriaRAM = memoriaRAM;
        this.sistemaOperativo = sistemaOperativo;
        this.pasos = pasos;
    }

    /**
     * Metodos GET y SET
     * @return
     */
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(String memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public int getPasos() {
        return pasos;
    }

    public void setPasos(int pasos) {
        this.pasos = pasos;
    }

    public void cantarPasos(int contar) {
        pasos += contar;


    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", procesador='" + procesador + '\'' +
                ", memoriaRAM='" + memoriaRAM + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", pasos=" + pasos +
                '}';
    }
}
