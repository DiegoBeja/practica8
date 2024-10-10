public class Sensor extends ComponenteElectronico{
    protected String tipo;
    protected String unidadDeMedida;
    protected int valor;

    public Sensor(String fabricante, String numeroSerie, String marca, String nombre, float costo, DispositivoElectronico esParteDe, String tipo, String unidadDeMedida, int valor) {
        super(fabricante, numeroSerie, marca, nombre, costo, esParteDe);
        this.tipo = tipo;
        this.unidadDeMedida = unidadDeMedida;
        this.valor = valor;
    }

    public String getTipo(){
        return tipo;
    }

    public String getUnidadDeMedida(){
        return unidadDeMedida;
    }

    public int getValor(){
        return valor;
    }

    @Override
    public String toString() {
        return "Sensor{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", unidadDeMedida='" + unidadDeMedida + '\'' +
                ", valor=" + valor +
                ", esParteDe=" + (esParteDe != null ? esParteDe.getNombre() : "N/A") +
                '}';
    }
}
