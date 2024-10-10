public class Microprocesador extends ComponenteElectronico{
    protected int cacheRAM;
    protected long velocidadHz;

    public Microprocesador(String fabricante, String numeroSerie, String marca, String nombre, float costo, DispositivoElectronico esParteDe, int cacheRam, long velocidadHz) {
        super(fabricante, numeroSerie, marca, nombre, costo, esParteDe);
        this.cacheRAM = cacheRam;
        this.velocidadHz = velocidadHz;
    }

    public int getCacheRAM(){
        return cacheRAM;
    }

    public long getVelocidadHz(){
        return velocidadHz;
    }

    @Override
    public String toString() {
        return "Microprocesador{" +
                "nombre='" + nombre + '\'' +
                ", cacheRam=" + cacheRAM + " MB" +
                ", velocidadHz=" + velocidadHz + " Hz" +
                ", esParteDe=" + (esParteDe != null ? esParteDe.getNombre() : "N/A") +
                '}';
    }
}
