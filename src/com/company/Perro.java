package com.company;

import java.util.ArrayList;

enum Raza {CANICHE, BULLDOG, PASTOR, BODEGUERO}

public class Perro {
    private int id;
    private String nombre;
    private boolean chapa;
    private String color;
    Raza raza1;
    private int edad;

    public Perro(int id, String nombre, boolean chapa, String color, Raza raza1, int edad) {

        this.id = id;
        this.nombre = nombre;
        this.chapa = chapa;
        this.color = color;
        this.raza1 = raza1;
        this.edad = edad;
    }


    public static void crearPerros(ArrayList<Perro> listaPerro){

        listaPerro.add(new Perro(31,"Perrito1",false,"blanco",Raza.BODEGUERO,5));
        listaPerro.add(new Perro(02,"Perrito2",true,"blanco",Raza.BULLDOG,3));
        listaPerro.add(new Perro(03,"Perrito3",true,"gris",Raza.PASTOR,1));
        listaPerro.add(new Perro(04,"Perrito4",false,"marron",Raza.CANICHE,9));
    }



    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean getChapa() {
        return chapa;
    }

    public String getColor() {
        return color;
    }

    public Raza getRaza1() {
        return raza1;
    }

    public int getEdad() {
        return edad;
    }
}
