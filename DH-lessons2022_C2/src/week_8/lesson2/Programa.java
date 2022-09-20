package week_8.lesson2;

import java.util.ArrayList;

public class Programa extends OfertaAcademica{

    private ArrayList<OfertaAcademica> cursos;
    private Double porcentajeBonificacion;

    public Programa(String nombre, Double porcentajeBonificacion) {
        super(nombre);
        this.porcentajeBonificacion = porcentajeBonificacion;
        this.cursos = new ArrayList<>();
    }

    @Override
    public Double obtenerCosto() {
        Double costoProgramaSinDesc = 0.0;
        for(OfertaAcademica oa : this.cursos){
            costoProgramaSinDesc += oa.obtenerCosto();
        }
        Double costoProgramaConDesc = costoProgramaSinDesc*(1-this.porcentajeBonificacion);
        return costoProgramaConDesc;
    }

    public void agregarCurso(OfertaAcademica oa){
        this.cursos.add(oa);
    }
}
