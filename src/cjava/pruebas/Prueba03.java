package cjava.pruebas;

import cjava.entidades.AnimalsFactory;
import cjava.service.Animal;
import cjava.utils.Util;

public class Prueba03 {

    public static void main(String[] args) {
        AnimalsFactory fabrica = AnimalsFactory.getInstance();
        Animal animal = fabrica.getAnimal(Util.OPT);
        System.out.println("Mensaje: "+animal.pedirAyuda());
    }
    
}
