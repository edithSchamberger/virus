package ar.edu.undef.fie.criticidad;

import ar.edu.undef.fie.Archivo;

public class Alta  implements CriticidadStrategy{

    @Override
    public CriticidadStrategy recuperar() {
        return new Media() ;
    }
}
