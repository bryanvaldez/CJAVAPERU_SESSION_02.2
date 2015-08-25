package cjava.pruebas;

import cjava.entidades.FabricaDeAnimales;
import cjava.service.Animal;
import cjava.utils.Util;

public class Prueba02 {

    public static void main(String[] args) {
        Animal animal = FabricaDeAnimales.getAnimal(Util.OPT);
        System.out.println("mensaje: "+animal.pedirAyuda());
    }
    
}
