package cjava.entidades;

import cjava.service.Animal;
import static cjava.utils.Util.CABALLO;
import static cjava.utils.Util.CONEJO;
import static cjava.utils.Util.GATO;
import static cjava.utils.Util.PERRO;

public class AnimalsFactory {
    
    private AnimalsFactory() {
    }
    
    public static AnimalsFactory getInstance() {
        return AnimalsFactoryHolder.INSTANCE;
    }
    
    private static class AnimalsFactoryHolder {

        private static final AnimalsFactory INSTANCE = new AnimalsFactory();
    }
    public Animal getAnimal(int tipo){
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
