package ar.edu.undef.fie;

import ar.edu.undef.fie.criticidad.*;

import java.util.List;

public class Antivirus  {

    private List<CriticidadStrategy> listaCriticidad;

    public Antivirus() {
    }

    //public Antivirus(List<CriticidadStrategy> listaCriticidad) (){} el constructor no recibe nada por eso es vacios

    public void cargarListaCriticidad(){
        var nula = new Nula();
        var baja = new Baja();
        var media = new Media();
        var alta = new Alta();
        var severa = new Severa();

        listaCriticidad.add(nula);
        listaCriticidad.add(baja);
        listaCriticidad.add(media);
        listaCriticidad.add(alta);
        listaCriticidad.add(severa);
             
    }

    // analiza y otorga una criticidad aleatorea
    public void asignarCriticidad(Archivo archivo) {
        var nroRandom = Math.random() * 4;
        var criticidad = listaCriticidad.get((int) nroRandom);
        archivo.setCriticidad(criticidad);
    }


}
