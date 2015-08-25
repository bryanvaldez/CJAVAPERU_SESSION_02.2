package cjava.entidades;

import cjava.service.Animal;
import static cjava.utils.Util.*;

public class FabricaDeAnimales {
    public static Animal getAnimal(int tipo){
        Animal animal;
        switch(tipo){
            case PERRO: animal  = new Perro();break;
            case GATO: animal  = new Gato();break;
            case CABALLO: animal  = new Caballo();break;
            case CONEJO: animal  = new Conejo();break;
            default: animal = null;       
        }
        return animal;
    }
    
    
}
