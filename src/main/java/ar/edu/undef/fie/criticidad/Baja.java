package ar.edu.undef.fie.criticidad;

public class Baja  implements CriticidadStrategy{

    @Override
    public CriticidadStrategy recuperar() {
        return new Baja();
    }
}
