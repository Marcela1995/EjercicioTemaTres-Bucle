package ejercicio.cuatro.main;

import ejercicio.cuatro.clase.SmartDevice;
import ejercicio.cuatro.clase.SmartPhone;
import ejercicio.cuatro.clase.SmartWatch;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("--------------------------Instancia del Objeto SMARTPHONE----------------------------");
        SmartPhone smartPhone = new SmartPhone("Apple", "iPhone 1", "A15 Bionic","6GB","iOS",200, "1234567890");

        smartPhone.enviarMensaje("123456789", "HOLA como estas");
        System.out.println("MODELO: "+smartPhone.getModelo());
        System.out.println("MARCA:  "+smartPhone.getMarca());
        System.out.println("SO: "+smartPhone.getSistemaOperativo());
        System.out.println("PROCESADOR: "+smartPhone.getProcesador());
        System.out.println("MEMORIA RAM: "+smartPhone.getMemoriaRAM());
        System.out.println("Num Pasos: " +smartPhone.getPasos());
        System.out.println("TELEFONO: " +smartPhone.getNumeroTelefono());
        smartPhone.cantarPasos(100);


        System.out.println("--------------------------Instancia del Objeto SMARTWATCH----------------------------");
        SmartWatch smartWatch = new SmartWatch("Samsung Galaxy Watch Serie 3","Samsung Galaxy","Exynos 9110","1GB","Tizen",20,"BLUETOOTH" );

        smartWatch.verNotificaciones("Has recido 2 mensaje de la ESTACION DE RADIO");
        smartWatch.cantarPasos(20);
        System.out.println("MODELO: "+smartWatch.getModelo());
        System.out.println("MARCA:  "+smartWatch.getMarca());
        System.out.println("PROCESADOR: "+smartWatch.getProcesador());
        System.out.println("SO: "+smartWatch.getSistemaOperativo());
        System.out.println("MEMORIA RAM: "+smartWatch.getMemoriaRAM());
        System.out.println("NUM PASOS: "+smartWatch.getPasos());
        System.out.println("CONECTIVIDAD: "+smartWatch.getConectividad());


    }
}