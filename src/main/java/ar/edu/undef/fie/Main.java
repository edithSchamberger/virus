package ar.edu.undef.fie;

import ar.edu.undef.fie.criticidad.Baja;
import ar.edu.undef.fie.criticidad.CriticidadStrategy;

import java.util.ArrayList;
import java.util.List;

public class Main {

     public static void main(String[] String) {
        System.out.println("Hello world!");
        var antivirus= new Antivirus();

        //creo archivos
        var a= new Archivo(1);
        var b =new Archivo(2);
        var c= new Archivo(3);
        var d =new Archivo(4);
        var e= new Archivo(5);
        var f =new Archivo(6);

        //agrego a una lista
        var listaArchivos = new ArrayList<Archivo>();
        listaArchivos.add(a);
        listaArchivos.add(b);
        listaArchivos.add(c);
        listaArchivos.add(d);
        listaArchivos.add(e);
        listaArchivos.add(f);


        System.out.println("listaArchivos = " + listaArchivos);
          //asignar criticidad


        for (Archivo archivo: listaArchivos) {
           System.out.println(archivo);
           antivirus.asignarCriticidad(archivo);
        }


        for (Archivo archivo: listaArchivos) {
           archivo.ejecutarRecuperar();

        }


      //var criticidad= antivirus.analizarArchivo(a);
        //a.setCriticidad(criticidadBaja);
        //a.recuperar();
        //var listaArchivos = new ArrayList<Archivo>();

    }
}