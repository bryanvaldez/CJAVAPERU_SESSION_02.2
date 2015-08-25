package cjava.pruebas;

import cjava.entidades.Perro;
import cjava.service.Animal;

public class Prueba01 {
    static Animal animal;
    public static void main(String[] args) {
        //interface no se instancia
        //Animal animal = new Animal();
        animal = new Perro();
        System.out.println("mensaje: "+animal.pedirAyuda());
    }
    
}
