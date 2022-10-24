package ar.edu.undef.fie.criticidad;

public class Nula implements CriticidadStrategy{

    @Override
    public CriticidadStrategy recuperar() {
        return new Nula();
    }
}


