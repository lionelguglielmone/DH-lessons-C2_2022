package week_8.lesson2;

public class Curso extends OfertaAcademica{

    private Integer cargaHorariaMensual;
    private Integer cantMeses;
    private Double costoHora;

    public Curso(String nombre, Integer cargaHorariaMensual, Integer cantMeses, Double costoHora) {
        super(nombre);
        this.cargaHorariaMensual = cargaHorariaMensual;
        this.cantMeses = cantMeses;
        this.costoHora = costoHora;
    }

    @Override
    public Double obtenerCosto() {
        return this.costoHora*this.cantMeses*this.cargaHorariaMensual;
    }
}
