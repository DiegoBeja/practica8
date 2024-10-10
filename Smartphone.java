public class Smartphone extends DispositivoElectronicoDeConsumo{
    protected Sensor sensorDeHuella;
    protected Pantalla pantalla;

    public Smartphone(String fabricante, String numeroSerie, String marca, String nombre, float costo, boolean encendido, Sensor sensorDeHuella, Pantalla pantalla) {
        super(fabricante, numeroSerie, marca, nombre, costo, encendido);
        this.sensorDeHuella = sensorDeHuella;
        this.pantalla = pantalla;
    }


    public Sensor getSensorDeHuella(){
        return sensorDeHuella;
    }

    public Pantalla getPantalla(){
        return pantalla;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", pantalla=" + pantalla.getNombre() +  // Mostrar el nombre de la pantalla
                ", sensorDeHuella=" + (sensorDeHuella != null ? sensorDeHuella.getNombre() : "N/A") +  // Mostrar el nombre del sensor
                ", encendido=" + encendido +
                '}';
    }
}
