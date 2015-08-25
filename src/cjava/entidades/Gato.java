package cjava.entidades;

import cjava.service.Animal;

public class Gato implements Animal{

    @Override
    public String pedirAyuda() {
        return "maulla";
    }
    
}
