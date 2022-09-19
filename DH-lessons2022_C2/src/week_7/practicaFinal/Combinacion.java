package week_7.practicaFinal;

import java.util.ArrayList;

public class Combinacion extends Unidad{
    private Double coeficienteGlobal;
    private Double costoMateriales;
    private ArrayList<Unidad> unidadesIncluidas;

    public Combinacion(String nombre, String descripcion, Double coeficienteGlobal, Double costoMateriales) {
        super(nombre, descripcion);
        this.coeficienteGlobal = coeficienteGlobal;
        this.costoMateriales = costoMateriales;
        this.unidadesIncluidas = new ArrayList<>();
    }

    public void agregarUnidad(Unidad u){
        this.unidadesIncluidas.add(u);
    }
    @Override
    public Double calcularCosto(){
        Double costoUnidadesSimples = 0.0;
        for(Unidad u : this.unidadesIncluidas){
            costoUnidadesSimples += u.calcularCosto();
        }
        Double costoUnidadesSimpleConRecargo = costoUnidadesSimples*this.coeficienteGlobal;
        Double costoTotal = costoUnidadesSimpleConRecargo + this.costoMateriales;
        return costoTotal;
    }

    @Override
    public void mostrar(){
        Double costoUnidadesSimples = 0.0;
        for(Unidad u : this.unidadesIncluidas){
            costoUnidadesSimples += u.calcularCosto();
        }
        System.out.println("Costo total de combinacion: " + costoUnidadesSimples);
        System.out.println("Costo final: " + costoUnidadesSimples*this.coeficienteGlobal);
    }
}
