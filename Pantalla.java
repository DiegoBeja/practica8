public class Pantalla  extends ComponenteElectronico{
    protected int resolucionX;
    protected int resolucionY;

    public Pantalla(String fabricante, String numeroSerie, String marca, String nombre, float costo, DispositivoElectronico esParteDe, int resolucionX, int resolucionY) {
        super(fabricante, numeroSerie, marca, nombre, costo, esParteDe);
        this.resolucionX = resolucionX;
        this.resolucionY = resolucionY;
    }

    public int getResolucionX(){
        return resolucionX;
    }

    public int getResolucionY(){
        return resolucionY;
    }

    @Override
    public String toString() {
        return "Pantalla{" +
                "nombre='" + nombre + '\'' +
                ", resolucionX=" + resolucionX +
                ", resolucionY=" + resolucionY +
                ", esParteDe=" + (esParteDe != null ? esParteDe.getNombre() : "N/A") +
                '}';
    }
}
