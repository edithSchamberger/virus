package ar.edu.undef.fie.criticidad;

public class Severa implements CriticidadStrategy{

    @Override
    public CriticidadStrategy recuperar() {
        return new Baja();
    }
}
