package com.company;

import java.io.RandomAccessFile;
import java.util.ArrayList;

import static com.company.Perro.crearPerros;

public class Main {

    public static void main(String[] args) {

        ArrayList<Perro> listaperro = new ArrayList<>();
        crearPerros(listaperro);
        RandomAccessFile ra = null;

        try {

            ra = new RandomAccessFile("Perros.dat", "rw");

            for (Perro p : listaperro) {
                ra.writeInt(p.getId());

                StringBuffer sbNombre = new StringBuffer(p.getNombre());
                sbNombre.setLength(10);
                ra.writeChars(sbNombre.toString());

                ra.writeBoolean(p.getChapa());

                StringBuffer sbColor = new StringBuffer(p.getColor());
                sbColor.setLength(10);
                ra.writeChars(sbColor.toString());

                StringBuffer sbRaza = new StringBuffer(String.valueOf(p.getRaza1()));
                sbRaza.setLength(10);
                ra.writeChars(sbRaza.toString());

                ra.writeInt(p.getEdad());
            }
            ra.seek(69);

            System.out.println(ra.readInt());

            String nombre = "";
            for (int i = 0; i < 10; i++) {
                nombre += ra.readChar();
            }
            System.out.println(nombre);

            System.out.println(ra.readBoolean());

            String nombre2 = "";
            for (int i = 0; i < 10; i++) {
                nombre2 += ra.readChar();
            }
            System.out.println(nombre2);

            String nombre3 = "";
            for (int i = 0; i < 10; i++) {
                nombre3 += ra.readChar();
            }
            System.out.println(nombre3);

            System.out.println(ra.readInt());

        } catch (Exception e) {

        }
    }


}
