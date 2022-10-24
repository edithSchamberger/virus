package ar.edu.undef.fie.criticidad;

public class Media implements CriticidadStrategy{

    @Override
    public CriticidadStrategy recuperar() {
       return new Media();
    }
}
