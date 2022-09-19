package week_7.practicaFinal;

import java.util.ArrayList;

public class Empresa {

    private ArrayList<Unidad> catalogoDeUnidades;
/*
    public Empresa() {
        this.catalogoDeUnidades = new ArrayList<>();
    }*/

    public void agregarNuevaUnidad(Unidad u){
        if(this.catalogoDeUnidades == null){
            this.catalogoDeUnidades = new ArrayList<>();
        }
        this.catalogoDeUnidades.add(u);
    }
}
