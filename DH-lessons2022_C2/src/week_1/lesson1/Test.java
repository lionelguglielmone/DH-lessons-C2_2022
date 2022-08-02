package week_1.lesson1;

public class Test {
    public static void main(String[] args) {

        //quiero guardar el nombre del caballo
        String nombreCaballo = "Braulio";
        //color del caballo
        String colorCaballo = "marron";
        Double loQueProduce = 1250.40;
        Double loQueConsume = 1550.40;

        String razaCaballo = "criollo";

        System.out.println("El granjero tiene un caballo " + razaCaballo +
                " de color " + colorCaballo + " llamado " + nombreCaballo +
                " que consume " + loQueProduce);
        System.out.println("El neto del caballo es " + (loQueProduce - loQueConsume) );

    }
}
