package week_7.practicaFinal;

public class Simple extends Unidad{
    private Integer cantPersonas;
    private Double costoPorPersona;

    public Simple(String nombre, String descripcion, Integer cantPersonas, Double costoPorPersona) {
        super(nombre, descripcion);
        this.cantPersonas = cantPersonas;
        this.costoPorPersona = costoPorPersona;
    }

    @Override
    public Double calcularCosto(){
        if(this.cantPersonas>10){
            return this.costoPorPersona*this.cantPersonas*1.2;
        }
        return this.costoPorPersona*this.cantPersonas;

    }
    @Override

    public void mostrar(){
        System.out.println("Cantidad de personas: " + this.cantPersonas);
        System.out.println("Costo por persona: " + this.costoPorPersona);
    }

}
