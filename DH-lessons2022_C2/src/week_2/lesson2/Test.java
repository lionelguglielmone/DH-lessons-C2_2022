package week_2.lesson2;

public class Test {

    public static void main(String[] args) {
        TarjetaDeDebito tarjetaDeMargarita = new TarjetaDeDebito("Margarita");
        TarjetaDeDebito tarjetaDeJonatan = new TarjetaDeDebito("Jonatan");

        TarjetaDeDebito tarjetaDeCamila = new TarjetaDeDebito("Camila","123456789");

        TarjetaDeDebito tarjetaDeCarlo = new TarjetaDeDebito("Carlo");

        System.out.println(tarjetaDeCamila.getNumeroTarjeta());

        tarjetaDeJonatan.setEstaListaParaUso(false);
        System.out.println("estado tarjeta de " + tarjetaDeJonatan.getNombreTitular() +
                ": " + tarjetaDeJonatan.getEstaListaParaUso());
        tarjetaDeJonatan.setSaldo(500.0);
        tarjetaDeJonatan.pagar(700.0);
    }
}
