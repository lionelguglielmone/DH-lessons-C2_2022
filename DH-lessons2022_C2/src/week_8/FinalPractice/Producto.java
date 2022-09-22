package week_8.FinalPractice;

public abstract class Producto {
    private String qr;
    private String detalle;

    public Producto(String qr, String detalle) {
        this.qr = qr;
        this.detalle = detalle;
    }

    public abstract Double obtenerPrecio();

    public String getQr() {
        return qr;
    }

    public void setQr(String qr) {
        this.qr = qr;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
}
