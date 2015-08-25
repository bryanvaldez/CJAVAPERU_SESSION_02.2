package cjava.entidades;

import cjava.service.Animal;

public class Caballo implements Animal{

    @Override
    public String pedirAyuda() {
        return "relicha";
    }
    
}
