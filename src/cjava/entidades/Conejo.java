package cjava.entidades;

import cjava.service.Animal;

public class Conejo implements Animal{

    @Override
    public String pedirAyuda() {
        return "chilla";
    }
    
}
