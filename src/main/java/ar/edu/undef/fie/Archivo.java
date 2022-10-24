package ar.edu.undef.fie;

import ar.edu.undef.fie.criticidad.CriticidadStrategy;

public class Archivo {
    private Integer id;
    CriticidadStrategy criticidad ;
    private Boolean recuperado;

    private Boolean borrado;

    public Archivo(Integer id) {
        this.id = id;
        this.recuperado = false;
        this.borrado = false;
    }


/*

    public static ArrayList<Archivo> recuperar (ArrayList<Archivo> listaFiltrar){
        var listaFiltrada = new ArrayList<Archivo>();
        listaFiltrada = listaFiltrar
                .stream()
                .filter(archivo -> archivo.getCriticidad().equals());
        return listaFiltrada;
    }

*/




    //*ejecutar recupere*/
    public void ejecutarRecuperar(){

        this.criticidad = criticidad.recuperar();
    };


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CriticidadStrategy getCriticidad() {
        return criticidad;
    }

    public void setCriticidad(CriticidadStrategy criticidad) {
        this.criticidad = criticidad;
    }

    public Boolean getRecuperado() {
        return recuperado;
    }

    public void setRecuperado(Boolean recuperado) {
        this.recuperado = recuperado;
    }

    public Boolean getBorrado() {
        return borrado;
    }

    public void setBorrado(Boolean borrado) {
        this.borrado = borrado;
    }
}
