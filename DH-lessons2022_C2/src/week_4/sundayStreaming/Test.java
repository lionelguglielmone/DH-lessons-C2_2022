package week_4.sundayStreaming;

public class Test {
    public static void main(String[] args) {
        Largometraje pelicula1 = new Largometraje("Top Gun", "ATP", 2);
        System.out.println("es ATP: " + pelicula1.esATP());

        pelicula1.promocionarPelicula();

        Cortometraje pelicula2 = new Cortometraje("INTERNACIONAL","El caramelo de cafe","ATP");
        System.out.println("es nacional: " + pelicula2.esNacional());
        pelicula2.esATP();
    }
}
