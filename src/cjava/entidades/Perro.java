package cjava.entidades;

import cjava.service.Animal;
import cjava.service.AnimalAbstract;

public class Perro extends AnimalAbstract implements Animal{
    //sobrescrito
    @Override
    public String pedirAyuda() {
        return "ladra";
    }
//    public int m1(){
//        return 4;
//    }
    @Override
    public int m2(){
        return 3;
    }

    
}
