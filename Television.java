public class Television extends DispositivoElectronicoDeConsumo{
    protected Pantalla pantalla;

    public Television(String fabricante, String numeroSerie, String marca, String nombre, float costo, boolean encendido, Pantalla pantalla) {
        super(fabricante, numeroSerie, marca, nombre, costo, encendido);
        this.pantalla = pantalla;  // Inicializa el atributo pantalla
    }

    public Pantalla getPantalla(){
        return pantalla;
    }

    @Override
    public String toString() {
        return "Television{" +
                "nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", pantalla=" + pantalla.getNombre() +  
                ", encendido=" + encendido +
                '}';
    }
}
