package week_8.lesson2;

import java.util.ArrayList;

public class Instituto {
    private ArrayList<OfertaAcademica> cursos;

    public Instituto() {
        this.cursos = new ArrayList<>();
    }

    public void generarInforme(){

        for(OfertaAcademica oa: this.cursos){

            System.out.println("Nombre: " + oa.getNombre());
            System.out.println("Costo: " + oa.obtenerCosto());
        }
    }
    public void agregarOfertasVigentes(OfertaAcademica oa){
        this.cursos.add(oa);
    }
}
