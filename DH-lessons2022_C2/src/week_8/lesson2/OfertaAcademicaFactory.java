package week_8.lesson2;

public class OfertaAcademicaFactory {
    private static OfertaAcademicaFactory oa = new OfertaAcademicaFactory();

    private OfertaAcademicaFactory(){
    }

    public static OfertaAcademicaFactory getInstance(){
        return oa;
    }

    public OfertaAcademica construir(String s){
        switch (s){
            case "frontend":
                Curso fe = new Curso("frontend",16,2,1000.0);
                return fe;
            case "backend":
                Curso be = new Curso("backend", 20, 2, 900.0);
                return be;
            case "fullstack":
                Programa fs = new Programa("fullstack",0.2);
                Curso fe1 = new Curso("frontend",16,2,1000.0);
                Curso be1 = new Curso("backend", 20, 2, 900.0);
                fs.agregarCurso(fe1);
                fs.agregarCurso(be1);
                return fs;
            /*case "fullstackPro":
                Programa fs1 = new Programa("fullstack",0.2);
                Curso fe2 = new Curso("frontend",16,2,1000.0);
                Curso be2 = new Curso("backend", 20, 2, 900.0);
                Curso bd = new Curso("base de datos", 20, 2, 900.0);

                fs1.agregarCurso(fe2);
                fs1.agregarCurso(be2);
                Programa fsp = new Programa("fullstack pro", 0.3);
                fsp.agregarCurso(fs1);
                fsp.agregarCurso(bd);
                return fsp;*/
            default:
                System.out.println("Inexistente");
                return null;
        }

    }



}
