package week_8.lesson2;

public class Test {
    public static void main(String[] args) {

        Instituto ins = new Instituto();

        OfertaAcademicaFactory oaf = OfertaAcademicaFactory.getInstance();
        OfertaAcademica oa1 = oaf.construir("frontend");
        OfertaAcademica oa2 = oaf.construir("backend");
        OfertaAcademica oa3 = oaf.construir("fullstack");

        ins.agregarOfertasVigentes(oa1);
        ins.agregarOfertasVigentes(oa2);
        ins.agregarOfertasVigentes(oa3);

        ins.generarInforme();


    }
}
